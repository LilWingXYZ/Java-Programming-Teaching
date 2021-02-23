package ch10.part2;
// Mycanvas.java
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class Mycanvas extends Canvas {
	int r;
   Color c;
   public void setColor(Color c) {
  		 this.c=c;
   }	
   public void setR(int r) {
    	 this.r=r;
   }
   public void paint(Graphics g) {
    	g.setColor(c);
     	g.fillOval(0,0,2*r,2*r);
   }
   public int getR(){
    	return r;
   	}
}


//Planet.java

 class Planet extends Panel implements Runnable{
  	Thread moon;   //用Thread类声明一个moon对象
   	Mycanvas yellowBall; 
  	double pointX[]=new double[360], 
   	pointY[]=new double[360]; //用来表示画布左上角端点坐标的数组
  	int w=100,h=100;
  	 int radius=30;
  	 Planet(){
  		setSize(w,h); 
     	setLayout(null);
     	yellowBall=new Mycanvas();
     	yellowBall.setColor(Color.yellow);
     	add(yellowBall);
     	yellowBall.setSize(12,12);
    	 yellowBall.setR(12/2);
    	 pointX[0]=0;                
    	 pointY[0]=-radius;
   	  	double angle=1*Math.PI/180;   //刻度为1度  
     	for(int i=0;i<359;i++) {       //计算出数组中各个元素的值 
      		pointX[i+1]=pointX[i]*Math.cos(angle)-Math.sin(angle)*pointY[i];
      		pointY[i+1]=pointY[i]*Math.cos(angle)+pointX[i]*Math.sin(angle);
     	}
     	for(int i=0;i<360;i++) {              
     		pointX[i]=pointX[i]+w/2;    //坐标平移     
       		pointY[i]=pointY[i]+h/2;
     	}
     	yellowBall.setLocation((int)pointX[0]-yellowBall.getR(),
		(int)pointY[0]-yellowBall.getR());
    	moon=new Thread();//创建 moon线程，当前面板做为该线程的目标对象
   	}
  	public void start(){
     	try{  moon .start();
         }
      	catch(Exception exe){}
   	}
  	public void paint(Graphics g) {
    	g.setColor(Color.blue);
     	g.fillOval(w/2-9,h/2-9,18,18);
   	}
  public void run(){
    	int i=0;
     	while(true) {
       		i=(i+1)%360;
         	yellowBall.setLocation((int)pointX[i]-yellowBall.getR(),
			(int)pointY[i]-yellowBall.getR());
         	try{ Thread.sleep(10); // Thread类调用类方法sleep使得线程中断10豪秒
            }  
         	catch(InterruptedException e){}
      	}
   	}
}



// HaveThreadFrame.java


 class HaveThreadFrame extends Frame implements Runnable{
	Thread rotate;   //用Thread类声明一个rotate对象
   	Planet earth;
   	double pointX[]=new double[360], 
 	pointY[]=new double[360]; 
  	int width,height;
  	 int radius=120;
   	HaveThreadFrame(){
    	rotate=new Thread(this);
      	earth=new Planet();
      	setBounds(0,0,360,400);
      	width=getBounds().width;
     	height=getBounds().height;
      	pointX[0]=0;                
      	pointY[0]=-radius;
      	double angle=1*Math.PI/180;     
     	for(int i=0;i<359;i++)  {  
       		pointX[i+1]=pointX[i]*Math.cos(angle)-Math.sin(angle)*pointY[i];
        	pointY[i+1]=pointY[i]*Math.cos(angle)+pointX[i]*Math.sin(angle);
      	}
    	for(int i=0;i<360;i++)  {            
       		pointX[i]=pointX[i]+width/2;         
        	pointY[i]=pointY[i]+height/2;
     	 }
    	setLayout(null);
    	 setVisible(true);
    	 validate();
    	 addWindowListener(new WindowAdapter()
                        { public void windowClosing(WindowEvent e)
                           { System.exit(0);
                           }
                        }
                       );
     add(earth);
     earth.setLocation((int)pointX[0]-earth.getSize().width/2,
                           (int)pointY[0]-earth.getSize().height/2);
     earth.start(); 
    rotate.start();   //用rotate调用start方法
   }
  public void run(){
	int i=0;
	while(true) {
		i=(i+1)%360;
		earth.setLocation((int)pointX[i]-earth.getSize().width/2,
                               (int)pointY[i]-earth.getSize().height/2);
		try{ Thread.sleep(100);
            }  
         catch(InterruptedException e){}
      }
   }
  public void paint(Graphics g) {
   		g.setColor(Color.red);
     	g.fillOval(width/2-15,height/2-15,30,30);
	}
}
// ThreadRotateMainClass.java
public class ThreadRotateMainClass{
  	public static void main(String args[]){
   		new HaveThreadFrame();
	}
}

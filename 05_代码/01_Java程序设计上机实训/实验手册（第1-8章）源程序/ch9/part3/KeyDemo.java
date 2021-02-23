import java.awt.*;
 
import javax.swing.*;
 
import java.awt.event.*;
 
public class KeyDemo extends JFrame{
 
    MyPanel mp=null;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	KeyDemo test1=new KeyDemo();
 
    }
 
    public KeyDemo(){
         
        mp=new MyPanel();
         
        this.add(mp);
         
        this.addKeyListener(mp);
         
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
     
}
 
class MyPanel extends JPanel implements KeyListener
{
    int x=10;
    int y=10;
    //重写paint方法
    public void paint(Graphics g){
         
        super.paint(g);
         
        g.fillOval(x, y, 12, 12);
        //g.drawRect(50, 50, 10,5);
         
    }
 
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("被按下的是"+e.getKeyChar());
          
         
         
    }
 
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        if(e.getKeyCode()==KeyEvent.VK_UP){
            y-=10;
             
        }else if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y+=10;
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){
             
            x-=10;
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
             
            x+=10;
        }
        this.repaint();
         
    }
 
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
         
    }
     
}

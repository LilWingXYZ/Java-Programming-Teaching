package ch11.part1;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
public class ReadURLSource{
	public static void main(String args[]){
     	new NetWin();
   	}
}

class NetWin extends Frame implements ActionListener,Runnable{
	Button button;
   	URL url;
   	TextField text;
	TextArea area; 
   	byte b[]=new byte[118];
   	Thread thread;
   	NetWin(){
    	text=new TextField(20);
      	area=new TextArea(12,12);
      	button=new Button("确定");
      	button.addActionListener(this);
     	thread=new Thread(this);
      	Panel p=new Panel();
      	p.add(new Label("输入网址:"));
      	p.add(text); 
      	p.add(button);
      	add(area,BorderLayout.CENTER);
      	add(p,BorderLayout.NORTH);
      	setBounds(60,60,360,300);
      	setVisible(true);
      	validate();
      	addWindowListener(new WindowAdapter()
                      {   public void windowClosing(WindowEvent e)
                           { System.exit(0);
                           }
                      });
   }
   public void actionPerformed(ActionEvent e) {
   		if(!(thread.isAlive())) 
			thread=new Thread(this);
		try{
				thread.start();
         }
		catch(Exception ee) {
        	 text.setText("我正在读取"+url);
         }
   }
  public void run(){
	try {    
		int n=-1;
   		area.setText(null);
		String name=text.getText().trim();
        url=new URL(name);//使用字符串name创建url对象
       	String hostName=url.getHost(); //url调用getHost()
        int urlPortNumber=url.getPort();//url调用getPort() 
      	String fileName=url.getFile();//url调用getFile()
  		InputStream in=url.openConnection().getInputStream(); //url调用方法返回一个输入流
  		area.append("\n主机:"+hostName+"端口:"+urlPortNumber+
			"包含的文件名字:"+fileName);
     	area.append("\n文件的内容如下:");
    	while((n=in.read(b))!=-1) {
			String s=new String(b,0,n);
			area.append(s);    
		}
	}
	catch(MalformedURLException e1) {
	 	text.setText(""+e1);
		return;
	}
 	catch(IOException e1) {
		text.setText(""+e1);
		return;
	}  
}
}
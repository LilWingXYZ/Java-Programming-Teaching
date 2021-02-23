package ch11.part2;

import java.io.*;
import java.net.*;
import java.util.*;
public class MulticastServer extends QuoteServerThread {
//从QuoteServerThread继承得到新的服务器线程类MulticastServerThread
private long FIVE_SECOND=5000; //定义常量，5秒钟
	public MulticastServer(String name) throws IOException {
		super("MulticastServerThread"); 
		//调用父类，也就是QuoteServerThread的构造函数
	}
	public void run(){
	while(moreQuotes) { 
		//根据标志变量判断是否继续循环
		try{
			byte[] buf=new byte[256]; 
			//创建缓冲区
			String dString=null;
			if(in==null) dString=new Date().toString(); 
	else dString=getNextQuotes(); 

			buf=dString.getBytes(); 

InetAddress group=InetAddress.getByName("230.0.0.1"); 
//得到230.0.0.1的地址信息
DatagramPacket packet=new DatagramPacket(buf,buf.length,group,4446);
//根据缓冲区，广播地址，和端口号创建DatagramPacket对象

socket.send(packet); //发送该Packet
try{
sleep((long)(Math.random()* FIVE_SECOND)); 
//随机等待一段时间，0～5秒之间
}catch(InterruptedException e) { } //异常处理
}catch(IOException e){ //异常处理
e.printStackTrace( ); //打印错误栈
moreQuotes=false; //置结束循环标志
}
}
socket.close( ); //关闭广播套接口
}
}

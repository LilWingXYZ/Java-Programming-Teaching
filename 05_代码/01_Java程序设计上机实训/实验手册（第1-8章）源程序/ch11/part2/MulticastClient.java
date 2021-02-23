package ch11.part2;import java.io.*;
import java.net.*;
import java.util.*;
public class MulticastClient {
	
	public static void main(String args[]) throws IOException{
	MulticastSocket socket=new MulticastSocket(4446);
	//创建4446端口的广播套接字
	InetAddress address=InetAddress.getByName("230.0.0.1"); //得到230.0.0.1的地址信息
		socket.joinGroup(address); //使用joinGroup()将广播套接字绑定到地址上
		DatagramPacket packet;
		for(int i=0;i<5;i++) {
			byte[] buf=new byte[256]; //创建缓冲区
			packet=new DatagramPacket(buf,buf.length); //创建接收数据报
			socket.receive(packet); //接收
			String received=new String(packet.getData()); 
			//由接收到的数据报得到字节数组，并由此构造一个String对象
			System.out.println("Quote of theMoment:"+received); 
			} //循环5次
		socket.leaveGroup(address); 
		//把广播套接字从地址上解除绑定
		socket.close(); //关闭广播套接字
	}
}


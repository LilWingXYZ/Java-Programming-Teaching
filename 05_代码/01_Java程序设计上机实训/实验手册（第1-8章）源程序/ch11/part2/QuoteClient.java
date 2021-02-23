package ch11.part2;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class QuoteClient {
	public static void main(String[] args) throws IOException {
		if(args.length!=1) { //如果启动的时候没有给出Server的名字，那么出错退出

			System.out.println("Usage:java QuoteClient <hostname>"); 

			//打印出错信息
			return; //返回
		}
		DatagramSocket socket=new DatagramSocket(); 
		//创建数据报套接字
		byte[] buf=new byte[256]; //创建缓冲区
		InetAddress address=InetAddress.getByName(args [0]); 
		//由命令行给出第一个参数默认为Server的名字，通过它得到Server IP信息
		DatagramPacket packet=new DatagramPacket(buf,buf.length,address,4445);
		//创建DatagramPacket对象
		socket.send(packet); //发送
		packet=new DatagramPacket(buf,buf.length); 
		//创建新的DatagramPacket对象，用来接收数据报
		socket.receive(packet); //接收
		String received=new String(packet.getData()); 
		//根据接收到的字节数组生成相应的字符串
		System.out.println("Quote of the Moment:"+received ); 
		socket.close();}
　　　}
	}

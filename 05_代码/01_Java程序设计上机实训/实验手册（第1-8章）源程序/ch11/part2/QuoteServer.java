package ch11.part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class QuoteServer {
	public static void main(String args[]) throws java.io.IOException {
		new QuoteServerThread().start();
		// 启动一个QuoteServerThread线程
	}
}

// 程序QuoteServerThread.java

// 服务器线程
class QuoteServerThread extends Thread {
	protected DatagramSocket socket = null;

	protected BufferedReader in = null; // 用来读文件的一个Reader
	protected boolean moreQuotes = true;

	// 标志变量，是否继续操作
	QuoteServerThread() throws IOException {
		//无参数的构造函数
		this("QuoteServerThread");
	}
		
		QuoteServerThread(String name) throws IOException {
		super(name); // 调用父类的构造函数
		socket = new DatagramSocket(4445);
		// 在端口4445创建数据报套接字
		try {
			in = new BufferedReader(new FileReader(" one-liners.txt"));
			// 打开一个文件，构造相应的BufferReader对象
		} catch (FileNotFoundException e) { // 异常处理
			System.err
					.println("Could not open quote file. Serving time instead.");
			// 打印出错信息
		}
	}

	public void run(){//线程主体
		while(moreQuotes) {
			try{
				byte[] buf=new byte[256]; //创建缓冲区
				DatagramPacket packet=new DatagramPacket(buf,buf.length);
				//由缓冲区构造DatagramPacket对象
				socket.receive(packet); //接收数据报
				String dString=null;
				if(in==null) dString=new Date().toString();
				else dString=getNextQuotes();
				buf=dString.getBytes();
				//把String转换成字节数组，以便传送
				InetAddress address=packet.getAddress(); 
				//从Client端传来的Packet中得到Client地址
				int port=packet.getPort(); //和端口号
				packet=new DatagramPacket(buf,buf.length,address,port); 
				//根据客户端信息构建DatagramPacket
				socket.send(packet); //发送数据报
				}catch(IOException e) { //异常处
					e.printStackTrace(); //打印错误栈
					moreQuotes=false; //标志变量置false，以结束循环
					}
				}
		socket.close(); //关闭数据报套接字
		}

	protected String getNextQuotes(){ 
		//成员函数，从文件中读数据
		String returnValue=null;
		try {
			if((returnValue=in.readLine())==null) { 
				//从文件中读一行，如果读到了文件尾
				in.close( ); //关闭输入流
				moreQuotes=false; 
				returnValue="No more quotes. Goodbye.";
				} //否则返回字符串即为从文件读出的字符串
			}catch(IOException e) { //异常处理
				returnValue="IOException occurred in server"; 
			//置异常返回值
}
return returnValue; //返回字符串
}
}

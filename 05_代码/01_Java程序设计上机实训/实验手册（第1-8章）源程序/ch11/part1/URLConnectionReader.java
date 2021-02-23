package ch11.part1;

import java.net.*;
import java.io.*;
public class URLConnectionReader {
	public static void main(String[] args) throws Exception {
		URL web = new URL("http://www.sohu.com/");
		URLConnection webc=web.openConnection();    
 		//get an instance of URLConnection
         BufferedReader in = new BufferedReader(new InputStreamReader(
                          webc.getInputStream()));           
		//use of URLConnection
         String inputLine;
		//将读取的内容赋值给inputLine变量且其不为空时
         while ((inputLine=in.readLine())!=null)
	System.out.println(inputLine);
         in.close(); //关闭读取流
	}
 }


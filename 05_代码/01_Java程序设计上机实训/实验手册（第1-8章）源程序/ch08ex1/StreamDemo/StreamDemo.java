import java.io.*;

public class StreamDemo{
  public static void main(String[] args){
    String s;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try{
      do{
        s = in.readLine(); //从键盘读入一行字符串
        if(s!=null)
          System.out.println("Read:" + s);
      }while(s!=null);  //判断是否读完数据
    } 
    catch(IOException e){}
  }
}
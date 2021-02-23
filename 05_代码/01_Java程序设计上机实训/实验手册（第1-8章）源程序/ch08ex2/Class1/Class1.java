import java.io.*;

public class Class1{
  public static void main(String[] args){
    File file = new File("Class1.java");
    if(file.exists()){
      System.out.println("文件存在");
      System.out.println("文件长度为:" + file.length());
    }
  }
}
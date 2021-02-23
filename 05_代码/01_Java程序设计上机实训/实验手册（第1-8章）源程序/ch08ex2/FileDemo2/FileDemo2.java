import java.io.*;

public class FileDemo2{
  public static void main(String[] args)throws IOException{
    File file = new File("b/testb.txt");
    System.out.println("文件名：" + file.getName());
    System.out.println("相对路径：" + file.getPath());
    System.out.println("绝对路径：" + file.getAbsoluteFile());
    System.out.println("父目录名：" + file.getParent());
  }
}
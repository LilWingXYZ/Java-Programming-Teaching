import java.io.*;

public class PrintFile{
  public static void main(String[] args)throws IOException{
    RandomAccessFile aFile = new RandomAccessFile("PrintFile.java","rw");
    String s;
    int i = 1;
    while((s = aFile.readLine()) != null){
      System.out.println(s);
    }
    aFile.seek(0);
    while((s = aFile.readLine()) != null){
      System.out.println(i++ + "\t" + s);
    }
    aFile.close();
  }
}
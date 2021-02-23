import java.io.*;

public class SaveFile{
  public static void main(String[] args)throws Exception{
    int count, i = 512;		
    byte buffer[] = new byte[i];
    count = System.in.read(buffer);	
    FileOutputStream fos = new FileOutputStream("test.txt");
    fos.write(buffer, 0, count);
    fos.close();
  }
}
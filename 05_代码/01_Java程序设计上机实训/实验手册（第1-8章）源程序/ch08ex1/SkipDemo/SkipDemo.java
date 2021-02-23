import java.io.*;

public class SkipDemo{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("test.txt"));
    br.skip(10);
    System.out.println(br.readLine());
  }
}
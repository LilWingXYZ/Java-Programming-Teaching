import java.io.*;

public class AppendDemo{
  public static void main(String[] args)throws IOException{
    FileReader in = new FileReader("t1.txt");
    BufferedReader bin = new BufferedReader(in);
    FileWriter out = new FileWriter("t2.txt",true);
    String s1;
    while((s1 = bin.readLine())!=null){
      System.out.println(s1);
      out.write(s1 + '\n');
    }
    in.close();
    out.close();
  }
}
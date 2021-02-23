import java.io.*;

public class CircleArea
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str;
    double r,area;
    System.out.println("Input the circle radius:");
    str = in.readLine();
    r = Double.parseDouble(str);
    System.out.println("The circle area is :" + 3.14*r*r);
  }
}
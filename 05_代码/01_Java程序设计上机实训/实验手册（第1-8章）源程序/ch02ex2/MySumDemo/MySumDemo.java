import java.io.*;

public class MySumDemo
{
  public static void main(String[] args)throws IOException
  {
    int num1,num2,sum;
    String str;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Input the first integer:");
    str = in.readLine();
    num1 = Integer.parseInt(str);
    System.out.println("Input the second integer:");
    str = in.readLine();
    num2 = Integer.parseInt(str);
    sum = num1+num2;
    System.out.println("The sum is " + sum); 
  }
}
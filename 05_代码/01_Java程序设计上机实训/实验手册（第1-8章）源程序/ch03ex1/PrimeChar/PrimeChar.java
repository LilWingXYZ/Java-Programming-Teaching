import java.io.*;
import java.util.*;
public class PrimeChar
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str;
    char ch;
    str = in.readLine();
    ch = str.charAt(0);
    if(ch>=65 && ch<=90)
      System.out.println("´Ë×Ö·ûÊÇ´óÐ´×ÖÄ¸");
    else if(ch>=97 && ch<=122)
      System.out.println("´Ë×Ö·ûÊÇÐ¡Ð´×ÖÄ¸");
    else
      System.out.println("´Ë×Ö·û²»ÊÇ×ÖÄ¸");
  }
}
public class DivModDemo
{
  public static void main(String[] args)
  {
    int a = 8,b = 5;
    
    System.out.println(a + "/" + b + "=" + a/b);
    System.out.println(a + "/" + (-b) + "=" + a/(-b));
    System.out.println(-a + "/" + b + "=" + -a/b);
    System.out.println(-a + "/" + (-b) + "=" + -a/(-b));

    System.out.println(a + "/" + b + "=" + a%b);
    System.out.println(a + "/" + (-b) + "=" + a%(-b));
    System.out.println(-a + "/" + b + "=" + -a%b);
    System.out.println(-a + "/" + (-b) + "=" + -a%(-b));

    //System.out.println(++a + "+" + b + "=" ++ + a + b);
    System.out.println(++a + "+" + b + "=" + (++a) + b);
    System.out.println(a++ + "+" + (-b) + "=" + a++ + (-b));
    System.out.println(-++a + "+" + b + "=" + -++a + b);
    System.out.println(-a++ + "+" + (-b) + "=" + -a++ +(-b));
  }
}
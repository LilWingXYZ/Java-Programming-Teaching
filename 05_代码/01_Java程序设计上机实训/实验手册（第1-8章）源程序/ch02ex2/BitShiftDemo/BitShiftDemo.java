public class BitShiftDemo
{
  public static void main(String[] args)
  {
    int a = -16,b = 16;
    System.out.println("*************************************************"); 
    System.out.println("a的二进制数为:   " + Integer.toBinaryString(a));
    System.out.println("a左移2位后各位为:" + Integer.toBinaryString(a<<2));
    System.out.println(a + "<<2=" + (a<<2));

    System.out.println("*************************************************"); 
    System.out.println("a的二进制数为：  " + Integer.toBinaryString(a));
    System.out.println("a右移2位后各位为:" + Integer.toBinaryString(a>>2));
    System.out.println(a + ">>2=" + (a>>2));

    System.out.println("*************************************************"); 
    System.out.println("a的二进制数为：  " + Integer.toBinaryString(a));
    System.out.println("a右移2位后各位为:" + Integer.toBinaryString(a>>>2));
    System.out.println(a + ">>>2=" + (a>>>2));

    System.out.println("*************************************************"); 
    System.out.println("b的二进制数为：  " + Integer.toBinaryString(b));
    System.out.println("b左移2位后各位为:" + Integer.toBinaryString(b<<2));
    System.out.println(b + "<<2=" + (b<<2));

    System.out.println("*************************************************"); 
    System.out.println("b的二进制数为：  " + Integer.toBinaryString(b));
    System.out.println("b右移2位后各位为:" +  Integer.toBinaryString(b>>2));
    System.out.println(b + ">>2=" + (b>>2));

    System.out.println("*************************************************"); 
    System.out.println("b的二进制数为：  " + Integer.toBinaryString(b));
    System.out.println("b右移2位后各位为:" +  Integer.toBinaryString(b>>>2));
    System.out.println(b + ">>>2=" + (b>>>2));
    System.out.println("*************************************************");
  }
}
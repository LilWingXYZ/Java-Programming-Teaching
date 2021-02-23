import java.util.*;

public class ArrayRandom
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    int[] a = new int[rand.nextInt(20)];
    double[] b = new double[rand.nextInt(20)];
    System.out.println("a " + a.length);
    System.out.println("b " + b.length);
    for(int i=0;i<a.length;i++)
    {
      a[i] = rand.nextInt(20);
      System.out.println("a["+i+"]= " + a[i]);
    }
    for(int i=0;i<b.length;i++)
    {
      b[i] = rand.nextDouble()*20;
      b[i] = b[i]+a[i];
      System.out.println("b["+i+"]=" + b[i]);
    }
  }
}
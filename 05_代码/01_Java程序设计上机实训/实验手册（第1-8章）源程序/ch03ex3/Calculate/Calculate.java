public class Calculate
{
  public static void main(String[] args)
  {
    long sum = 1;
    for(int i=1;i<=20;i++)
      sum *= i;
    System.out.println("20! = " + sum);
  }
}
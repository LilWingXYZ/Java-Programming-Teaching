public class WhileDemo
{
  public static void main(String[] args)
  {
    int limit = 100;
    int sum = 0;
    int i = 1;
    while(i<=limit)
    {
      sum += i;
      i++;
    }
    System.out.println("sum = " + sum);
  }
}
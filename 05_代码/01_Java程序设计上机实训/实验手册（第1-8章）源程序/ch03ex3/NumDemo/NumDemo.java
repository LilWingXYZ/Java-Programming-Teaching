public class NumDemo
{
  public static void main(String[] args)
  {
    int n,num,num1;
    System.out.println("在1~1000可被3与5整除的为");
    for(n=1;n<=1000;n++)
    {
      if(n%3==0 && n%5==0)
        System.out.print(n + "\t");
    }
    System.out.println(" ");
  }
}
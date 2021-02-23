public class MaxMinDemo
{
  public static void main(String[] args)
  {
    int max,min,a = 4,b = 3,c = 7;
    if(a>b)
    {
      max = a;
      min = b; 
    }
    else
    {
      max = b; 
      min = a;
    }
    if(max<c)
    {
      max = c;
    }
    if(min>c)
    {
      min = c;
    }
    System.out.println(a + " " + b + " " + c);
    System.out.println("max=" + max + " min=" + min);
  }
}
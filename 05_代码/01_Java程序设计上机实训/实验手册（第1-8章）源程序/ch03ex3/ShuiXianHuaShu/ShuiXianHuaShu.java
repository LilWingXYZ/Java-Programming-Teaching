public class ShuiXianHuaShu
{
  public static void main(String[] args)
  {
    int a,b,c,x=100;
    while(x<1000)
    {
      a = x%10;
      b = (x%100-a)/10;
      c = (x-x%100)/100;
      if((a*a*a + b*b*b +c*c*c)==x)
        System.out.println(x);
      x++;
    }
  }
}
public class DegreeChangeDemo
{
  public static void main(String[] args)
  {
    int h,c;
    System.out.println("ÉãÊÏÎÂ¶È\t»ªÊÏÎÂ¶È");
    for(c = 0;c<=40;c+=5)
    {
      h = c*9/5+32;
      System.out.println("\t" + c + "\t" + h);
    }
  }
}
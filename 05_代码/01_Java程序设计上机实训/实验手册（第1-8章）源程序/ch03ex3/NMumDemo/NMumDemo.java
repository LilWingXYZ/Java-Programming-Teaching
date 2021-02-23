public class NMumDemo
{
  public static void main(String[] args)
  {
    int i,j,n=9;
    System.out.print(" * |");
    for(i=1;i<=n;i++)
      System.out.print(" " + i);
    System.out.print("\n---|");
    for(i=1;i<=n;i++)
      System.out.print("----");
    System.out.println();
    for(i=1;i<=n;i++)
    {
      System.out.print(" " + i + " |");
      for(j=1;j<=i;j++)
      {
        System.out.print(" " + i*j);
      }
      System.out.println();
    }
  }
}
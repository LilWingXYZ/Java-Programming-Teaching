public class Matrix
{
  public static void main(String[] args)
  {
    char a[][] = new char[3][4];
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[2].length;j++)
      {
        a[i][j] = '*';
        System.out.print((char)a[i][j]);
      }
      System.out.println();
    }
  }
}
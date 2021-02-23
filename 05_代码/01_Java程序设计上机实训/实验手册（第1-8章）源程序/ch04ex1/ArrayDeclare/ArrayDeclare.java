public class ArrayDeclare
{
  public static void main(String[] args)
  {
    int[] i = {1,2,3,4,5,6,7,8,9,10};
    for(int j=0;j<i.length;j++)
    {
      System.out.print(i[j] + " ");
    }
    System.out.println();
    for(int j=i.length-1;j>=0;j--)
    {
      System.out.print(i[j] + " "); 
    }
  }
}
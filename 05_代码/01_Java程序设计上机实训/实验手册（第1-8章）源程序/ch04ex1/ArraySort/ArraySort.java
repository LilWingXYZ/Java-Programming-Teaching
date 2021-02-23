public class ArraySort
{
  public static void main(String[] args)
  {
    int a[] = {20,10,50,40,30,70,60,80,90,100};
    int temp;
    for(int i=0;i<a.length-1;i++)
    {
      for(int j=i+1;j<a.length;j++)
      {
        if(a[i]<a[j])
        {
          temp = a[i];a[i] = a[j];a[j] = temp;
        }
      }
    }
    for(int k=0;k<a.length;k++)
      System.out.print(" " + a[k]);
  }
}
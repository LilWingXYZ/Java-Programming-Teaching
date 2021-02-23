public class ForEachRansack
{
  public static void main(String[] args)
  {
    int array[][][] = new int[][][]{{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}},{{13,14,15},{16,17,18}}};
    for(int[][] is:array)
    //遍历数组
    {
      for(int[] is2:is)
      {
        for(int i:is2)
        {
          System.out.print(i + "\t");
        }
      System.out.println();
      //输出一维数组后换行
      }
    }
  }
}
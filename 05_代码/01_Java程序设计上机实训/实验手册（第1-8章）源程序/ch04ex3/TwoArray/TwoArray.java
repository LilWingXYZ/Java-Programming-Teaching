import java.util.*;

public class TwoArray
{
  public static void main(String[] args)
  {
    System.out.println("请输入您要初始化的数组的行数");
    Scanner sc1 = new Scanner(System.in);
    int h = sc1.nextInt();
    Arr Test = new Arr(h);
    Test.init();
    while(true)
    {
      System.out.println("请选择您要的操作");
      System.out.println("输入1为【重新设置数组并初始化】");
      System.out.println("输入2为【输出当前数组中的最大值】");
      System.out.println("输入3为【输出当前数组中的最小值】");
      System.out.println("输入4为【输出当前数组的平均值】");
      System.out.println("输入5为【输出当前数组的和值】");
      System.out.println("输入6为【输出当前数组】");
      System.out.println("输入0为【退出】");
      Scanner sc2 = new Scanner(System.in);
      int choice = sc2.nextInt();
      if(choice==0)
      {
        System.out.println("结束");
        break;
      }
      else if(choice==1)
      {
        System.out.println("输入您要重新设置的行数");
        Scanner sc3 = new Scanner(System.in);
        int reset_h = sc3.nextInt();
        Test.setH(reset_h);
        Test.init();
      }
      else if(choice==2)
      {
        System.out.println("当前数组中的最大值为" + Test.max());
      }
      else if(choice==3)
      {
        System.out.println("当前数组中的最小值为" + Test.min());
      }
      else if(choice==4)
      {
        System.out.println("当前数组的平均值为" + Test.average());
      }
      else if(choice==5)
      {
        System.out.println("当前数组的和值为" + Test.total());
      }
      else if(choice==6)
      {
        Test.print();
      }
      else
      {
        System.out.println("选择错误");
      }
    }//while
  }//main
}//class

class Arr
{
  double arr[][];
  
  Arr(int h)
  {
    setH(h);
  }
  void setH(int h)
  {
    arr = new double[h][];
  } 
  void setL(int h,int l)
  {
    arr[h] = new double[l];
  }
  void init()
  {
    Scanner sc1 = new Scanner(System.in);
    for(int k=0;k<arr.length;k++)
    {
      System.out.println("请输入第" + (k+1) + "行的列数");
      int l = sc1.nextInt();
      setL(k,l);
    }
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
        System.out.println("请输入数据");
        Scanner sc2 = new Scanner(System.in);
        double temp = sc2.nextDouble();
        arr[i][j] = temp;
      }
    }
  }
 
  double min()
  {
    double min = arr[0][0];
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
        if(min>arr[i][j])
        {
          min = arr[i][j];
        }
      }
    }//for
    return min;
  }
  
  double max()
  {
    double max = arr[0][0];
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
        if(max<arr[i][j])
        {
          max = arr[i][j];
        }
      }
    }//for
    return max;
  }
  
  double total()
  {
    double total = 0;
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
        total+=arr[i][j];
      }
    }
   return total;
  }
  
  double average()
  {
    int totalNum = 0;
    for(int i=0;i<arr.length;i++)
    {
      totalNum += arr[i].length;
    }
    return(total()/totalNum);
  }
  
  void print()
  {
    for(int i=0;i<arr.length;i++)
    { 
      System.out.println();
      for(int j=0;j<arr[i].length;j++)
      {
        System.out.print(arr[i][j] + "\t");
      }
    }
  }
}

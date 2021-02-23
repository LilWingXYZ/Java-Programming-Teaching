import java.util.*;

public class MyCalendar{
  public static void main(String[] args){
    System.out.println(" 日 一 二 三 四 五 六");
    Calendar r1 = Calendar.getInstance();
    r1.set(2010,3,1);   //将日历翻到2010年4月1日
    int week = r1.get(Calendar.DAY_OF_WEEK)-1;
    String a[] = new String[week+30];//当月有31天时此处xingqi+31，当月有30天时此处xingqi+30
    for(int i=0;i<week;i++){
      a[i] = "**";
    }
    for(int i=week,n=1;i<week+30;i++){
      if(n<=9)
      //当日期号为单位数字时，让数字靠左对齐，即右面加一个空格
        a[i] = String.valueOf(n) + " ";
      else
        a[i] = String.valueOf(n);
      n++;
    }
    for(int i=0;i<a.length;i++){
      if(i%7==0){
        System.out.println("");
      }
      System.out.print(" " + a[i]);
    }
  }
}
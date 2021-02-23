import java.util.*;

public class CalendarDemo{
  public static void main(String[] args){
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    //星期由星期日~星期六 对应常量字段值为：1~7；
    //月份有1~12 对应常量字段值为0~11
    String year = String.valueOf(calendar.get(Calendar.YEAR)),
           month = String.valueOf(calendar.get(Calendar.MONTH)+1),
           day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)),
           week = String.valueOf(calendar.get(Calendar.DAY_OF_WEEK)-1);
    int hour = calendar.get(Calendar.HOUR_OF_DAY),
        minute = calendar.get(Calendar.MINUTE),
        second = calendar.get(Calendar.SECOND);
    System.out.println("现在的时间是：");
    System.out.println(" " + year + "年" + month + "月" + day + "日" + "星期" + week);
    System.out.println(" " + hour + "时" + minute + "分" + second +"秒");
    calendar.set(1962,5,29);
    long time1962 = calendar.getTimeInMillis();//public long getTimeInMillis() 反回此Calendar的时间值，以毫秒为单位
    calendar.set(2006,9,1);
    long time2006 = calendar.getTimeInMillis();
    long 相隔天数 = (time2006-time1962)/(1000*60*60*24);
    System.out.println("2006年10月1日和1962年6月29日相隔" + 相隔天数 + "天");
  }
}
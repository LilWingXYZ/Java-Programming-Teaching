import java.util.*;

public class MyCalendar2{
  public static void main(String[] args){
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.YEAR,2010);
    cal.set(Calendar.MONTH,6);
    cal.set(Calendar.DAY_OF_MONTH,11);
    int weekno = cal.get(Calendar.WEEK_OF_YEAR);
    System.out.println(weekno);
  }
}
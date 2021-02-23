import java.text.DateFormat;
import java.util.*;

public class DateDemo{
  public static void main(String[] args){
    Date now = new Date();
    DateFormat d = DateFormat.getDateInstance();
    String str = d.format(now);
    Date date1 = new Date();
    int week = date1.getDay();   //已过时，由Calendar.get(Calendar.DAY_OF_WEEK)取代
    int day = date1.getDate();   //已过时，由Calendar.get(Calendar.DAY_OF_MONTH)取代
    int month = date1.getMonth();//已过时，由Calendar.get(Calendar.MONTH)取代
    int year = date1.getYear()+1900;      //已过时，由Calendar.get(Calendar.YEAR)取代
    char ch;
    switch(week){
      case 1:ch='一';break;
      case 2:ch='二';break;
      case 3:ch='三';break;
      case 4:ch='四';break;
      case 5:ch='五';break;
      case 6:ch='六';break;
      case 7:ch='七';break;
      default:ch='一';break;
    }
    System.out.println("今天是" + year + "年" + month + "月" + day + "日星期" + week);
    System.out.println("今天是" + str);
  }
}
package P2;

import java.util.*;

public class YMD{
  private int year,month,day;
  public static void main(String[] args){
    
  }
  public YMD(int y,int m,int d){
    year = y;
    month = (((m>=1)&&(m<=12))?m:1);
    day = (((d>=1)&&(d<=31))?d:1);
  }
  public YMD(){
    this(0,0,0);
  }
  public static int thisyear(){
    return(Calendar.getInstance().get(Calendar.YEAR));
  }
  public int year(){
    return (year);
  }
  public String toString(){
    return (year + "-" + month + "-" + day);
  }
}
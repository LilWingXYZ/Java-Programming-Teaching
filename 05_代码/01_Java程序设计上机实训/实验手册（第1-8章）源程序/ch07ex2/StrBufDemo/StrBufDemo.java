public class StrBufDemo{
  public static void main(String[] args){
    StringBuffer str = new StringBuffer("62791720");
    str.insert(0,"010-");
    str.setCharAt(7,'8');
    str.setCharAt(str.length()-1,'7');
    System.out.println(str);
    str.append("-446");
    System.out.println(str);
    str.reverse();
    System.out.println(str);
  }
}
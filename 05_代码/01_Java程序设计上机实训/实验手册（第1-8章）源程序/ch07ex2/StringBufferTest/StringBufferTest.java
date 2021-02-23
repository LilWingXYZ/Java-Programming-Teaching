public class StringBufferTest{
  public static void main(String[] args){
    StringBuffer name = new StringBuffer("Alex");
    name.append(",Hunter");
    String nameStr1 = name.toString();
    String nameStr2 = new String(name);
    System.out.println("name      :" + name);
    System.out.println("nameStr1  :" + nameStr1);
    System.out.println("nameStr2  :" + nameStr2);  
  }
}
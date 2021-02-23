public class MethodofString{
  public static void main(String[] args){
    String str = "I like java programming";
    int i1 = str.indexOf('j');
    String s1 = str.substring(i1);
    String s2 = str.substring(i1,11);
    int i2 = str.lastIndexOf('p');
    String s3 = str.substring(i2);
    System.out.println("s1=" + s1);
    System.out.println("s2=" + s2);
    System.out.println("s3=" + s3);
  }
}
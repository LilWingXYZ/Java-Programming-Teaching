public class SubStrDemo{
  public static void main(String[] args){
    String str = "I like java programming";
    int position1 = str.indexOf('j');
    String s1 = str.substring(position1);
    String s2 = str.substring(7,11);
    int position2 = str.lastIndexOf('p');
    String s3 = str.substring(position2);
    System.out.println("s1=" + s1);
    System.out.println("s2=" + s2);
    System.out.println("s3=" + s3);
  }
}
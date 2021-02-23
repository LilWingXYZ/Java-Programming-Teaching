public class StringReverseChar{
  public static void doStringReverseChar(){
    String a = "i like java";
    System.out.println("Original string:" + a);
    StringBuffer b = new StringBuffer(a);
    b.reverse();
    System.out.println("Reverse character string:" + b);
    System.out.println();
  }
  public static void main(String[] args){
    doStringReverseChar();
  }
}
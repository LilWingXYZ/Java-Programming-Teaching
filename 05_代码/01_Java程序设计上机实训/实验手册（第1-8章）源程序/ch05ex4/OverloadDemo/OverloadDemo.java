public class OverloadDemo{
  public static void print(String str){
    System.out.println(str);
  }
  public static void print(int i){
    System.out.println(i);
  }
  public static void main(String[] args){
    print("123");
    print(123);
  }
}
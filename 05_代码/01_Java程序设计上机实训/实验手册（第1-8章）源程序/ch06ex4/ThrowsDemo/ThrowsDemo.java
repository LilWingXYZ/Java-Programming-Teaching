public class ThrowsDemo{
  static void method()throws IllegalAccessException{
    System.out.println("\n在method中抛出一个异常");
    throw new IllegalAccessException();
  }
  public static void main(String[] args){
    try{
      method();
    }
    catch(IllegalAccessException e){
      System.out.println("在main中捕获异常:" + e);
    }
  }
}
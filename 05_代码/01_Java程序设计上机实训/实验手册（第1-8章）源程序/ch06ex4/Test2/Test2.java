public class Test2{
  static int a = 3,b = 0;
  static String c[] = {"数组元素c[0]"};
  public static void main(String[] args){
    try{
      System.out.println(a);
      System.out.println(a/b);
      System.out.println(c[b]);//若上条语句产生异常，本语句将不被运行
    }
    catch(ArithmeticException e){
      System.out.println("捕捉到一个算术异常");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("捕捉到一个数组下标越界异常");
    }
    catch(Exception e){
      System.out.println("捕捉到一个系统异常");
    }
    finally{
      System.out.println("程序结束");
    }
  }
}
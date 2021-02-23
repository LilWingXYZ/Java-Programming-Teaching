class MyException extends Exception{
  private int x;
  MyException(int a){
    x = a;
  }
  public String toString(){
    return "自定义异常类MyException";
  }
}

public class ExceptionMainDemo{
  static void method(int a)throws MyException{
    System.out.println("\t此处引用method(" + a + ")");
    if(a>10)throw new MyException(a);
      System.out.println("正常返回");
  }
  public static void main(String[] args){
    try{
      System.out.println("\n进入监控区，执行可能发生异常的程序段");
      method(8);
      method(20);
      method(6);
    }
    catch(MyException e){
      System.out.println("\t程序发生异常并在此处进行处理");
      System.out.println("\t发生的异常为:" + e.toString());
    }
    System.out.println("这里可执行其他代码");
  }
}
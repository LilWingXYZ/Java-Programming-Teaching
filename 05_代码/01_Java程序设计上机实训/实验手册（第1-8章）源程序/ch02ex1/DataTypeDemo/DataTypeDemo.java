public class DataTypeDemo
{
  public static void main(String[] args)
  {
    byte b = 0x55;
    short s = 0x55ff;
    int i = 1000000;
    long l = 0xffffL;
    char c = 'a';
    float f = 0.23f;
    double d = 0.7e-3;
    boolean B = true;
    String S = "这是字符串类数据类型";
    System.out.println("字节型变量 b = " + b);
    System.out.println("短整形变量 s = " + s);
    System.out.println("整形变量 i = " + i);
    System.out.println("长整形变量 l = " + l);
    System.out.println("字符型变量 c = " + c);
    System.out.println("单精度变量 f = " + f);
    System.out.println("双精度变量 d = " + d);
    System.out.println("布尔型变量 B = " + B);
    System.out.println("字符串类对象 S = " + S);
  }
}
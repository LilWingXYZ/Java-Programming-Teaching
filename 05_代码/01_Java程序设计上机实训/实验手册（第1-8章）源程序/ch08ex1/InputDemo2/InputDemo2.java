import java.util.*;

public class InputDemo2{
  float number1,number2;
  Scanner sc;
  public InputDemo2(){
    System.out.println("请输入两个实数：");
    sc = new Scanner(System.in);
    number1 = sc.nextFloat();
    number2 = sc.nextFloat();
    System.out.println("两数之和是：" + (number1+number2));
  }
  public static void main(String[] args){
    InputDemo2 ct = new InputDemo2();
    System.exit(0);
  }
}
import java.io.*;

public class MathDemo{
  public static void main(String[] args){
    int count = 0;
    for(int i=1;i<=5;i++){
      int num1,num2,sum=0;
      num1 = (int)(Math.random()*10);
      num2 = (int)(Math.random()*10);
      System.out.println(num1 + "+" + num2 + "=?");
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      try{
        sum = Integer.parseInt(in.readLine());
      }
      catch(Exception e){
        e.printStackTrace();
      }
      if(sum==num1+num2){
        System.out.println("you are right!go on!");
        count++;
      }
      else
        System.out.println("I'm sorry to tell you,you are wrong!");
    }
    System.out.println("你做对了" + count + "个题目,得了" + count*20 + "分");
  }
}
public class JoinStrings{
  public static void main(String[] args){
    String firstString = "Many";
    String secondString = "hands ";
    String thirdString = "make light work";

    String myString;
    
    //以下代码用于连接firstString，secondString，thirdString三个字符串
    myString = firstString + secondString + thirdString;
    System.out.println(myString);

    //将字符串与数值进行连接，要注意连接结果
    myString = "fifty five is " + 5 + 5;
    System.out.println(myString);
        
    //连接数值与字符串，此连接与字符串连接数值有何区别？
    myString = 5 + 5 + " is ten";
    System.out.println(myString);

    //利用String类的valueOf()方法将数值转换为字符串
    double a = 3.14;
    String mystr = String.valueOf(a);
    System.out.println(mystr);
  }
}
interface StudentInterface{
  void setFee();
  int getFee();
}
interface TeacherInterface{
  void setPay();
  int getPay();
}
public class Graduate{
  String name;
  char sex;
  int age;
  int fee,pay;
  void setFee(int fee){
    this.fee = fee;
  }
  int getFee(){
    return fee;
  }
  void setPay(int pay){
    this.pay = pay;
  }
  int getPay(){
    return pay;
  }
  void loan(){
    if(pay-fee<2000){
      System.out.println("provide a loan");
    }
    else{
      System.out.println("don't provide a loan");
    }
  }
  public static void main(String[] args){
    Graduate zhangsan = new Graduate();
    zhangsan.setFee(4400);
    System.out.println("Zhang san fee is " + zhangsan.getFee());
    zhangsan.setPay(6000);
    System.out.println("Zhang san pay is " + zhangsan.getPay());
    zhangsan.loan();
  }
}
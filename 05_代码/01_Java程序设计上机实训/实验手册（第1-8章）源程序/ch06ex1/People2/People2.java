public class People2{
  String name;
  int age;
  String sex;
  People2(){
    System.out.println("*****创建了父类对象****!");
  }
  People2(String name){
    System.out.println(name);
    System.out.println("创建了父类的对象");
  }
  void eat(){
    System.out.println("开始吃饭了!!!");
  }
  void sleep(){
    System.out.println("我已经睡着了!!!");
  }
  void work(){
    System.out.println("我开始工作了!!!");
  }
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public void setSex(String sex){
    this.sex = sex;
  }
}
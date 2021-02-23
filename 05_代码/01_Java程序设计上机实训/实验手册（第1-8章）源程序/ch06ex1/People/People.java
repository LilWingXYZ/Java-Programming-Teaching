public class People{
  String name;
  int age;
  String sex;
  People(){
    System.out.println("*****创建了父类对象****!");
  }
  People(String name){
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
}
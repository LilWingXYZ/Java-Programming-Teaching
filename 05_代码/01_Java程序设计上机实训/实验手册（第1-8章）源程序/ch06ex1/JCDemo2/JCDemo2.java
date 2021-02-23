class People2{
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
class Stud extends People2{
  String snum;
  String grade;
  Stud(String name){
    System.out.println(name);
    System.out.println("创建了子类对象!");
  }
  void work(){
    super.work();
    System.out.println("我上学去了!");
  }
  void exam(){
    System.out.println("痛苦的历程开始了--考试");
  }
}

public class JCDemo2{
  public static void main(String[] args){
    People2 sushan = new People2("苏珊");
    Stud lili = new Stud("李莉");
    People2 zhaotian = new Stud("赵天");
    //Stud aimoli = new People();

    sushan.eat();
    sushan.sleep();
    sushan.work();
    
    lili.exam();
    lili.eat();
    lili.work();
    
    zhaotian.work();
    Stud s1 = (Stud)zhaotian;
    s1.exam();
    s1.setName("赵天");
    s1.setAge(20);
    s1.setSex("男");
    System.out.println("姓名:" + s1.name + " 年龄:" + s1.age + " 性别:" + s1.sex);
  }
}
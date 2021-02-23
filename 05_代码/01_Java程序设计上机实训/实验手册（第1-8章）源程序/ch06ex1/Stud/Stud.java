public class Stud extends People{
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
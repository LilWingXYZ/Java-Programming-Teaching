class Student{
  private String name;
  private String id;
  private int age;
  private char sex;
  Student(){
    name = " ";
    id = " ";
    age = 0;
    sex = ' ';
  }
  Student(String name,String id,int age,char sex){
    this.name = name;
    this.id = id;
    this.age = age;
    this.sex = sex; 
  }
  void print(){
    System.out.println("姓名:" + name);
    System.out.println("学号:" + id);
    System.out.println("年龄:" + age);
    System.out.println("性别:" + sex);
    System.out.println("******************");
  }
}
public class StudentDemo{
  public static void main(String[] args){
    Student s1 = new Student();
    Student s2 = new Student("包括","271040329",21,'男');
    s1.print();
    s2.print();
  }
}
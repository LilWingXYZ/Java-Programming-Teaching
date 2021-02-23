class Student{
  private String name;
  private int age;
  private boolean sex;
  private double score;
  
  Student(String name,int age,boolean sex,double score){
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.score = score;
  }
  void show(){
    System.out.println("学生姓名为:" + name);
    System.out.println("学生年龄为:" + age);
    System.out.println("学生性别为:" + sex);
    System.out.println("学生成绩为:" + score);
    System.out.println("***************************");
  }
}

public class StudentDemo{
  public static void main(String[] args){
    Student s1 = new Student("张晓",18,true,89.5);
    Student s2 = new Student("米杨",17,false,98);
    s1.show();
    s2.show();
  }
}
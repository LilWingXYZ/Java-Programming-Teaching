class Person{
  String name;
  char sex;
  int age;
  Person(String pName,char pSex,int pAge){
    name = pName;
    sex = pSex;
    age = pAge;
  }
  public String toString(){
    String s = ("姓名:" + name + " 性别:" + sex + " 年龄:" +age);
    return s;
  }
}

public class CreatePerson{
  public static void main(String[] args){
    Person p1 = new Person("张三",'男',20);
    Person p2 = new Person("李四",'女',28);
    p1.sex = '女';
    System.out.println(p1.toString());
    p2.age = 33;
    System.out.println(p2.toString());
  }
}
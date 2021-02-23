abstract class Student{
  static int CourseNo = 3;
  String type;
  String name;
  int[] courses;
  String courseGrade;

  public Student(String name){
    this.name = name;
    courses = new int[CourseNo];
    courseGrade = null;
  }
  public abstract void calculateGrade();
  public String getType(){
    return type;
  }
  public void setType(String type){
    this.type = type;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int[] getCourses(){
    return courses;
  }
  public void setCourses(int[] courses){
    this.courses = courses;
  }
  public int getCourseScore(int courseNumber){
    return courses[courseNumber];
  }
  public void setCourseScore(int courseNumber,int courseScore){
    this.courses[courseNumber] = courseScore;
  }
  public String getCourseGrade(){
    return courseGrade;
  }
  public void setCourseGrade(String courseGrade){
    this.courseGrade = courseGrade;
  }
}

class Undergraduate extends Student{
  public Undergraduate(String name){
    super(name);
    type = "本科生";
  }
  public void calculateGrade(){
    int total = 0;
    double average = 0;
    for(int i=0;i<CourseNo;i++){
      total += courses[i];
    }
    average = total/CourseNo;
    if(average>=80 && average<=100)
      courseGrade = "优秀";
    else if(average>=70 && average<80)
      courseGrade = "良好";
    else if(average>=60 && average<70)
      courseGrade = "中等";
    else if(average>=50 && average<60)
      courseGrade = "及格";
    else
      courseGrade = "不及格";
  }
}

class Postgraduate extends Student{
  public Postgraduate(String name){
      super(name);
      type = "研究生";
    }
  public void calculateGrade(){
    int total = 0;
    double average = 0;
    for(int i=0;i<CourseNo;i++){
      total += courses[i];
    }
    average = total/CourseNo;
    if(average>=90 && average<=100)
      courseGrade = "优秀";
    else if(average>=80 && average<90)
      courseGrade = "良好";
    else if(average>=70 && average<80)
      courseGrade = "中等";
    else if(average>=60 && average<70)
      courseGrade = "及格";
    else
      courseGrade = "不及格";
  }
}

public class Polymorphism{
  public static void main(String[] args){
    Student[] students = new Student[5];
    students[0] = new Undergraduate("陈建平");
    students[1] = new Undergraduate("鲁向东");
    students[2] = new Postgraduate("匡晓华");
    students[3] = new Undergraduate("周丽娜");
    students[4] = new Postgraduate("梁欣欣");
    for(int i=0;i<5;i++){
      students[i].setCourseScore(0,87);
      students[i].setCourseScore(1,90);
      students[i].setCourseScore(2,78);
    }
    for(int i=0;i<5;i++){
      students[i].calculateGrade();
    }
    System.out.println("姓名" + "     类型" + "     成绩");
    System.out.println("----------------------------");
    for(int i=0;i<5;i++){
      System.out.println(students[i].getName() + "   " + students[i].getType() + "   " + students[i].getCourseGrade());
    }
  }
}
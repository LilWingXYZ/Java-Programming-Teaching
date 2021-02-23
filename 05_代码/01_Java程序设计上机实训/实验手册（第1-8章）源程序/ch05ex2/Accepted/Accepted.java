class School{
  static float line;
 
  static void setLine(float newline){
    line = newline;
  }
  static float getLine(){
    return line;
  }
}

class Student{
  private String name;
  private String id;
  private float total;
  private float sport;

  Student(String name,String id,float total,float sport){
    this.name = name;
    this.id = id;
    this.total = total;
    this.sport = sport;
  }
  String getName(){
    return name;
  }
  float getTotal(){
    return total;
  }
  float getSport(){
    return sport;
  }
}

public class Accepted{
   static boolean acceptedJudge(float total,float sport){
    if(total>=School.line || (sport>=96 && total>=300)){
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String[] args){  
    School.setLine(610f);
    Student stu[] = new Student[5];
    stu[0] = new Student("Baokuo","271040329",625f,99f);
    stu[1] = new Student("ShaYunWen","271040330",600f,90f);
    stu[2] = new Student("JiZhe","271040328",612f,92f);
    stu[3] = new Student("LiuQingWen","271040327",608f,96f);
    stu[4] = new Student("XueDong","271040326",610f,98f);
    for(int i=0;i<5;i++){
      if(acceptedJudge(stu[i].getTotal(),stu[i].getSport())){
        System.out.println("¹§Ï²" + stu[i].getName() + "±»Â¼È¡!!!");
      }
    }
  }
}
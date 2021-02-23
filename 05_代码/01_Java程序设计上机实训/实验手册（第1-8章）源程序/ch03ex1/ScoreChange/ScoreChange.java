import java.io.*;

public class ScoreChange
{
  void grade(int score)
  {
    if(score<=100 && score>89)
      System.out.println("学生成绩为优");
    else if(score>79)
      System.out.println("学生成绩为良");
    else if(score>69)
      System.out.println("学生成绩为中");
    else if(score>59)
      System.out.println("学生成绩为及格");
    else
      System.out.println("学生成绩为不及格");
  }
  public static void main(String[] args)
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
    String strin="";
    int s = 0;
    System.out.print("please input to data:");
    try
    {
      strin = in.readLine();
      s = Integer.parseInt(strin);
    }
    catch(IOException e)
    {
    }
    ScoreChange score1 = new ScoreChange();
    score1.grade(s);
  }
}
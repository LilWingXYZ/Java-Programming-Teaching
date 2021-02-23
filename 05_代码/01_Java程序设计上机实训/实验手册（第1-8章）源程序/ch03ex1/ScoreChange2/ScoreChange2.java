public class ScoreChange2
{
  public static void main(String[] args)
  {
    int score = 55;
    switch(score/10)
    { 
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:System.out.println(score + "分是不及格");break;
      case 6:System.out.println(score + "分是及格");break;
      case 7:System.out.println(score + "分是中等");break;
      case 8:System.out.println(score + "分是良好");break;
      case 9:
      case 10:System.out.println(score + "分是优秀");break;
      default:System.out.println("数据错误");
    }
  }
}
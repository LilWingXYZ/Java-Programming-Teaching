import java.io.*;

public class PresentDemo
{
  public static void main(String[] args)throws IOException
  {
    char ch;
    System.out.println("按1/2/3数字键可得大奖！");
    System.out.println("按q键可退出循环操作。");
    while((ch = (char)System.in.read())!=' ')
    {
      System.in.skip(2);           //跳过回车键
      switch(ch)
      {
        case '1':System.out.println("恭喜你得大奖，一辆汽车");break;
        case '2':System.out.println("不错呀，你得到一台笔记本电脑");break;
        case '3':System.out.println("没有白来，你得到一台冰箱");break;
        case 'q':System.out.println("欢迎下次再来");System.exit(0);
        default :System.out.println("真不幸，你没有奖品！下次再来吧。");
      }
    }
  }
}
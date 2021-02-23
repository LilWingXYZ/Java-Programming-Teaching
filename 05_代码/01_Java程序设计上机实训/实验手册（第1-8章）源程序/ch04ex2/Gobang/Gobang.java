//┼●○
import java.io.*;
import java.util.*;

public class Gobang
{
  private String board[][];
  private static int BOARD_SIZE = 15;
  public void initBoard()
  {
    board = new String[BOARD_SIZE][BOARD_SIZE];
    for(int i=0;i<BOARD_SIZE;i++)
    {
      for(int j=0;j<BOARD_SIZE;j++)
        board[i][j] = "┼";
    }
  }
  public void printBoard()
  {
    for(int i=0;i<BOARD_SIZE;i++)
    {
      for(int j=0;j<BOARD_SIZE;j++)
        System.out.print(board[i][j]);
    }
    System.out.println();
  }
  public static void main(String[] args)
  {
    Gobang gb = new Gobang();
    Random rand = new Random();
    gb.initBoard();
    gb.printBoard();
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String inputStr = null;
    br.readLine();   //有什么用？
    while((inputStr = br.readLine())!=null)
    {
      String[] posStrArr = inputStr.split(",");
      int xPos = Integer.parseInt(posStrArr[0]);
      int yPos = Integer.parseInt(posStrArr[1]);
      gb.board[xPos-1][yPos-1] = "●";
      /*
      计算机随机生成两个整数，作为计算机下棋的坐标，赋给board数组
      还涉及：
      1.坐标的有效性，只能是数字，不能超出棋盘范围
      2.如果下棋的点已经有棋了，则不能重复下棋
      3.每次下棋后，需要扫描谁赢了
      */
      gb.printBoard();
      System.out.println("请输入您下棋的坐标，应以x,y的格式：");
      gb.printBoard();
      System.out.println("请输入您下棋的坐标，应以x,y的格式：");
    }
  }
}
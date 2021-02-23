class StaticDemo{
  static int x;
  int y;
  
  public static void setX(int newX)
  {
    x = newX;
  }
  public static int getX(){
    return x;
  }
  public void setY(int newY){
    y = newY;
  }
  public int getY(){
    return y;
  }
}

public class MainDemo{
  public static void main(String[] args){
    System.out.println("静态变量 x=" + StaticDemo.getX()); 
    //System.out.println("实例变量 y=" + StaticDemo.getY());
    StaticDemo a = new StaticDemo();
    StaticDemo b = new StaticDemo();
    a.setX(1);a.setY(2);b.setX(3);b.setY(4);
    System.out.println("静态变量 a.x=" + a.getX());
    System.out.println("实例变量 a.y=" + a.getY());
    System.out.println("静态变量 b.x=" + b.getX());
    System.out.println("实例变量 b.y=" + b.getY());
  }
}
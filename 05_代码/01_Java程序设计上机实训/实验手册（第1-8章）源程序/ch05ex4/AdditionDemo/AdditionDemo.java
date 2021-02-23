public class AdditionDemo{
  static int Addition(int x,int y){
    return (x+y);
  }
  static float Addition(float x,float y){
    return (x+y);
  }
  static double Addition(double x,double y){
    return (x+y);
  }
  public static void main(String[] args){
    System.out.println("25+36=" + Addition(25,36));
    System.out.println("235.6f+124.4f=" + Addition(235f,124f));
    System.out.println("22.1415+54.235=" + Addition(22.1415,54.235));
  }
}
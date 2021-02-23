public class ToStringDemo{
  int x;
  int y;
  public ToStringDemo(int x,int y){
    this.x = x;
    this.y = y;
  }
  public String toString(){
    return ("Object members =>[x=" + x + ",y=" + y + "]");
  }
  public static void main(String[] args){
    ToStringDemo a1 = new ToStringDemo(10,20);
    System.out.println(a1);
  }
}
public class MainDemo2{
  public static void main(String[] args){
    System.out.println(StaticDemo2.getArea1());
    StaticDemo2 sd = new StaticDemo2();
    System.out.println(sd.getArea());
    System.out.println(sd.getArea1());
    System.out.println(sd.getArea2());
  }
}
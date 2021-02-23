interface InterfaceA{
  int a = 3;
  void funcA(int x);
}
interface InterfaceB{
  double b = 3.5;
  void funcB(double y);
}
interface InterfaceC extends InterfaceA,InterfaceB{
  int c = 10;
  void funcC();
}
class H1 implements InterfaceC{
  public void funcA(int x){
    System.out.println("x=" + x);
  }
  public void funcB(double y){
    System.out.println("y=" + y);
  }
  public void funcC(){
    System.out.println(c);
  }
  public static void main(String[] args){
    H1 h1 = new H1();
    h1.funcA(c);
    h1.funcB(b);
    h1.funcC();
  }
}
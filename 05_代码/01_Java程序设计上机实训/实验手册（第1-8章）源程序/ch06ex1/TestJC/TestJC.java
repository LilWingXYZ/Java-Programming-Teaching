class Base{
  int i;
  Base(){
    add(1);
  }
  void add(int v){
    i+=v;
  }
  void print(){
    System.out.println(i);
  }
}

class Son extends Base{
  Son(){
    add(2);
  } 
  void add(int v){
    i+=v*2;
  }
}

public class TestJC{
  public static void main(String[] args){
    bogo(new Son());
  }
  static void bogo(Base b){
    b.add(8);
    b.print();
  }
}
class Outer{
  private int index = 10;
  class Inner{
    private int index = 20;
    void print(){
      System.out.println(this);
      System.out.println(Outer.this);
      System.out.println(index);
      System.out.println(this.index);
      System.out.println(Outer.this.index);
    }
  }
  void print(){
    Inner inner = new Inner();
    inner.print();
  }
}

public class Test{
  public static void main(String[] args){
    Outer outer = new Outer();
    outer.print(); 
  }
}
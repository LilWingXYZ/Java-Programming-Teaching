class SuperClass{
  String s = "super";
}
class OuterClass{
  String s = "outer";
  class Inner extends SuperClass{
    void foo(){
      //String s = "inner";
      System.out.println(s);
    }
  }
}

public class ScopeConflict{
  public static void main(String[] args){
    OuterClass Super = new OuterClass();
    OuterClass.Inner inner = Super.new Inner();
    inner.foo();
  }
}
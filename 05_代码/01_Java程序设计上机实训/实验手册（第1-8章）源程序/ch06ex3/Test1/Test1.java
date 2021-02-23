interface product{
  void price();
}

public class Test1{
  private int i = 1;
  private String ts = "test1";
  private class shoe implements product{
    public void price(){
      System.out.println("i am excuted at " + ts + " innerclass!");
      test();
    }
  }
  public shoe getshoe(){
    return new shoe();
  }
  private void test(){
    System.out.println(i);
  }
  
  public static void main(String[] args){
    Test1 t = new Test1();
    product p = t.getshoe();
    Test1.shoe s = t.new shoe();
    s.price();
    p.price();
  }
}
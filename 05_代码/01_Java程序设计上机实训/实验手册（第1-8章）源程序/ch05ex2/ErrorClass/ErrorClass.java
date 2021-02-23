class Class1{
  private int y;
  private void show(){
    System.out.println("show method is private");
  }
  public void usesecret(){
    show();
  }
}

public class ErrorClass{
  public static void main(String[] args){
    Class1 Ob = new Class1();
    Ob.usesecret();
    //Ob.show();
  }
}
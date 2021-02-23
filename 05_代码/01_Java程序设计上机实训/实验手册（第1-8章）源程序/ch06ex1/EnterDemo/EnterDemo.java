class RunDemo{
  private String userName,password;
  RunDemo(){
    System.out.println("全部为空!");
  }
  RunDemo(String name){
    userName = name;
  }
  RunDemo(String name,String pwd){
    this(name);
    password = pwd;
    check();
  }
  void check(){
    String s = null;
    if(userName!=null){
      s = "用户名:" + userName;
    }
    else 
      s = "用户名不能为空!";
    if(password!="12345678"){
      s = s + "口令无效!";
    }
    else{
      s = s + " 口令:********";
    }
    System.out.println(s);
  }
}

public class EnterDemo{
  public static void main(String[] args){
    new RunDemo();
    new RunDemo("张三");
    new RunDemo(null,"李四");
    new RunDemo("王五","12345678");
  }
}
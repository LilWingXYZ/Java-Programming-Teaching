public class NumMax{
  public static void main(String[] args){
    int max;
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    if(a>b && a>c){
      max = a;
    }
    else if(b>c){
      max = b;
    }
    else{
      max = c;
    }
    System.out.println("三个数中最大的是:" + max);
  }
}
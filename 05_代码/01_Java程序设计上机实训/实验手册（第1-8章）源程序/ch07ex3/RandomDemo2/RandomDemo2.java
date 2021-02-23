import java.util.Random;

public class RandomDemo2{
  public static void main(String[] args){
    Random r = new Random(); 
    int n,m;
    n = r.nextInt(20);
    if(n<11)
      m = 1;
    else if(n<19)
      m = 2;
    else
      m = 3;
    System.out.println(m);
  }
}
public class ApplicationDemo{
  double a[] = {1.2,2.3,3.4,4.5,5.6};
  double b[] = {9.8,8.7,7.6,6.5,5.4,4.3};
  float sqrt_sum(double c[]){
    float sum=0;
    for(int i=0;i<c.length;i++){
      sum += (Math.sqrt(c[i]));
    }
    return sum;
  }
  public static void main(String[] args){
    ApplicationDemo ap = new ApplicationDemo();
    System.out.println(ap.sqrt_sum(ap.a));
    System.out.println(ap.sqrt_sum(ap.b));
  }
}
public class PrintNum{
  int n;
  PrimtNum(int n){
    this.n = n;
  }
  void inversion(){
    while(n!=0){
      System.out.print(n%10 + "\t");
      n /= 10;
    }
  }
  void printNum(){
    int div,ten,hundred,thousand,ten_thousand;
    int place = 0;
    if(n >= 10000 && n<=99999)
      place = 5 ;
    else if(n>=1000 && n<=9999)
      place = 4;
    else if(n>=100 && n<=999)
      place = 3;
    else if (n>=100 && n<=99)
      place = 2;
    else if (n>=0 && n<=9)
      place = 1;
    div = n%10;
    ten = (n%100 - div)/10;
    hundred = (n%1000 - ten*10 - div)/100;
    thousand = (n%10000 - hundred*100 - ten*10 - div)/1000;
    ten_thousand = n/10000;
    switch(place){
      case 1:System.out.println(n + "为一位数");
             System.out.println(div);
      case 2:System.out.println(n + "为二位数");
             System.out.println(ten + "\t" + div);break;
      case 3:System.out.println(n + "为三位数");
             System.out.println(hundred + "\t" + ten + "\t" + div);break;
      case 4:System.out.println(n + "为四位数");;
             System.out.println(thousand + "\t" + hundred + "\t" + ten + "\t" + div);break;
      case 5:System.out.println(n + "为五位数");
             System.out.println(ten_thousand + "\t" + thousand + "\t" + hundred + "\t" + ten + "\t" + div);break;
    }
  }
  public static void main(String[] args){
    PrimtNum p = new PrimtNum(123);
    p.printNum();
    p.inversion();
  }
}
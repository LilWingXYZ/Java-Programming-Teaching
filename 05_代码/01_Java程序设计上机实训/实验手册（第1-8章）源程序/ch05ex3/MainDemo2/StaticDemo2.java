public class StaticDemo2{
  static double pi = 3.14;
  double pix = 3.14;
  double getArea(){
    return pi*3*3;
  }
  static double getArea1(){
    return pi*3*3;
  }
  double getArea2(){
    return pix*3*3;
  }
  /*static double getArea3(){
    return pix*3*3;
  }*/
}
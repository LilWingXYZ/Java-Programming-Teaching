public class CarDemo{
  public static void main(String[] args){
    Car myCar = new Car("苏珊",200f,25f);
    System.out.println("车主姓名:" + myCar.getOwnerName());
    System.out.println("当前车速:" + myCar.getCurSpeed());
    System.out.println("当前转向角度:" + myCar.getCurDirInDegree());
    myCar.changeSpeed(80);
    System.out.println("在调用changeSpeed(80)后,车速变为:" + myCar.getCurSpeed());
    myCar.stop();
    System.out.println("在调用stop()后，车速变为:" + myCar.getCurSpeed());
  }
}
public class AreaAndLength
{
  public static void main(String[] args)
  {
    double length,area;
    Circle circle = null;
    Triangle triangle;
    Ladder ladder;
    circle = new Circle(2);
    triangle = new Triangle(3,4,5);
    ladder = new Ladder(2,5,3);
    length = circle.getLength();   // circle 调用方法返回周长并赋值
    System.out.println("圆的周长：" + length);
    area = circle.getArea();
    System.out.println("圆的面积：" + area);
    length = triangle.getLength();
    System.out.println("三角形的周长：" + length);
    area = triangle.getArea();
    System.out.println("三角形的面积：" + area);
    area = ladder.getArea();
    System.out.println("梯形的面积：" + area);
    triangle.setABC(12,34,1);       //triangle 调用方法设置三个边
                                    //要求将三个边修改为12，34，1
    area = triangle.getArea();
    System.out.println("三角形的面积：" + area);
    triangle.getLength();
    System.out.println("三角形的周长：" + length);
  }
}

//三角型类
class Triangle
{
   double sideA,sideB,sideC,area,length;
   boolean boo;
   public Triangle(double a,double b,double c)
   {
     sideA = a; 
     sideB = b;
     sideC = c;
     if(a-b>c && a-c>b && b-c>a)
     {
       boo = true;
     }
     else
     {
       boo = false;
     }
   }
   double getLength()
   {
     return sideA+sideB+sideC;
   }
   public double getArea()
   {
     if(boo)
     {
       double p = (sideA + sideB + sideC)/2.0;
       area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
       return area;
     }
     else
     {
       System.out.println("不是一个三角形，不能计算面积");
       return 0;
     }
   } 
   public void setABC(double a,double b,double c)
   {
     sideA = a;
     sideB = b;
     sideC = c;
   }
}

//梯形类
class Ladder
{
  double above,bottom,height,area;
  Ladder(double a,double b,double h)
  {
    above = a;
    bottom = b;
    height = h;
  }
  double getArea()
  {
    return (above+bottom)*height/2;
  }
}

//圆类
class Circle
{
  double radius,area;
  Circle(double r)
  {
    radius = r;
  }
  double getArea()
  { 
    return 3.14*radius*radius;
  }
  double getLength()
  {
    return 3.14*2*radius; 
  }
  void setRadius(double newRadius)
  {
    radius = newRadius;
  }
  double getRadius()
  {
    return radius;
  }
}

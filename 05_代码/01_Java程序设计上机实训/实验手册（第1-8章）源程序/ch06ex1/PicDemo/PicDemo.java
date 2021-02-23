class Point{
  protected int x,y;
  Point(int a,int b){
    setPoint(a,b);
  }
  void setPoint(int a,int b){
    x = a;
    y = b;
  }
}

class Line extends Point{
  protected int x,y;
  Line(int a,int b){
    super(a,b);
    setLine(a,b);
  }
  void setLine(int a,int b){
    this.x = a+a;
    this.y = b+b;
  }
  public double length(){
    int x1 = super.x,y1 = super.y,x2 = this.x,y2 = this.y;
    return (Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
  }
  public String toString(){
    return ("直线端点:[" + super.x + "," + super.y + "][" + x + "," +  y + "]直线长度:" + this.length());
  }
}

public class PicDemo{
  public static void main(String[] args){
    Line line = new Line(50,50);
    System.out.println("\n" + line.toString());
  }
}
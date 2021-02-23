class Point2D{
  int x,y;
  Point2D(int x,int y){
    this.x = x;
    this.y = y;
  }
  void offset(int a,int b){
    x+=a;
    y+=b;
  }
}

public class Point3D extends Point2D{
  int z;
  Point3D(int x,int y,int z){
    super(x,y);
    this.z = z;
  }
  Point3D(Point2D p,int z){
    super(p.x,p.y);
    this.z = z;
  }
  void offset(int a,int b,int c){
    x+=a;
    y+=b;
    z+=c;
  }
  public static void main(String[] args){
    Point2D p2d1 = new Point2D(0,0);
    Point2D p2d2 = new Point2D(1,1);
    System.out.println("二维空间两点距离为:" + Math.sqrt((p2d2.x-p2d1.x)*

(p2d2.x-p2d1.x)+(p2d2.y-p2d2.y)*(p2d2.y-p2d2.y)));
    Point3D p3d1 = new Point3D(0,0,0);
    Point3D p3d2 = new Point3D(1,1,1);
    System.out.println("三维空间两点距离为:" + Math.sqrt((p3d2.x-p3d1.x)*

(p3d2.x-p3d1.x)+(p3d2.y-p3d1.y)*(p3d2.y-p3d1.y)+(p3d2.z-p3d1.z)*(p3d2.z-

p3d1.z)));
  }
}
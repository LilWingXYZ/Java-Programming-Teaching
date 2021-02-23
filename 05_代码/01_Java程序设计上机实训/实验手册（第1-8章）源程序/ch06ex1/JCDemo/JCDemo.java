public class JCDemo{
  public static void main(String[] args){
    People sushan = new People("À’…∫");
    Stud lili = new Stud("¿Ó¿Ú");
    People zhaotian = new Stud("’‘ÃÏ");
    //Stud aimoli = new People();

    sushan.eat();
    sushan.sleep();
    sushan.work();
    
    lili.exam();
    lili.eat();
    lili.work();
    
    zhaotian.work();
    Stud s1 = (Stud)zhaotian;
    s1.exam();
  }
}
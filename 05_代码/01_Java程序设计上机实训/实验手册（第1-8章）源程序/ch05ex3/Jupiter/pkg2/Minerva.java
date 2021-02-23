package pkg2;

import pkg1.Jupiter;

public class Minerva extends Jupiter{
  public void method1(){
    System.out.println("In Minerva");
  }
  public static void main(String[] args){
    new Minerva().call();
  }
}
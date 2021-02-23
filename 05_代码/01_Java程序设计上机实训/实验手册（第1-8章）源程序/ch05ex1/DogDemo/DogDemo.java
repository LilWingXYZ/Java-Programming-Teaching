class Dog{
  String name;
  String color;
  int age;
  Dog(String newName,String newColor,int newAge){
    name = newName;
    color = newColor;
    age = newAge;
  }
  void printDog(){
    System.out.println("Dog's name is " + name);
    System.out.println("Dog's color is " + color);
    System.out.println("Dog's age is " + age);
  }
}

public class DogDemo{
  public static void main(String[] args){
    Dog d = new Dog("HuanHuan","Black",1);
    d.printDog();
  }
}
public class Employee{
  String name;
  int salary;
  Employee(String n,int s){
    name = n;
    salary = s;
  }
  Employee(String n){
    name = n;
  } 
  void print(){
    System.out.println("name:" + name);
    System.out.println("salary:" + salary);
  } 
  void setSalary(int s){
    salary = s;
  }
  public static void main(String[] args){
    Employee e1 = new Employee("Tom",5000); 
    Employee e2 = new Employee("Jerry");

    e1.print();
    e2.setSalary(3000);
    e2.print();
  }
}
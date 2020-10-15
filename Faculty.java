// Note how we can include multiple classes by only naming one as public
public class Faculty extends Employee{
  public static void main(String[] args){
    new Faculty();
    System.out.print("here");
  }
}

class Employee extends Person{
  public Employee(){
    this("Invoke Employee's overloaded constructor.");
    System.out.println("Employee's no-arg constructor has been invoked.");
    
  }
  
  public Employee(String s){
    // Note: super() is implicitly called here!
    System.out.println(s);
    
  }
  
}

class Person{
  public Person(){
    System.out.println("Person's no-arg constructor has been invoked.");
  }
  
}
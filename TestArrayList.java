import java.util.ArrayList;
public class TestArrayList{
  public static void main(String[]args){
    ArrayList <String> studentNames = new ArrayList <> ();
     //Array lists arent able to use primitive types, but just use their wrapper classes.
    studentNames.add("Arielle");
    studentNames.add("Benny");
    studentNames.add("Chris");
    studentNames.add("Daniel");
    studentNames.add("Elaine");
    
    //What size is the list?
    System.out.println(studentNames.size());
    //Does it contain a certain name?
    System.out.println(studentNames.contains("Arielle"));
    //Is the list empty?              
    System.out.println(studentNames.get(0));                   
    //Insert a new name in a specific location
    studentNames.add(5,"Fred");
    System.out.println(studentNames.get(5));
    //remove a name from the list
    studentNames.remove("Chris");
    System.out.println(studentNames.get(1));
    
  }
  
}

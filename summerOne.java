// IMPORTANT: Add comments/headers as you
// write your code.

public class summerOne{
 
  /** Declare the following fields:*/
  
  // String representing which class Carr is 
  // teaching (CSE2 or CSE17)
  String whichClass;
  // integer number of students are enrolled the class
  int numberEnrolled;
  // integer number of students who attended lecture
  int numberAttending;
  // double percent representing class attendance
  double percentAttend;
  // String representing the date in mm/dd format
  String date;
  
  //include main method
  
  
  
  /* Declare the following constructors: */
  
  // A three-arg constructor that creates a 
  // summerOne object given the parameters:
  // class, number of students enrolled, date
  // (which instance variables must we initialize
  // in this constructor?)
  public summerOne(String thisClass, int enrollment, String thisDate){
    whichClass = thisClass;
    numberEnrolled = enrollment;
    date = thisDate;
  }
  //2 arg
  public summerOne(String thisClass, int enrollment){
    this(thisCalss,enrollment, "00/00");
    //whichClass = thisClass;
    //numberEnrolled = enrollment;
    
    //date = "00/00";
    //date = thisDate;
  }
  
  

  /** Declare the following methods:*/
  
  // A static method that returns whether or not 
  // class was held, given a day (as a String)
  public static boolean classHeld(String day){
   if(checkDate.equals("Monday")||checkDate.equals("Tuesday")||
      checkDate.equals("Wednesday")||checkDate.equals("Thursday")){
     return true;
   }else{
     return false;
   }
  }
  // A private method that determines the percent of
  // students in class that day 
  private void percentAttend(){
    double doubleAttend = numberAttending * 1.0;
    double doubleEnrolled = numberEnrolled * 1.0;
    
    percentAttend = doubleAttend/doubleEnrolled;
  }
  // An instance method that prints a meaningful
  // statement about holding a pop quiz or not
  public void printPopQuiz(){
    percentAttend();
    if(percentAttending >= 0.8){
      System.out.print("No quiz today");
    }else if(percentAttending =  0.0){
      System.out.print("Where is everyone");
    } else {
      System.out.print("Clear your deskes, we have a Pop Quiz." + "The date is: "+ date);
    }
  }
  // A getter that returns class attendance as
  // a percent
   public double getPercent(){
     percentAttend();
     return percentAttending * 100;                       
  }
  // A setter that modifies number of students
  // attending class (e.g., someone comes in late)
   public setStudent(int students){
     numberAttending = student;
   }
  // A setter that modifies the number of students
  // enrolled in the class (e.g., drop/adds)
   public setEnrollment(int roster){
     numberEnrolled = roster;
   }
  
  /** Create a main method to test our class: */ 
  
}
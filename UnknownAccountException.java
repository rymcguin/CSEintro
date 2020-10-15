public class UnknownAccountException extends IllegalArgumentException{
  /**
 * This is the   UnknownAccount constructor. Prints out an error message
 * @return  No return
 */ 
  public UnknownAccountException(){
        super("This account is neither a Faculty or Grader account.");
    }
}
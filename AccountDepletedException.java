public class AccountDepletedException extends IllegalArgumentException{
   /**
 * This is the  Account Depleted constructor. Prints out an error message
 * @return  No return
 */  
  public AccountDepletedException(){
      super("Insufficient Funds.");
    }
}
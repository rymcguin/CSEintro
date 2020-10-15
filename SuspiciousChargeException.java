public class SuspiciousChargeException extends IllegalArgumentException {
    //Charge that is above allowed limit
    private double badCharge;
    //G for grader E for faculty
    private String acctType;
/**
 * This is the  Suspicious Charge constructor with 2 parameters.
 *it initialises all of the variables with its parameters.
 * @param  badCharge- the charge amount called into question.
 * @param  acctType- the account type
 * @return  No return
 */
    public SuspiciousChargeException(double badCharge, String acctType) {
        super(Math.round((badCharge *100.00)/100.00) + " is to expensive for the " + acctType + " account.");
      this.badCharge = badCharge;
        this.acctType = acctType;
    }
 


}
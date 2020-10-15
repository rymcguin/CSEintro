/*
CSE 17
Ryan McGuiness
841369121
Homework #1   DEADLINE: May 23, 2019
Program: My Autobiography
*/


public class ExpenseAccount {
    public String accountName;
    private double balance;
    public double creditCardFee;
    public double limit;
    public double currentCharge = 0;

/**
 * This is the expense account constructor with 4 parameters.
 *it initialises all of the variables with its parameters.
 * @param  accountName- the account name.
 * @param  balance- the account balance, in dollars and cents
 * @param  creditCardFee- the fee assessed if a credit card has been used, represented as a percent
 * @param  limit-the allowable limit for charges.
 * @return  No return
 */

    public ExpenseAccount(String accountName, double balance, double creditCardFee, double limit) {
        this.accountName = accountName;
        this.balance = balance;
        this.creditCardFee = creditCardFee;
        this.limit = limit;
    }
/**
 * This is the expense account constructor with 3 parameters.
 *it initialises all of the variables with its parameters using the this keyword.
 * @param  accountName - the account name.
 * @param  creditCardFee- the fee assessed if a credit card has been used, represented as a percent
 * @param  limit- the allowable limit for charges.
 * @return  No return
 */
    public ExpenseAccount(String accountName, double creditCardFee, double limit) {
        this(accountName, 0, creditCardFee, limit);
    }
    
/**
 * Method get balance ios a public method that, when called returns the value
 * of the current balance.
 * @param no parameters were entered.
 * @return double- returns the current balance in dollars and cents
 */
    public double getBalance() {
        return Math.round(this.balance * 100.0) / 100.0;
    }
/**
 * Method makePayment take the charge inputted and subtracts it off of the balance. It also 
 * throws AccountDepletedException and SuspiciousChargeException if the charge is too big 
 * or if the balance is too small
 * 
 * @param charge- the charge is taken and subtracted from current balance.
 * @return void
 */
    public void makePayment(double charge)
      throws AccountDepletedException, SuspiciousChargeException{
        if (this.currentCharge > this.limit){
            throw new SuspiciousChargeException (charge, this.accountName);
        }
        if(charge >= this.balance){
            throw new AccountDepletedException();
        }
       
        this.balance -= Math.round(this.currentCharge * 100.0) / 100.0;;
    }
/**
 * the Method printInvoive take the teachers name and prints out the balance, charge, and the fee 
 * that were charged to their account
 * @param firstLastName is the first and last name of the teacher who made the charge
 * @return void it does not return anything, but it does print out the invoice.
 */
    public void printInvoice(String firstLastName) throws UnknownAccountException, SuspiciousChargeException{
//        Output format:
//        Invoice for: (First Last) \n
//                (Account name) account was charged $(amount spent as double).\n
//                (If a credit card was used:) Department credit card was used, so an additional charge of $(amount * 0.01) was also assessed.

        System.out.println("Invoice for: " + firstLastName + ".");

        if(this.accountName.equals("E") || this.accountName.equals("G")){
          if(this.currentCharge < this.limit){
          System.out.println(this.accountName + " account was charged $" + Math.round(this.currentCharge * 100.0) / 100.0 + ".");
          }else{
            throw new SuspiciousChargeException(this.currentCharge, this.accountName);
          }
        }else {
          throw new UnknownAccountException();
        }

        if(this.creditCardFee == 0.0) {
          System.out.println("No credit card was used during transaction.");
        }else{
            System.out.println("Departement credit card was used, so an addition charge of $" + Math.round((this.currentCharge * 100.00) / 100.00) * getFee());
        }
    }

    public double getFee() {
        return this.creditCardFee;
    }
}
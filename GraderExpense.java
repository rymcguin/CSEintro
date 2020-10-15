/*
CSE 17
Ryan McGuiness
841369121
Homework #1   DEADLINE: May 23, 2019
Program: My Autobiography
*/
public class GraderExpense extends ExpenseAccount {
    private static double BUDGET = 1000.00;
/**
 * This is the  Grader Expense constructor with 3 parameters.
 *it initialises all of the variables with its parameters.
 * @param  accountName- the account name.
 * @param  balance- the account balance, in dollars and cents
 * @param  creditCardFee- the fee assessed if a credit card has been used, represented as a percent
 * @return  No return
 */
    public GraderExpense(String accountName, double balance, double creditCardFee) {
        //No one charge can be over $200
      super(accountName, balance, creditCardFee , 200);
    }
/**
 * Method applyFee takes the current charge and the creditCard fee
 * and adds the fee onto the original charge.
 * @param none
 * @return void
 */
    public void applyFee() {
        this.currentCharge += (this.currentCharge * getFee()) ;
    }
 /**
 * Method makePayment take the charge inputted and subtracts it off of the balance. It also 
 * throws AccountDepletedException and SuspiciousChargeException if the charge is too big 
 * or if the balance is too small
 * 
 * @param charge- the charge is taken and subtracted from current balance.
 * @return void
 */
    public void makePayment(double charge) {
        super.currentCharge = charge;
        applyFee();
        BUDGET -= charge;
        super.makePayment(charge);
    }
/**
 * the Method printInvoive take the teachers name and prints out the balance, charge, and the fee 
 * that were charged to their account
 * @param firstLastName is the first and last name of the teacher who made the charge
 * @return void it does not return anything, but it does print out the invoice.
 */
    public void printInvoice(String firstLastName) throws UnknownAccountException{
        super.printInvoice(firstLastName);
    }
    
}
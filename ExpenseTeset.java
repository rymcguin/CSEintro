import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.*;

public class ExpenseTest{
    public static void main(String [] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileDemo filename");
            // if not, exit the program
            System.exit(1);
        }
        File file1 = new File("Open: /Users/mcguiness/Desktop/CSE017/input1.txt");
        Scanner input = new Scanner(file1);
        if (file1.exists() == false) {  // (!file.exists())
            System.out.println("File doesn't exist yet.");
            PrintWriter output = new PrintWriter(file1);
            output.println("I have written to my file.");

        }
//            String accName = "G";
//            String firstLast = "Arielle Carr";
//            double charge = 50.0;
//            String creditCardUsed = "Y";
        String accName = "G";
        String first = "n";
        String last = "Arielle Carr";
        double charge = 50.0;
        String creditCardUsed = "Y";

        while(input.hasNext()){
            accName = input.next();
            first = input.next();
            last = input.next();
            charge = input.nextDouble();
            creditCardUsed = input.next();
        }
String firstLast = first + last;

        FacultyExpense teacher1 = new FacultyExpense(accName, 2000.00, 0.03);

        //GraderExpense teacher2 = new GraderExpense(accountName, 1000.00, .01);
        try {
            teacher1.makePayment(charge);
        }catch(SuspiciousChargeException ex1){
            System.out.println(ex1);
        }catch(AccountDepletedException ex2){
            System.out.println(ex2);
        }
        try {
            teacher1.getBalance();
        }catch(UnknownAccountException ex3){
            System.out.println(ex3);
        }

        teacher1.printInvoice(firstLast);



//        java.io.File file2 = new java.io.File("facult2.txt");
//        Scanner input2 = new Scanner(file2);
//        if(file2.exists()){
//            System.out.println("File already exists.");
//            System.exit(1);
//        }
//        java.io.PrintWriter output2 = new java.io.PrintWriter(file2);
//        output2.println("E Sharon Kalafut 321.23 N");
//
//
//        java.io.File file3 = new java.io.File("faculty3.txt");
//        Scanner input3 = new Scanner(file3);
//        if(file3.exists()){
//            System.out.println("File already exists.");
//            System.exit(1);
//        }
//        java.io.PrintWriter output3 = new java.io.PrintWriter(file3);
//        output3.println("X Arielle Carr 99.50 Y");


        //        FacultyExpense teacher1 = new FacultyExpense("Ryan McGuiness", 2000.00, .03);
//        GraderExpense teacher2 = new GraderExpense("Ali Goksun", 2000.00, .01);
//        teacher1.makePayment(50.99);
//        try {
//            // make a payment
//            teacher1.makePayment(50.99);
//        } catch (AccountDepletedException ex) {
//            // print out error
//            System.out.print(AccountDepletedException);
//        }
//        catch(SuspiciousChargeException ex){
//
//        }
//        catch(UnknownAccountException ex){
//
//        }
    }
}

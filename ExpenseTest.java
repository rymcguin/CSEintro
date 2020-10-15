/*
CSE 17
Ryan McGuiness
841369121
Homework #1   DEADLINE: June 18, 2019
Program: My Autobiography
Sorting Class Provided by: Arielle Carr
*/
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.*;

public class ExpenseTest{
    public static void main(String [] args) throws Exception{ 
      File file1 = new File("/Users/mcguiness/Desktop/CSE017/input1.txt");
    
        if (file1.exists() == false) {  // (!file.exists())
            System.out.println("File doesn't exist yet.");
            PrintWriter output = new PrintWriter(file1);
            output.println("I have written to my file.");
        }

        String accName = "String" ;
        String first = "n";
        String last = "Wrong";
        double charge = 00.0;
        String creditCardUsed = "n";
        Scanner input1 = new Scanner(file1);

        while(input1.hasNext()){
            accName = input1.next();
            first = input1.next();
            last = input1.next();
            charge = input1.nextDouble();
            creditCardUsed = input1.next();
        }
       String firstLast;
       firstLast = first + last;
//Teacher 1
       GraderExpense teacher = new GraderExpense(accName, 1000.00, 0.01);
       double balance = 0;
        //GraderExpense teacher2 = new GraderExpense(accountName, 1000.00, .01);
        try {
            teacher.makePayment(charge);
        }catch(SuspiciousChargeException ex1){
            System.out.println(ex1.getMessage());
        }catch(AccountDepletedException ex2){
          System.out.println(ex2.getMessage());
        }
        
        try {
            balance = teacher.getBalance();
            System.out.println("Balance is: " + balance);
            teacher.printInvoice(firstLast);
        }catch(UnknownAccountException ex3){
            System.out.println(ex3.getMessage());
        }
        double fee = teacher.getFee();
        System.out.println("Credit card fee: " + fee);
        System.out.println("");
        System.out.println("");

        
        File file2 = new File("/Users/mcguiness/Desktop/CSE017/input2.txt");
        if (file2.exists() == false) {  // (!file.exists())
            System.out.println("File doesn't exist yet.");
            PrintWriter output = new PrintWriter(file2);
            output.println("I have written to my file.");
        }
        Scanner input2 = new Scanner(file2);
        while(input2.hasNext()){
            accName = input2.next();
            first = input2.next();
            last = input2.next();
            charge = input2.nextDouble();
            creditCardUsed = input2.next();
        }
        firstLast = first + " " + last;
//Teacher 2
        
         FacultyExpense teacher2 = new FacultyExpense(accName,50.00, 0.0);
       
        balance = 0;
       
       try {
            teacher2.makePayment(charge);
        }catch(SuspiciousChargeException ex4){
            System.out.println(ex4.getMessage());
        }catch(AccountDepletedException ex5){
          System.out.println(ex5.getMessage());
        }
        try {
            balance = teacher2.getBalance();
            System.out.println("Balance is: " + balance);
            teacher2.printInvoice(firstLast);
        }catch(UnknownAccountException ex6){
            System.out.println(ex6.getMessage());
        }
        fee = teacher2.getFee();
        System.out.println("Credit card fee: " + fee);
        System.out.println("");
        System.out.println("");

        File file3 = new File("/Users/mcguiness/Desktop/CSE017/input3.txt");
        if (file3.exists() == false) {  // (!file.exists())
            System.out.println("File doesn't exist yet.");
            PrintWriter output = new PrintWriter(file3);
            output.println("I have written to my file.");
        }
        Scanner input3 = new Scanner(file3);
        while(input3.hasNext()){
            accName = input3.next();
            first = input3.next();
            last = input3.next();
            charge = input3.nextDouble();
            creditCardUsed = input3.next();
        }
        firstLast = first + last;
//Teacher 3   
        ExpenseAccount teacher3 = new ExpenseAccount(accName, 0.00, 1000);
        
        balance = 0;
       
       try {
            teacher3.makePayment(charge);
        }catch(SuspiciousChargeException ex7){
            System.out.println(ex7.getMessage());
        }catch(AccountDepletedException ex8){
          System.out.println(ex8.getMessage());
        }
        try {
            balance = teacher3.getBalance();
            System.out.println("Balance is: " + balance);
            teacher3.printInvoice(firstLast);
        }catch(UnknownAccountException ex9){
            System.out.println(ex9.getMessage());
        }
        fee = teacher3.getFee();
        System.out.println("Credit card fee: " + fee);
        System.out.println("");
        System.out.println("");
        
       
        File file4 = new File("/Users/mcguiness/Desktop/CSE017/input4.txt");
        if (file4.exists() == false) {  // (!file.exists())
            System.out.println("File doesn't exist yet.");
            PrintWriter output = new PrintWriter(file4);
            output.println("I have written to my file.");
        }
        Scanner input4 = new Scanner(file4);
        while(input4.hasNext()){
            accName = input4.next();
            first = input4.next();
            last = input4.next();
            charge = input4.nextDouble();
            creditCardUsed = input4.next();
        }
        firstLast = first + last;
//Teacher 4
        GraderExpense teacher4 = new GraderExpense(accName, 1000, .01);
        
        balance = 0;
       
       try {
            teacher4.makePayment(charge);
        }catch(SuspiciousChargeException | AccountDepletedException ex10){
            System.out.println(ex10.getMessage());
        }
//        catch(AccountDepletedException ex11){
//          System.out.println(ex11.getMessage());
//        }
        try {
            balance = teacher4.getBalance();
            System.out.println("Balance is: " + balance);
            teacher4.printInvoice(firstLast);
        }catch(UnknownAccountException | SuspiciousChargeException ex12){
            System.out.println(ex12.getMessage());
        }
        fee = teacher4.getFee();
        System.out.println("Credit card fee: " + fee);
        System.out.println("");
        System.out.println("");
        
        
        File file5 = new File("/Users/mcguiness/Desktop/CSE017/input5.txt");
        if (file5.exists() == false) {  // (!file.exists())
            System.out.println("File doesn't exist yet.");
            PrintWriter output = new PrintWriter(file5);
            output.println("I have written to my file.");
        }
        Scanner input5 = new Scanner(file5);
        while(input5.hasNext()){
            accName = input5.next();
            first = input5.next();
            last = input5.next();
            charge = input5.nextDouble();
            creditCardUsed = input5.next();
        }
        firstLast = first + last;

//Teacher 5  
        FacultyExpense teacher5 = new FacultyExpense(accName, 2000, .00);
        
        balance = 0;
       
       try {
            teacher5.makePayment(charge);
        }catch(SuspiciousChargeException | AccountDepletedException exa){
            System.out.println(exa.getMessage());
        }
//        catch(AccountDepletedException ex11){
//          System.out.println(ex11.getMessage());
//        }
        try {
            balance = teacher5.getBalance();
            System.out.println("Balance is: " + balance);
            teacher5.printInvoice(firstLast);
        }catch(UnknownAccountException | SuspiciousChargeException exb){
            System.out.println(exb.getMessage());
        }
        fee = teacher5.getFee();
        System.out.println("Credit card fee: " + fee);
        System.out.println("");
        System.out.println("");

        
        File file6 = new File("/Users/mcguiness/Desktop/CSE017/input6.txt");
        if (file6.exists() == false) {  // (!file.exists())
            System.out.println("File doesn't exist yet.");
            PrintWriter output = new PrintWriter(file6);
            output.println("I have written to my file.");
        }
        Scanner input6 = new Scanner(file6);
        while(input6.hasNext()){
            accName = input6.next();
            first = input6.next();
            last = input6.next();
            charge = input6.nextDouble();
            creditCardUsed = input6.next();
        }
        firstLast = first + last;

//Teacher 6
        FacultyExpense teacher6 = new FacultyExpense(accName, 2000, .03);
        
        balance = 0;
       
       try {
            teacher6.makePayment(charge);
        }catch(SuspiciousChargeException | AccountDepletedException exd){
            System.out.println(exd.getMessage());
        }
//        catch(AccountDepletedException ex11){
//          System.out.println(ex11.getMessage());
//        }
        try {
            balance = teacher6.getBalance();
            System.out.println("Balance is: " + balance);
            teacher6.printInvoice(firstLast);
        }catch(UnknownAccountException | SuspiciousChargeException exe){
            System.out.println(exe.getMessage());
        }
        fee = teacher6.getFee();
        System.out.println("Credit card fee: " + fee);
        System.out.println("");
        System.out.println("");

    }
    }



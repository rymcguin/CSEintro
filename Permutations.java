/*
CSE 17
Ryan McGuiness
841369121
Homework #5   DEADLINE: June 24, 2019
*/
import java.util.Scanner;
import java.util.*;
public class Permutations{
     /** 
     * Returns factorial 
     * @param n size of array
     * @return int facotrial
     */
  public static int factorial(int n) {
        //basecase
        //int x = 0;
      if(n > 0) {
         n =  n * factorial(n - 1);//recursive call
        } else if(n <= 1) {  
         return 1;
        }
        return n;
    }
   /** 
     * Method that makes list and catches exception s
     * @param n size of array 
     */
    public static void permute(int n) throws IndexOutOfBoundsException{
      char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      char [] list = new char[n];
      if(n < 0 || n >26){
        throw new IndexOutOfBoundsException("Invalid Integer");
      }
      for(int i = 0; i < n; i++){
        list[i] += alphabet[i];
      }
      permute(list, 0, n-1);
    }
     /** 
     * Method that prints and does the permutations recursively
     * @param list array of characters 
     * @param intial index of first char
     * @param last last index
     */
    public static void permute(char [] list, int initial, int last) { 
      if (initial == last){ 
            System.out.println(list); 
      }else{ 
            for (int i = initial; i <= last; i++){ 
                swap(list,initial,i); 
                permute(list, initial+1, last); 
                swap(list,initial,i); 
            } 
        } 
    } 
  
    /** 
     * Swap Characters at position 
     * @param list array of characters
     * @param i first letter
     * @param j swapper letter
     * @return String 
     */
    public static String swap(char [] list, int i, int j) { 
        char temp; 
        char[] charArray = list; 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
     /** 
     * Swap Characters at position 
     * @param a string value 
     * @param i position 1 
     * @param j position 2 
     * @return swapped string 
     */
    public static void main(String [] arg){
    String [] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the Integer: ");
    int n = 5;
    
    try{
      n = scnr.nextInt();
    }catch(InputMismatchException ex){
      System.out.println("Invalid Input"); 
    }
    try{
    permute(n);
    }catch(IndexOutOfBoundsException ex1){
      System.out.println(ex1.getMessage());
    }
    int answer = factorial(n);
    System.out.println("There are " + answer + " permutations of the first " + n + " letters of the alphabet.");
  }

}
  

/*
CSE 17
Ryan McGuiness
841369121
Homework #5   DEADLINE: June 24, 2019
*/
import java.util.*;
public class Combinations{
     /** 
     * Method that makes list and catches excptions 
     * @param n size of array
     */
  public static void combo(int n) 
    throws IndexOutOfBoundsException, NegativeArraySizeException{
      char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      char [] list = new char [n];
      if(n < 1 || n >26){
        throw new IndexOutOfBoundsException("Invalid Integer");
      }
      if(n<0){
        throw new NegativeArraySizeException("Integer cannot be negative");
      }
      for(int i = 0; i < n; i++){
        list[i] += alphabet[i];
      }
      printCombinations(list, n);
    }
   /** 
     * Method that calls combinations 
     * @param list list of characters
     * @param n size of array
     */
  public static void printCombinations(char [] list, int n) 
    {
        char[] data = new char[n];
        for (int i = 0; i <= list.length; i++)
            combinations(list, data, 0, n - 1, 0, i);
    }
 
   /** 
     * Swap Characters at position and prints out array
     * @param list[] Input Array
     * @param data[] Temp array
     * @param start starting index of list
     * @param end last index of list
     * @param index current index
     * @param k size the combination
     */
  public static void combinations(char[] list, char[] data, int start, int end, int index, int k){
        if (index == k){
            for (int j = 0; j < k; j++)
                System.out.print(data[j] + " ");
            System.out.println();
        }else{
 
        for (int i = start; i <= end && ((end - i + 1) >= (k - index)); i++){
            data[index] = list[i];
            combinations(list, data, i + 1, end, index + 1, k);
        }
      }
    }
    /** 
     * Main method
     */
  public static void main(String[]args){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the Integer: ");
    int n = 5;
    
    try{
      n = scnr.nextInt();
    }catch(InputMismatchException ex){
      System.out.println("Invalid Input"); 
      System.exit(1);
    }
    try{
    combo(n);
    }catch(IndexOutOfBoundsException ex1){
      System.out.println(ex1);
    }catch(NegativeArraySizeException ex2){
      System.out.println(ex2);
    }
   
  }

}
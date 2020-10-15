/*
CSE 17
Ryan McGuiness
841369121
Homework #5   DEADLINE: June 24, 2019
*/
import java.util.*;
public class CombinationsK{
  /** 
     * Swap Characters at position and prints out array
     * @param list[] Input Array
     * @param data[] Temp array
     * @param start starting index of list
     * @param end last index of list
     * @param index current index
     * @param k size the combination
     */
    public static void combinationK(char [] list, char [] data, int start, int end, int index, int k) { 
        // Current combination is ready to be printed, print it 
        if (index == k){ 
            for (int j=0; j<k; j++) 
                System.out.print(data[j]+" "); 
            System.out.println(""); 
            return; 
        } 
 
        for (int i=start; i<=end && end-i+1 >= k-index; i++) { 
            data[index] = list[i]; 
            combinationK(list, data, i+1, end, index+1, k); 
        } 
    } 

    /** 
     * Method that calls CombinationsK 
     * @param list[] Input Array
     * @param n size of array
     * @param k size the combination
     */
  public static void printCombination(char [] list , int n, int k) { 
        char [] data= new char[k]; 
        combinationK(list, data, 0, n-1, 0, k); 
    } 
  /** 
     * Method that makes list and catches excptions 
     * @param n size of array
     * @param k size of combination
     */
  public static void comboK(int n, int k) 
    throws IndexOutOfBoundsException , NegativeArraySizeException{
      char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      char [] list = new char[n];
      if(n < 1 || n >26){
        throw new IndexOutOfBoundsException("Invalid Integer");
      }
      if(k < 1 || k > 26){
        throw new IndexOutOfBoundsException("Invalid permutation size");
      }
      if(n <0 || k< 0){
        throw new NegativeArraySizeException("Integer cant be negative");
      }
      for(int i = 0; i < n; i++){
        list[i] += alphabet[i];
      }
      printCombination(list,n, k);
      
    }
  /** 
     * Main method
     */
   public static void main(String[] arg){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the Integer: ");
    int n = 0;
    int k = 0; 
    try{
      n = scnr.nextInt();
      System.out.println("Enter the size of the permuations you want:");
      k = scnr.nextInt();
    }catch(InputMismatchException ex){
      System.out.println("Invalid Input"); 
      System.exit(1);
    }
    try{
    comboK(n,k);
    }catch(IndexOutOfBoundsException ex1){
      System.out.println(ex1);
    }catch(NegativeArraySizeException ex2){
      System.out.println(ex2);
    }
  }
    
   
} 
  
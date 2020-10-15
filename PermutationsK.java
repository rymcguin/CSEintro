/*
CSE 17
Ryan McGuiness
841369121
Homework #5   DEADLINE: June 24, 2019
*/
import java.util.Scanner;
import java.util.*;
public class PermutationsK{
    /** 
     * Makes list and catches exceptions
     * @param n size of array
     * @param k size of permutations
     */
  public static void permutek(int n, int k) 
     throws IndexOutOfBoundsException, NegativeArraySizeException{
      char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      char [] list = new char[n];
      if(n < 1 || n >26){
        throw new IndexOutOfBoundsException("Invalid Integer");
      }
      if(k < 1 || k > 26){
        throw new IndexOutOfBoundsException("Invalid permutation size");
      }
      if(n < 0){
        throw new NegativeArraySizeException("Integer cannot be negative");
      }
      if(k< 0){
        throw new NegativeArraySizeException("Permutation size cannot be negative");
      }
      for(int i = 0; i < n; i++){
        list[i] += alphabet[i];
      }
      permK(list,n,0, k);
    }
 /** 
     * Prints array
     * @param list array of characters
     * @param n size of array 
     */
  public static void printArr(char [] list, int n){
       for (int i=0; i<n; i++){
            System.out.print(list[i] + " "); 
       }
       System.out.println();
     }
   /** 
     * Permutes list
     * @param list array of characters
     * @param n size of array
     * @param i index
     * @param k size of permutations
     */
  public static void permK(char[] list,int n, int i, int k){
    if(i == k){
    printArr(list,k);
    return;
    }

    for(int x=i; x<n; x++){
    swap(list, i, x);
    permK(list,n, i+1, k);    
    swap(list, i, x);
    }
}
   /** 
     * Swap Characters at position 
     * @param list array of characters
     * @param i index of character
     * @param j swappoing character
     */
  public static String swap(char [] list, int i, int j){ 
        char temp; 
        char [] charArray = list;
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
   } 
  
 /** 
     * Main method
     */ 
  public static void main(String []args){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the integer of the first 'n' letters of the alphabet you want to use: ");
    int n = 0;
    int k = 0;
    try{
      n = scnr.nextInt();
      System.out.println("Enter the size of the permuations you want:");
      k = scnr.nextInt();
    }catch(InputMismatchException ex){
      System.out.println("Invalid Input"); 
    }
    try{
    permutek(n,k);
    }catch(IndexOutOfBoundsException ex1){
      System.out.println(ex1);
    }catch(NegativeArraySizeException ex2){
      System.out.println(ex2);
    }
    
  }
 
}

                                                
                                               
  
  
  
  
  
  

  
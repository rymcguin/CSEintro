/*
CSE 17
Ryan McGuiness
841369121
Homework #1   DEADLINE: June 27, 2019
Program: ComplexityAnalysis
Sorting Class Provided by: Arielle Carr
*/
public class BubbleSort{
  
  public static void bubbleSort(int[] list) { 
    boolean needNextPass = true; 
    for (int k=1; k < list.length && needNextPass; k++) { 
      needNextPass = false;  // pass not needed until a swap 
      // last k-1 elements are already sorted 
      for (int i=0; i < list.length - k; i++) { 
        if (list[i] > list[i+1]) { 
          // swap them 
          int temp = list[i]; 
          list[i] = list[i+1]; 
          list[i+1] = temp; 
          needNextPass = true; 
        } 
      } 
    } 
  } 
} 
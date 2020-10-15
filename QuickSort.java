/*
CSE 17
Ryan McGuiness
841369121
Homework #1   DEADLINE: June 27, 2019
Program: ComplexityAnalysis
Sorting Class Provided by: Arielle Carr
*/
public class QuickSort { 
  public static void quickSort(int[] list) { 
    quickSort(list, 0, list.length - 1); 
  } 
  /** Quick sort a sublist starting from first and ending with last */ 
  private static void quickSort(int[] list, int first, int last) { 
    if (last > first) { 
      int pivotIndex = partition(list, first, last); 
      quickSort(list, first, pivotIndex - 1); 
      quickSort(list, pivotIndex + 1, last); 
    } 
  } 
  private static int partition(int[] list, int first, int last) { 
    int pivot = list[first]; 
    int low = first + 1; 
    int high = last; 
    while (high > low) { 
      // look for leftmost element > pivot 
      // the <= pivot below is need if there are dupes in list 
      while (low <= high && list[low] <= pivot) 
        low++; 
      // look for rightmost element <= pivot 
      while (low <= high && list[high] > pivot) 
        high--; 
      if (high > low) {                        // then swap 
        int temp = list[high]; 
        list[high] = list[low]; 
        list[low] = temp; 
      } 
    } 
    // find where pivot needs to be placed 
    while (high > first && list[high] >= pivot) 
      high--; 
    // swap pivot with list[high] 
    if (pivot > list[high]) { 
      list[first] = list[high]; 
      list[high] = pivot; 
      return high; 
    } 
    else 
      return first; 
  } 
  
  public static void main(String args[]){
    int[] list = {6, 2, 8, 1, 9, 15, 3, -1}; 
    quickSort(list); 
    System.out.println(java.util.Arrays.toString(list)); 
    
  }
} 
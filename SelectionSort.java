/*
CSE 17
Ryan McGuiness
841369121
Homework #1   DEADLINE: June 27, 2019
Program: ComplexityAnalysis
Sorting Class Provided by: Arielle Carr
*/
/** Implements the selection sort algorithm. */
public class SelectionSort {
  /** Sort the array using selection sort algorithm. 
    @pre table contains Comparable objects.
    @post table is sorted.
    @param table The array to be sorted
    */
  public static void sort(int[] table) {
    int n = table.length;
    for (int fill = 0; fill < n - 1; fill++) {
      int posMin = fill;
      for (int next = fill + 1; next < n; next++) {
        if (table[next] > table[posMin]) {
          posMin = next;
        }
      }
      // Exchange table[fill] and table[posMin]. 
      int temp = table[fill];
      table[fill] = table[posMin];
      table[posMin] = temp;

    }

  }
}
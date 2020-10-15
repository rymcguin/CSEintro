/*
CSE 17
Ryan McGuiness
841369121
Homework #1   DEADLINE: June 27, 2019
Program: ComplexityAnalysis
Sorting Class Provided by: Arielle Carr
*/
/** Implements the insertion sort algorithm. */
public class InsertionSort {
  /** Sort the table using insertion sort algorithm. @pre table contains Comparable objects.
    @post table is sorted.
    @param table The array to be sorted
    */

  public static /*<T extends Comparable<T>>*/ void insertionsort(int[] table) {
    for (int nextPos = 1; nextPos < table.length; nextPos++) {
    // Insert element at position nextPos
    // in the sorted subarray.
      insert(table, nextPos);
    } // End for. 
  } // End sort.
  
  /** Insert the element at nextPos where it belongs in the array.
    @pre table[0 . . . nextPos ‐ 1] is sorted.
    @post table[0 . . . nextPos] is sorted.
    @param table The array being sorted
    @param nextPos The position of the element to insert
    */
  private static/* <T extends Comparable<T>>*/ void insert(int[] table, int nextPos) {
    int nextVal = table[nextPos];
    // Element to insert.
    while (nextPos > 0 && nextVal > table[nextPos - 1]) {
      table[nextPos] = table[nextPos - 1];
      // Shift down.
      nextPos--;
      // Check next smaller element.
    }
    // Insert nextVal at nextPos. 
    table[nextPos] = nextVal;
  } 
}
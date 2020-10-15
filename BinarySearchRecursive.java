public class BinarySearchRecursive{
  
  public static void main(String[] args){
    Integer[] myListR = {2, 4, 7, 9, 10, 11, 19, 29, 30};
    int[] myListI = {2, 4, 7, 9, 10, 11, 19, 29, 30};
    //int key = 5;
    Integer key = 29;
    int indKeyR = binarySearch(myListR, key);
    int indKeyI = binarySearchIter(myListI, key);
    System.out.println(indKeyR);
    System.out.println(indKeyI);
  }
  
  /** Recursive binary search method (in RecursiveMethods.java). @param <T> The item type
    @param items The array being searched
    @param target The object being searched for
    @param first The subscript of the first element
    @param last The subscript of the last element
    @return The subscript of target if found; otherwise –1.
    */
  private static <T> int binarySearch(T[] items, Comparable<T> target, int first, int last) {
    int compResult;
    if (first > last){
      return -1; // Base case for unsuccessful search.
    }else {
      int middle = (first + last) / 2; // Next probe index. 
      System.out.println(middle);
      compResult = target.compareTo(items[middle]);
      if (compResult == 0){
        return middle; // Base case for successful search. 
      }else if (compResult < 0){
        System.out.println(first + ", " + middle+ ",  "+ last);
        return binarySearch(items, target, first, middle - 1);
      }else if(compResult > 0){
        System.out.println(first + ", " + middle+ ",  "+ last);
        return binarySearch(items, target, middle + 1, last);
      }
    }
    return compResult;
  }
  /** Wrapper for recursive binary search method (in RecursiveMethods.java). @param <T> The item type.
    @param items The array being searched
    @param target The object being searched for
    @return The subscript of target if found; otherwise –1. */
    public static <T> int binarySearch(T[] items, Comparable<T> target) {
      return binarySearch(items, target, 0, items.length - 1);
    }
    
    public static int binarySearchIter(int[] list, int key) {
      // Note that this implementation DOES loop through
      // and continue to search for an element.  This is
      // our second, and correct, implementation of binary 
      // search
      int low = 0;
      int high = list.length-1;
      while(high >= low) {
        int mid = (low + high)/2;
        if (key < list[mid]) {
          high = mid - 1;
        }
        else if (key == list[mid]) {
          return mid;
        }
        else {
          low = mid + 1;
        }
      }
      return -1;
      //return -low - 1;
      // When a key is not found, low is the insertion point where
      // a key would be inserted to maintain the order of the list.
    }
}
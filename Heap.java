/*
CSE 17
Ryan McGuiness
841369121
Homework #1   DEADLINE: June 27, 2019
Program: ComplexityAnalysis
Sorting Class Provided by: Arielle Carr
*/
import java.util.ArrayList;

/** A heap data structure. Contains operations to add and remove from the heap,
  * as well as check its size. */
public class Heap<E extends Comparable<E>> {
  private ArrayList<E> list = new ArrayList<E>();
  
  /** No-arg constrcutors does nothing. */
  public Heap() {
  }
  
  /** Create a heap from an array of objects. */
  public Heap(E[] objects) {
    for (int i=0; i < objects.length; i++)
      add(objects[i]);
  }
  
  /** Add a new object to the heap. */
  public void add(E newObject) {
    list.add(newObject);      // put at end of the heap
    int currentIndex = list.size() - 1;
    
    while (currentIndex > 0) {
      int parentIndex = (currentIndex - 1) / 2;
      // swap if current object is greater than its parent
      if (list.get(currentIndex).compareTo(list.get(parentIndex)) > 0) {
        E temp = list.get(currentIndex);
        list.set(currentIndex, list.get(parentIndex));
        list.set(parentIndex, temp);
      }
      else
        break;        // tree is now a heap
      currentIndex = parentIndex;
    }
  }
  
  /** Remove the root from the heap. */
  public E remove() {
    if (list.size() == 0) return null;
    
    E removedObject = list.get(0);
    // set root to last object
    list.set(0, list.get(list.size() -1));
    list.remove(list.size() - 1);
    
    int currentIndex = 0;
    while (currentIndex < list.size()) {
      int leftChildIndex = 2 * currentIndex + 1;
      int rightChildIndex = 2 * currentIndex + 2;
            
      // find the max of the two children (if they exist)
      if (leftChildIndex >= list.size())
        break;                                // tree is a heap
      int maxIndex = leftChildIndex;
      if (rightChildIndex < list.size()) {
        if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0) {
          maxIndex = rightChildIndex;
        }
      }
      
      // swap if the current node is less than the max
      if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0) {
        E temp = list.get(maxIndex);
        list.set(maxIndex, list.get(currentIndex));
        list.set(currentIndex, temp);
        currentIndex = maxIndex;
      }
      else
        break;      // tree is a heap;
    }
    return removedObject;
  }
  
  public int getSize() {
    return list.size();
  }
  
  public static void main(String[] args) {
    Heap<Integer> heap = new Heap<Integer>(new Integer[]{8,9,2,3,4,1,5,6,7});
    
    while (heap.getSize() > 0)
      System.out.print(heap.remove() + " ");
    System.out.println();
  }
  
}
      
public class stackOfIntegers{
  private int[] elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 16;
  //inlcude javadoc comments
  //Need java doc for each constructor
  
  /**
   * Constructor that creates a stack holding up to 16 elements
   * */
  public stackOfIntegers(){
    //SIZE DEFAULTS TO 0
    //size = 0;
    elements = new int [DEFAULT_CAPACITY];
  }
  /**
   * Constructor that creates a stack with 
   * a user specified number of elements
   * */
  public stackOfIntegers(int capacity){
  size = 0;
  elements = new int[capacity];
  }
  /**
   * Method that returns true if the stack is empty
   * (has no elements)
   * */
  public boolean empty(){
   return size == 0;
  }
  /**
   * Method that returns the top element of the stack
   * (w/o removing the element)
   * */
  public int peek(){
    if(!empty()){
      return elements[size - 1];
    }
    else {
      return -1;
    }
  }
  /**
   * Stores an integer at the top of the stack 
   * */
  public void push(int value){
    if(size == elements.length){
      System.out.print("Stack is full");
      //return;
    }
    else{
    elements[size++] = value;
    }
  }
  /**
   * Removes the integer from the top of the stack
   * and return it
   * */
  public int pop(){
  int topElem = peek();
  if(topElem == -1){
    System.out.print("Stack is empty");
    return topElem;
  }
  else{
    size--;
    return topElem;
  }
  }
  /**
   * Retrurns number of elements in stack
   * */
  public int getSize(){
    return size;
  }
  
  
}
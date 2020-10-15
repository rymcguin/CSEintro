/*
CSE 17
Ryan McGuiness
841369121
Homework #1   DEADLINE: June 28, 2019
Program: ComplexityAnalysis

Sorting Classes Provided by: Arielle Carr
*/
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.*;

public class ComplexityAnalysis{
  /*Main method prints to a file a list of sorting algorithms and their runtimes
   * @param arrayRand an array randomly filled with 1000 integers
   * @param arrayAsc an array filled with 1000 integers in ascending order
   * @param arrayDes an array filled with 1000 integers in descending order
   * @param arraySame an array filled with 1000 of the same integers. 
   * */
  public static void main(String [] arg)throws Exception{
    int[] arrayRand;
    int[] arrayAsc;
    int[] arrayDes;
    int[] arraySame;
    long avgRun;
    long total=0;
    
    arrayDes = getDes();
    arrayAsc = getAsc();

    for(int i = 0; i < 10; i++){
      arrayRand = getRand();
      total += mergeTime(arrayRand);
    }
    avgRun = total/10;
    int [] ar = getRand();
    SelectionSort.sort(ar);
    printArr(ar);
    
     File file1 = new File("/Users/mcguiness/Desktop/CSE017/SortingStats.txt");
     PrintWriter output = new PrintWriter("SortingStats.txt", "utf-8");
     output.println("Sort Name | Ascending | Descending | Random ");
     output.println("Merge Sort | " + mergeTime(arrayAsc) + " | " + mergeTime(arrayDes) + " | " + avgRun + " microseconds");
     arrayDes = getDes();
     arrayAsc = getAsc();
    
     for(int i = 0; i < 10; i++){
       arrayRand = getRand();
       total += bubbleTime(arrayRand);
     }
     avgRun = total/10;
     output.println("Bubble Sort | " + bubbleTime(arrayAsc) + " | " + bubbleTime(arrayDes) + " | " + avgRun + " microseconds");
     arrayDes = getDes();
     arrayAsc = getAsc();

     for(int i = 0; i < 10; i++){
       arrayRand = getRand();
       total += insertionTime(arrayRand);
     }
     avgRun = total/10;
     output.println("Insertion Sort | " + insertionTime(arrayAsc) + " | " + insertionTime(arrayDes) + " | " + avgRun + " microseconds");
     arrayDes = getDes();
     arrayAsc = getAsc();

     for(int i = 0; i < 10; i++){
       arrayRand = getRand();
       total += selectionTime(arrayRand);
     }
     avgRun = total/10;
     output.println("Selection Sort | " + selectionTime(arrayAsc) + " | " + selectionTime(arrayDes) + " | " + avgRun + " microseconds");
     arrayDes = getDes();
     arrayAsc = getAsc();

     for(int i = 0; i < 10; i++){
       arrayRand = getRand();
       total += quickTime(arrayRand);
     }
     avgRun = total/10;
     output.println("Quick Sort | " + quickTime(arrayAsc) + " | " + quickTime(arrayDes) + " | " + avgRun + " microseconds");
     arrayDes = getDes();
     arrayAsc = getAsc();

     for(int i = 0; i < 10; i++){
       arrayRand = getRand();
       total += heapTime(arrayRand);
     }
     avgRun = total/10;
     output.println("Heap Sort | " + heapTime(arrayAsc) + " | " + heapTime(arrayDes) + " | " + avgRun + " microseconds");
     output.println();
     output.println();
     output.println("Sort Name | Worst Case | Best Case | Running time ");
     output.println("Merge Sort | " + avgRun + " | " + mergeTime(arrayAsc) + " | " + avgRun + " microseconds");
     arrayDes = getDes();
     arrayAsc = getAsc();
    
     for(int i = 0; i < 10; i++){
       arrayRand = getRand();
       total += bubbleTime(arrayRand);
     }
     avgRun = total/10;
     output.println("Bubble Sort | " + avgRun + " | " + bubbleTime(arrayAsc) + " | " + avgRun + " microseconds");
     arrayDes = getDes();
     arrayAsc = getAsc();

     for(int i = 0; i < 10; i++){
       arrayRand = getRand();
       total += insertionTime(arrayRand);
     }
     avgRun = total/10;
     output.println("Insertion Sort | " + avgRun + " | " + insertionTime(arrayDes) + " | " + avgRun + " microseconds");
     arrayDes = getDes();
     arrayAsc = getAsc();

     for(int i = 0; i < 10; i++){
       arrayRand = getRand();
       total += selectionTime(arrayRand);
     }
     avgRun = total/10;
     output.println("Selection Sort | " + avgRun + " | " + selectionTime(arrayDes) + " | " + avgRun + " microseconds");
     arrayDes = getDes();
     arrayAsc = getAsc();

     for(int i = 0; i < 10; i++){
       arrayRand = getRand();
       total += quickTime(arrayRand);
     }
     avgRun = total/10;
     output.println("Quick Sort | " + avgRun + " | " + quickTime(arrayAsc) + " | " + avgRun + " microseconds");
     arrayDes = getDes();
     arrayAsc = getAsc();
     arraySame = getSame();
     for(int i = 0; i < 10; i++){
       arrayRand = getRand();
       total += heapTime(arrayRand);
     }
     avgRun = total/10;
     output.println("Heap Sort | " + avgRun + " | " + quickTime(arrayAsc) + " | " + avgRun + " microseconds");
     output.close();
  }
  private static long bubbleTime(int [] arr){
    long startTime = System.nanoTime();
    BubbleSort.bubbleSort(arr);
    long endTime = System.nanoTime();
    
    long duration = (endTime - startTime);
    //printArr(arr);
    return duration/1000; 
  }
  private static long insertionTime(int [] arr){
    long startTime = System.nanoTime();
    InsertionSort.insertionsort(arr);
    long endTime = System.nanoTime();
    
    long duration = (endTime - startTime);
    //printArr(arr);
    return duration/1000; 
  }
  private static long quickTime(int [] arr){
    long startTime = System.nanoTime();
    QuickSort.quickSort(arr);
    long endTime = System.nanoTime();
    
    long duration = (endTime - startTime);
    //printArr(arr);
    return duration/1000; 
  }
  private static long selectionTime(int [] arr){
    long startTime = System.nanoTime();
    SelectionSort.sort(arr);
    long endTime = System.nanoTime();
    
    long duration = (endTime - startTime);
    //printArr(arr);
    return duration/1000; 
    
  }
  private static long heapTime(int [] arr){
    long startTime = System.nanoTime();
    HeapSort.heapSort(arr);
    long endTime = System.nanoTime();
    
    long duration = (endTime - startTime);
    //printArr(arr);
    return duration/1000; 
    
  }
  private static long mergeTime(int[] arr){
    long startTime = System.nanoTime();
    MergeSort.mergeSort(arr);
    long endTime = System.nanoTime();
    
    long duration = (endTime - startTime);
    //printArr(arr);
    return duration/1000; 
  }
  private static int[] getRand(){
    int[] rand = new int[1000];
    int total=0;
    for(int i = 0; i < rand.length; i++) {
      rand[i] = (int)(Math.random() * 1000);
      total += rand[i];
      }
    return rand;
  }
  private static int[] getDes(){
    int[] des = new int[1000];
    int j = 1000;
    for(int i = 0; i < des.length; i++){
      des[i] = j;
      j--;
    }
    return des;
    }
  private static int[] getAsc(){
    int [] asc = new int[1000];
    int j = 1;
    for(int i = 0; i < asc.length; i++){ 
      asc[i] = j;
      j++;
    }
    return asc;
  }
  private static int[] getSame(){
    int [] asc = new int[1000];
    
    for(int i = 0; i < asc.length; i++){ 
      asc[i] = 1;
     
    }
    return asc;
  }
  private static void printArr(int[] arr){
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + ", ");
    }
   System.out.println();
  }
  
} 

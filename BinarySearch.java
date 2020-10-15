public class BinarySearch{
  public static int binSearch(int[]list, int key){
    return binSearch(list, key, 0, list.length-1);
  }
  public static int binSearch(int[]list, int key, int low, int high){
    int mid = (high + low)/2;
    if(low > high){
      return -1;
    }else if(list[mid] == key){
        return mid;
      }else if(list[mid] < key){
        return binSearch(list, key, mid + 1, high);
      }else{
        return binSearch(list, key, low, mid - 1);
      }
      
  }
  public static void main(String [] arg){
    int [] list = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int index = binSearch(list, 12);
    System.out.println(index);
  }
}
import java.util.*;
public class TwoSum{
  public static void main(String[] args){
    // define a sample array
    int[] arr = new int[]{5,7,10,11,15};
    // define a target for two elements of the arrays to be added
    int target = 17;

    //iterate in O(n^2) time complexity with nested loops
    for (int i = 0; i < arr.length; i++){
      for(int j = i+1; j < arr.length; j++){
        // if the array at position i = j, then an array of those two indices are created
        if (arr[i] + arr[j] == target){
          int[] arr1 = new int[]{i,j};
          System.out.println(Arrays.toString(arr1));
        }
      }
    }
    //return an empty array if there is nothing that works

}
}

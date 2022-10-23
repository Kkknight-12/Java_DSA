package LearnBasics.LinearDataStructure.Array.Challenges.TwoNumbersAddUptoN;

import java.util.Arrays;

public class TwoNumbersAddUptoNOwn {
  public static void main(String[] args) {

    int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
    int value = 27;

    int[] result = findSum(arr, value);

    System.out.println(Arrays.toString(result));
  }

  public static int[] findSum(int[] arr, int n) {
    int[] result = new int[2];
    int innerLoopPointer = 0;


    // write your code here
    for ( int i = 0; i < arr.length; i++ ) {
      int searchVal = n - arr[i];

      for ( int j = innerLoopPointer; j < arr.length; j++ ) {
        if ( searchVal == arr[j] ) {
          result[0] = arr[innerLoopPointer];
          result[1] = arr[j];
        }
      }
      innerLoopPointer++;
    }
    return result;   // return the elements in the array whose sum is equal to the value passed as parameter
  }
}

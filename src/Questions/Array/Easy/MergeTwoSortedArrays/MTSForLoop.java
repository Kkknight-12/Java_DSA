package Questions.Array.Easy.MergeTwoSortedArrays;

import java.util.Arrays;

public class MTSForLoop {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 6, 7, 9, 10 };

        int[] resulantArray = mergeArrays(arr1, arr2);

        System.out.println(Arrays.toString(resulantArray));
    }

    // merge arr1 and arr2 into a new result array
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] newarr = new int[length];
        int newarrIndex = 0;

        for ( int i = 0; i < arr1.length; i++ ) {
            newarr[newarrIndex++] = arr1[i];
        }

        for ( int i = 0; i < arr2.length; i++ ) {
            newarr[newarrIndex++] = arr2[i];
        }

        // write your code here
        return newarr; // make a new resultant array and return your results in that
    }
}

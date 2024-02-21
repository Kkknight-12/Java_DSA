package Questions.Array.Easy.MergeTwoSortedArrays;

import java.util.Arrays;

public class MTSWhile {

    public static void main(String[] args) {
        int[] arr1 = { 1, 12, 14, 17, 23 }; // creating a sorted array called arr1
        int[] arr2 = { 11, 19, 27 };  // creating a sorted array called arr2

        int s1 = arr1.length;
        int s2 = arr2.length;
        int[] resultantArray = new int[s1 + s2];
        int i = 0, j = 0, k = 0;

        // i will point out the position of iterator in s1 array
        // while j will point out for s1 array
        // loop will break if any one of the array is exhausted
        while ( i < s1 && j < s2 ) {
            if ( arr1[i] < arr2[j] )
                resultantArray[k++] = arr1[i++];
            else
                resultantArray[k++] = arr2[j++];
        }

        // below two while will run to exhaust the array which still have some elements in it

        // Store remaining elements of first array
        while ( i < s1 )
            resultantArray[k++] = arr1[i++];

        // Store remaining elements of second array
        while ( j < s2 )
            resultantArray[k++] = arr2[j++];

        System.out.println(Arrays.toString(resultantArray));
    }
}

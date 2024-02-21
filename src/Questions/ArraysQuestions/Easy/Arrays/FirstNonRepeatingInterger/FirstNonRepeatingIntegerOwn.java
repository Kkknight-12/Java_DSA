package Questions.ArraysQuestions.Easy.Arrays.FirstNonRepeatingInterger;

import java.util.HashMap;

/*
 * help from https://www.geeksforgeeks.org/non-repeating-element/ */


public class FirstNonRepeatingIntegerOwn {
    public static void main(String[] args) {

//    int[] arr = {2, 3, 2, 3, 6, 6, 9};
//    int[] arr = {2, 54, 2, 54};
        int[] arr = { 2, 54, 2, 3, 5, 3, 5 };
        System.out.print(checkNonRepeating(arr, arr.length));

    }

    static int checkNonRepeating(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for ( int i = 0; i < n; i++ ) {
            int j = 0;
            // if iterate value is in map than do need to run for loop
            if ( !map.containsKey(arr[i]) ) {
                for ( j = 0; j < n; j++ ) {

                    // check duplicates
                    // if duplicate
                    if ( arr[i] == arr[j] && i != j ) {
                        // store the duplicate in map
                        map.put(arr[i], i);
                        break;
                    }
                }
            }
            if ( j == n ) {
                return arr[i];
            }
        }
        return -1;
    }
}

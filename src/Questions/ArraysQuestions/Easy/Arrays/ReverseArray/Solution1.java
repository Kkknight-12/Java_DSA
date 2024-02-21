package Questions.ArraysQuestions.Easy.Arrays.ReverseArray;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length_of_array1 = sc.nextInt();
        int[] arr = new int[length_of_array1];

        //
        for ( int i = 0; i < length_of_array1; i++ ) {
            arr[i] = sc.nextInt();
        }

        ReverseArray(arr);
        PrintArray(arr);
    }

    static void ReverseArray(int[] arr) {
        int L = 0;
        int R = arr.length - 1;

        //        0    1   2   3
        // arr = {10, 20, 30, 40};
        // iteration 1 -> { 40, 20, 30, 10 }  ; L -> 0, R -> 3 swapped
        // elements at 0 and 3
        // iteration 2 -> { 40, 30, 20, 10 }  ; L -> 1, R -> 2
        // iteration 3 ->  L -> 2, R -> 1
        // L > R,  while breaks
        while ( L < R ) {
            int temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;
        }
    }

    static void PrintArray(int[] arr) {
        for ( int ele : arr ) {
            System.out.println(ele);
        }
    }
}

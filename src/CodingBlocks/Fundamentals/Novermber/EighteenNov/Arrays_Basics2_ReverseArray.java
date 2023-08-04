package CodingBlocks.Fundamentals.Novermber.EighteenNov;

import java.util.Arrays;

public class Arrays_Basics2_ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr) {
        int left_pointer = 0;
        int right_pointer = arr.length - 1;

        while ( left_pointer < right_pointer ) {
            int temp = arr[left_pointer];
            arr[left_pointer] = arr[right_pointer];
            arr[right_pointer] = temp;
            left_pointer++;
            right_pointer--;
        }
    }
}

/*
*  public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        System.out.println(Arrays.toString(arr));
        ReverseArr(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void ReverseArr(int[] arr) {
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
    *  */
package CodingBlocks.Fundamentals.EighteenNov;

import java.util.Arrays;

public class Arrays_Basics2_ReverseArray {
    public static void main(String[] args) {
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
        while ( L < R ) {
            int temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;
        }
    }
}

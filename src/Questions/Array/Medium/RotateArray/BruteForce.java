package Questions.Array.Medium.RotateArray;

import java.util.Arrays;

public class BruteForce {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int rotation = 3;
        int rotate = rotation % arr.length;
        System.out.println("rotation " + rotate);
        rotateArray(arr, rotate);
        /*
         * 1 => 50 | 10, 20, 30, 40
         * 2 => 40 | 50, 10, 20, 30
         * 3 => 30 | 40, 50, 10, 20
         * 4 => 20 | 30, 40, 50, 10
         * 5 => 10 | 20, 30, 40, 50 ( completely rotated )
         *  */
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArray(int[] arr, int rotate) {
        int n = arr.length;
        for ( int i = 0; i < rotate; i++ ) {
            int temp = arr[n - 1];
            for ( int j = n - 1; j > 0; j-- ) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }

}

/*
 * Logic
 *
 * - we store the last element in a temp variable
 * - i.e => 50
 *
 * - then we shift remaining element  to right
 *           ⇒   ⇒   ⇒   ⇒  ⇒
 * - i.e => 10, 20, 30, 40, 50
 *
 *  iterations
 * 1 => 10, 20, 30, 40, 40
 * 2 => 10, 20, 30, 30, 40
 * 3 => 10, 20, 20, 30, 40
 * 4 => 10, 10, 20, 30, 40
 *
 * we run this loop till element 1
 *
 * - then we store the temp value at 0th index
 * array => 50, 10, 20, 30, 40
 *
 *  */

/*
 * time complexity => O(n * d)
 * n is the length of array
 * d is the number of rotations
 *
 * space complexity => O(1)
 *
 *  */
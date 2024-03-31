package Questions.Array.Medium.RotateArray;

import java.util.Arrays;

public class Optimised {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int rotate = 7;

        // rotation follow a pattern
        /*
         * 1 => 50, 10, 20, 30, 40
         * 2 => 40, 50, 10, 20, 30
         * 3 => 30, 40, 50, 10, 20
         * 4 => 20, 30, 40, 50, 10
         *  */
        // so get the remainder of rotation with length of array
        int rot = rotate % arr.length;

        // reverse the whole array
        reverseArray(arr, 0, arr.length - 1);

        // reverse the first part of array
        reverseArray(arr, 0, rot - 1);

        // reverse the second part of array
        reverseArray(arr, rot, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static int[] reverseArray(int[] arr, int l, int r) {

        // swap the elements from start and end
        // with left and right pointers
        while ( l < r ) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        return arr;
    }
}


/*
 * Logic
 *
 * array => 10, 20, 30, 40, 50
 *
 * Rotation 1 => 50, 10, 20, 30, 40
 *               --
 * Rotation 2 => 40, 50, 10, 20, 30
 *               ------
 * Rotation 3 => 30, 40, 50, 10, 20
 *               ----------
 * Rotation 4 => 20, 30, 40, 50, 10
 *               --------------
 * rotation 5 -> 10, 20, 30, 40, 50 ( completely rotated )
 *               -------------------
 *
 * suppose we have to rotate the array 7 times
 * 7 % 5 = 2
 *
 * so if we rotate the array 2 times then we will get the same array
 *
 * intuition
 * - split the array into two parts
 *   as shown with rotations dry run the array with each rotation take some
 *   elements from end of the array and add it to the start of the array.
 *
 * - find the number of elements we have to take from the end of the array.
 *    The number of elements we have to take from the end of the array is the
 *    equal to rotation number.
 *    But we when the array length is less than the rotation number then we have
 *    to take the remainder of the rotation number with the length of the array.
 *    i.e => 7 % 5 = 2
 *
 * - reverse the whole array
 *   50, 40, 30, 20, 10
 *
 * - reverse the first part of array
 *   40, 50, 30, 20, 10
 *   ______
 *
 * - reverse the second part of array
 *   40, 50, 10, 20, 30
 *           ----------
 *
 * */
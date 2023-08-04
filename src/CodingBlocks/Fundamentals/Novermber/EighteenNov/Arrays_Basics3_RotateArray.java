package CodingBlocks.Fundamentals.Novermber.EighteenNov;

import java.util.Arrays;

/*
 * arr        -> 10, 20, 30, 40, 50
 *
 * rotation 1 -> 50, 10, 20, 30, 40
 * rotation 2 -> 40, 50, 10, 20, 30
 * rotation 3 -> 30, 40, 50, 10, 20
 * rotation 4 -> 20, 30, 40, 50, 10
 * rotation 5 -> 10, 20, 30, 40, 50  */
public class Arrays_Basics3_RotateArray {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println(Arrays.toString(arr));
        RotateArray(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void RotateArray(int[] arr, int rot) {
        rot = rot % arr.length;

        for ( int count = 0; count <= rot; count++ ) {
            // 1 rotation logic
            int last_element = arr[arr.length - 1]; // store last variable in
            // array
            // 50

            // starting from the second last index of array we iterate
            // we place the last element at second last element
            // {10, 20, 30, 40, 50} => {10, 20, 30, 40, 40}; // i = 3
            // {10, 20, 30, 40, 50} => {10, 20, 30, 30, 40}; // i = 2
            // {10, 20, 30, 40, 50} => {10, 20, 20, 30, 40}; // i = 1
            // {10, 20, 30, 40, 50} => {10, 10, 20, 30, 40}; // i = 0
            for ( int i = arr.length - 2; i >= 0; i-- ) {
                arr[i + 1] = arr[i];
            }

            // last_element = 50
            // {10, 10, 20, 30, 40} => {50, 10, 20, 30, 40};
            arr[0] = last_element;
        }
    }
}

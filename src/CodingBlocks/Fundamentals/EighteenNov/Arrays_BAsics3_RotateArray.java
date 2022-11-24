package CodingBlocks.Fundamentals.EighteenNov;

import java.util.Arrays;

/*
 * arr        -> 10, 20, 30, 40, 50
 *
 * rotation 1 -> 50, 10, 20, 30, 40
 * rotation 2 -> 40, 50, 10, 20, 30
 * rotation 3 -> 30, 40, 50, 10, 20
 * rotation 4 -> 20, 30, 40, 50, 10
 * rotation 5 -> 10, 20, 30, 40, 50  */
public class Arrays_BAsics3_RotateArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(arr));
        RotateArray(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void RotateArray(int[] arr, int rot) {
        rot = rot % arr.length;

        for ( int count = 0; count <= rot; count++ ) {
            // 1 rotation logic
            int temp = arr[arr.length - 1];
            for ( int i = arr.length - 2; i >= 0; i-- ) {
                arr[i + 1] = arr[i];
            }
            arr[0] = temp;
        }
    }
}

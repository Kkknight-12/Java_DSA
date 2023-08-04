package CodingBlocks.Fundamentals.Novermber.EighteenNov;

import java.util.Arrays;

/*
 * arr        -> 10, 20, 30, 40, 50
 *
 * rotation 1 -> 50, 10, 20, 30, 40
 * rotation 2 -> 40, 50, 10, 20, 30
 * rotation 3 -> 30, 40, 50, 10, 20
 * rotation 4 -> 20, 30, 40, 50, 10
 * rotation 5 -> 10, 20, 30, 40, 50
 *
 * OBSERVATION:
 * 1)
 * on each rotation number we can see that
 * number of elements which are brought forward from the end of array are
 * equal to the rotation number.
 *
 *  arr         -> 10, 20, 30, 40, 50
 *
 * now  suppose -> if we look at rotation 3 we can see that
 * array is divided in two parts
 * -> 30, 40, 50   and  10, 20
 * 30, 40, 50 which are 3 elements from end of array are brought forward in
 * array and rem elements which are from starting of array are pushed to the
 * end of array.
 *
 * 2)
 * to make it easy we first we have to rotate the array
 * ->  50, 40, 30, 20, 10
 *
 * then we split the array  ->  a )
 * -> 50, 40, 30  and  20, 10
 *
 * now we need to reverse the split parts to get the required result.
 * which is 30, 40, 50   and  10, 20
 *
 * now we need to reverse both of the split parts
 *
 * a) logic to split the array
 * The length of first part can be found with logic
 * 0 to rotation -1
 *
 * length of second part will be
 * rot to n - 1, where n is length of array
 * */
public class Arrays_Basics3_RotateArray_Optimized {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int rotate = 3;

        Rotate_Array(arr, rotate);
    }

    static void Rotate_Array(int[] arr, int rot) {
        rot = rot % arr.length;
        System.out.println(Arrays.toString(Reverse_Array(arr, 0,
            arr.length - 1)));

        System.out.println(Arrays.toString(Reverse_Array(arr, 0, rot - 1)));

        System.out.println(Arrays.toString(Reverse_Array(arr, rot,
            arr.length - 1)));
    }

    static int[] Reverse_Array(int[] arr, int l, int r) {

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
*  public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("Original Array " + Arrays.toString(arr));

        // rotate 3 times
        RotateArray(arr, 3);
    }

    public static void RotateArray(int[] arr, int rot) {
        rot = rot % arr.length;
        System.out.println("rot " + rot);

        // step 1: Reverse whole array
        ReverseArr(arr, 0, arr.length - 1);
        System.out.println("Reversed Array " + Arrays.toString(arr));

        // step 2: Reverse part 1 of split
        ReverseArr(arr, 0, rot - 1);
        System.out.println("Reversed Part 1 " + Arrays.toString(arr));

        // step 3: Reverse part 2 of split
        ReverseArr(arr, rot, arr.length - 1);
        System.out.println("Reversed Part 2 " + Arrays.toString(arr));

    }

    public static void ReverseArr(int[] arr, int L, int R) {
        while ( L < R ) {
            int temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;
        }
    }
    * */

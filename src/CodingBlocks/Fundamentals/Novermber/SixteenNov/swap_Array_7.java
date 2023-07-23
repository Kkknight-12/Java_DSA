package CodingBlocks.Fundamentals.Novermber.SixteenNov;

import java.util.Arrays;

public class swap_Array_7 {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 11, 22, 33, 44 };

        swap(arr1, arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    static void swap(int[] arr1, int[] arr2) {
        int temp[] = new int[arr1.length];
        temp[0] = arr1[0];
        arr1[0] = arr2[0];
        arr2[0] = temp[0];
    }
}

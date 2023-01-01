package LakshayaSirquestions.ArraysQuestions;

import java.util.Scanner;

public class InverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length_of_array = sc.nextInt();
        int[] arr = new int[length_of_array];

        //
        for ( int i = 0; i < length_of_array; i++ ) {
            arr[i] = sc.nextInt();
        }

        InverseArray(arr);
        PrintArray(arr);
    }

    static void InverseArray(int[] arr) {
        int temp = 0;
        int[] arr_copy = arr.clone();
        for ( int i = 0; i < arr.length; i++ ) {
            int value = arr_copy[i];
            arr[value] = i;
        }
    }

    static void PrintArray(int[] arr) {
        for ( int ele : arr ) {
            System.out.print(ele + " ");
        }
    }
}

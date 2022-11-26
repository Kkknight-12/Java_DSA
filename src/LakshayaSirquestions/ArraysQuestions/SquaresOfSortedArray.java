package LakshayaSirquestions.ArraysQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfSortedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length_of_array = sc.nextInt();
        int[] arr = new int[length_of_array];

        //
        for ( int i = 0; i < length_of_array; i++ ) {
            arr[i] = sc.nextInt();
        }

        SquareOfSumOfArray(arr);
        SortArray(arr);
        PrintArray(arr);
    }

    static void SquareOfSumOfArray(int[] arr) {
        int square = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            square = arr[i] * arr[i];
            arr[i] = square;
        }
    }

    static void SortArray(int[] arr) {

        // for each element
        for ( int i = 0; i < arr.length; i++ ) {
            // all proceeding elements will be compared
            for ( int j = i + 1; j < arr.length; j++ ) {
                int tmp = 0;

                // if the current num is greater than next
                // then swap
                if ( arr[i] > arr[j] ) {
                    tmp = arr[i];
                    arr[i] = arr[j]; // assign smaller number to current
                    arr[j] = tmp; // assign bigger number to iterator j
                }
            }
        }
    }

    static void PrintArray(int[] arr) {
        for ( int ele : arr ) {
            System.out.print(ele + " ");
        }
    }
}

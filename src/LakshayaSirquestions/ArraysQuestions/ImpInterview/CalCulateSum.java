package LakshayaSirquestions.ArraysQuestions.ImpInterview;

import java.util.Arrays;
import java.util.Scanner;

/*
 * print array in cyclic order
 * https://www.youtube.com/watch?v=-Fc6CwTqjfc */
public class CalCulateSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int length_of_array1 = sc.nextInt();
        int[] arr = new int[length_of_array1];


        //
        for ( int i = 0; i < length_of_array1; i++ ) {
            arr[i] = sc.nextInt();
        }

        //
        int num_of_operation = sc.nextInt();

        for ( int i = 0; i < num_of_operation; i++ ) {
            int mr_x = sc.nextInt();
            int[] arr_copy = new int[length_of_array1];

            for ( int j = 0; j < arr.length; j++ ) {
                if ( mr_x > 0 ) {
                    // 5 1 2 3 4
                    int temp = arr[((j + (arr.length - mr_x)) % arr.length)];
                    arr_copy[j] = temp + arr[j];
                } else {
                    arr_copy[j] = arr[j] + arr[j];
                }
            }

            // update old array with existing calculation
            arr = arr_copy;
            System.out.println(Arrays.toString(arr_copy));
        }

        int sum = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            sum = sum + arr[i];
        }

        int result = ( int ) (sum % Math.pow(10, 16));

//        System.out.println(sum);
        System.out.println(result);

    }
}

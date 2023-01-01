package LakshayaSirquestions.ArraysQuestions.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length_of_array1 = sc.nextInt();
        int[] arr = new int[length_of_array1];

        //
        for ( int i = 0; i < length_of_array1; i++ ) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        // sorting array
        Arrays.sort(arr);

        FindSumPairs(arr, target);
    }

    static void FindSumPairs(int[] arr, int target) {

        for ( int i = 0; i < arr.length - 1; i++ ) {

            for ( int j = i + 1; j < arr.length; j++ ) {

                for ( int k = j + 1; k < arr.length; k++ ) {

                    if ( arr[i] + arr[j] + arr[k] == target ) {
                        System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                    }
                }
            }
        }
    }
}

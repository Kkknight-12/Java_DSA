package LakshayaSirquestions.ArraysQuestions.TwoPointer;

import java.util.Scanner;

public class TargetSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length_of_array1 = sc.nextInt();
        int[] arr = new int[length_of_array1];

        //
        for ( int i = 0; i < length_of_array1; i++ ) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        FindSumPairs(arr, target);
    }

    static void FindSumPairs(int[] arr, int target) {

        for ( int i = 0; i < arr.length - 1; i++ ) {
            for ( int j = i + 1; j < arr.length; j++ ) {
                if ( arr[i] + arr[j] == target ) {

                    if ( arr[i] > arr[j] ) {
                        System.out.println(arr[j] + " and " + arr[i]);
                    } else {
                        System.out.println(arr[i] + " and " + arr[j]);
                    }
                }
            }
        }
    }
}

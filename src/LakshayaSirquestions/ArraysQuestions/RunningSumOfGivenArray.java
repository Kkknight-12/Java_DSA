package LakshayaSirquestions.ArraysQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOfGivenArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length_of_array = sc.nextInt();
        int[] arr = new int[length_of_array];

        //
        for ( int i = 0; i < length_of_array; i++ ) {
            arr[i] = sc.nextInt();
        }

        runningSumOfArray(arr);
    }

    static void runningSumOfArray(int[] arr) {
        int sum = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            sum = sum + arr[i];
            arr[i] = sum;
            System.out.print(arr[i] + " ");
        }
    }
}

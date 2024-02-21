package Questions.ArraysQuestions;

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

/*
*   public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };

        // Calculate the running sum in-place
        int runningSum = 0;
//        for ( int i = 0; i < arr.length; i++ ) {
//            runningSum += arr[i]; // Update running sum
//            arr[i] = runningSum; // Update the original array with running sum
//        }

        // solving same with while
        int i = 0; // Initialize the index
        while ( i < arr.length ) {
            runningSum += arr[i]; // Update running sum
            arr[i] = runningSum; // Update the original array with running sum
            i++; // Move to the next element
        }

        System.out.println(Arrays.toString(arr));
    }
    *  */

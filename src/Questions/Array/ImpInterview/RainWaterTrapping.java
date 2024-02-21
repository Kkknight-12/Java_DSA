package Questions.Array.ImpInterview;

import java.util.Scanner;

public class RainWaterTrapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number_of_testcase = sc.nextInt();

        //
        for ( int i = 0; i < number_of_testcase; i++ ) {
            int array_length = sc.nextInt();
            int[] arr = new int[array_length];

            for ( int j = 0; j < arr.length; j++ ) {
                arr[j] = sc.nextInt();
            }

            // cal water
            CalTrapWater(arr);
        }
    }

    static void CalTrapWater(int[] arr) {
        int largest_valueL = arr[0];
        int[] left = new int[arr.length];

        for ( int i = 0; i < arr.length; i++ ) {
            if ( largest_valueL < arr[i] ) {
                largest_valueL = arr[i];
            }
            left[i] = largest_valueL;
        }

        int largest_valueR = arr[arr.length - 1];
        int[] right = new int[arr.length];

        for ( int i = arr.length - 1; i >= 0; i-- ) {
            if ( largest_valueR < arr[i] ) {
                largest_valueR = arr[i];
            }
            right[i] = largest_valueR;
        }

        int array_diff = 0;
        int sum = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            if ( left[i] < right[i] ) {
                array_diff = left[i] - arr[i];
                sum = sum + array_diff;
            } else {
                array_diff = right[i] - arr[i];
                sum = sum + array_diff;
            }
        }

//        System.out.println(Arrays.toString(left));
//        System.out.println(Arrays.toString(right));
        System.out.println(sum);
    }

}

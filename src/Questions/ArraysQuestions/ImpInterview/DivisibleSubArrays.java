package Questions.ArraysQuestions.ImpInterview;

import java.util.Arrays;
import java.util.Scanner;

public class DivisibleSubArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length_of_array1 = sc.nextInt();
        int[] arr = new int[length_of_array1];

        //
        for ( int i = 0; i < length_of_array1; i++ ) {
            arr[i] = sc.nextInt();
        }

        subarraysSum(arr, arr.length);
//        subCount(arr, arr.length, arr.length);
    }

    static void subarraysSum(int[] arr, int k) {
        int[] map = new int[k];
        map[0] = 1;
        int count = 0;
        int sum = 0;

        for ( int a : arr ) {
            sum = (sum + a) % k;
            if ( sum < 0 ) {
                sum += k;
            }
            count += map[sum];
            map[sum]++;
        }
        System.out.println(count);
    }

    static int subCount(int arr[], int n, int k) {

        // create auxiliary hash array to
        // count frequency of remainders
        int mod[] = new int[k];
        Arrays.fill(mod, 0);

        // Traverse original array and compute cumulative
        // sum take remainder of this current cumulative
        // sum and increase count by 1 for this remainder
        // in mod[] array
        int cumSum = 0;
        for ( int i = 0; i < n; i++ ) {
            cumSum += arr[i];

            System.out.println("=== " + ((cumSum % k) + k) % k);
            // as the sum can be negative, taking modulo twice
            mod[((cumSum % k) + k) % k]++;
        }

        System.out.println("MOD " + Arrays.toString(mod));

        // Initialize result
        int result = 0;

        // Traverse mod[]
        for ( int i = 0; i < k; i++ )

            // If there are more than one prefix subarrays
            // with a particular mod value.
            if ( mod[i] > 1 )
                result += (mod[i] * (mod[i] - 1)) / 2;

        // add the elements which are divisible by k itself
        // i.e., the elements whose sum = 0
        result += mod[0];

        return result;
    }

}

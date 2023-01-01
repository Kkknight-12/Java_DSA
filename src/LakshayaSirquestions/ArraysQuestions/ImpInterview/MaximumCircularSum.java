package LakshayaSirquestions.ArraysQuestions.ImpInterview;

import java.util.Scanner;

public class MaximumCircularSum {
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

            // cal max sub array
            int result = maxSubarraySumCircular(arr);
            System.out.println(result);
            System.out.println();
//            maxSum(arr);
            minSum(arr);
        }
    }

    static int maxSubarraySumCircular(int[] A) {
        int total = 0, maxSum = A[0], curMax = 0, minSum = A[0], curMin = 0;
        for ( int a : A ) {
            curMax = Math.max(curMax + a, a);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + a, a);
            minSum = Math.min(minSum, curMin);
            total += a;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }

    static void maxSum(int[] a) {
        int total = 0, maxSum = a[0], curMax = 0;
        for ( int ele : a ) {
            curMax = Math.max(curMax + ele, ele);
            maxSum = Math.max(maxSum, curMax);

            System.out.println("Current Max " + curMax);
            System.out.println("Max Sum " + maxSum);
            System.out.println();
        }
    }

    static void minSum(int[] a) {
        int total = 0, minSum = a[0], curMin = 0;
        for ( int ele : a ) {
            curMin = Math.min(curMin + ele, ele);
            minSum = Math.min(minSum, curMin);

            System.out.println("Current Min " + curMin);
            System.out.println("Min Sum " + minSum);
            System.out.println();
        }
    }
}
/*
 *          0  1  2   3   4   5   6
 * arr -> [8, -8, 9, -9, 10, -11, 12]
 * initial values -> total = 0, maxSum = 8, curMax =  0, minSum = 8, curMin = 0
 * i = 0 -> total = 8,  curMax = 8,  maxSum = 8,  curMin =   8, minSum =   8
 * i = 1 -> total = 0,  curMax =  0, maxSum = 8,  curMin =  -8, minSum =  -8,
 * i = 2 -> total = 9,  curMax =  9, maxSum = 9,  curMin =   1, minSum =  -8,
 * i = 3 -> total = 0,  curMax =  0, maxSum = 9,  curMin =  -9, minSum =  -9,
 * i = 4 -> total = 10, curMax = 10, maxSum = 10, curMin =   1, minSum =  -9,
 * i = 5 -> total = -1, curMax = -1, maxSum = 10, curMin = -11, minSum = -11,
 * i = 6 -> total = 11, curMax = 12, maxSum = 12, curMin =   1, minSum = -11,
 *
 * max sum is > 0 which was 12
 * so total - minSum -> 11 - (-11) => 22 which is greater than max sum
 * to max circular sum will be 22
 *   */
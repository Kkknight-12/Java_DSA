package LakshayaSirquestions.Hard.PainterPartitionAndMinimumNumberOfPages;

import java.util.Arrays;
import java.util.Scanner;

public class PainterPartition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
//        int num_of_painters = sc.nextInt(); // num_of_paintersumber of
//        painters
//        int arr_len = sc.nextInt(); // num_of_paintersumber of boards
//        int arr[] = new int[arr_len];
//
//        for ( int i = 0; i < arr_len; i++ ) {
//            arr[i] = sc.nextInt();
//        }
        int arr[] = { 20, 50, 10, 30, 40, 80 };
        Arrays.sort(arr);
        int arr_len = arr.length;
        int num_of_painters = 3;
        System.out.println(partition(arr, arr_len, num_of_painters));
    }

    public static int partition(int arr[], int arr_len, int num_of_painters) {
        int start = maxEle(arr, arr_len); // max element in array -> 80
        int end = addEle(arr, arr_len); // summation of all the elements in
        // array
        // -> 230
//        System.out.println("start " + start);
//        System.out.println("end " + end);

        /*
         * we check if the max time we have allotted to complete the work take
         * painters more than the painter we have than we shift the start to mid
         * else if the max time we have allotted calculate the number of
         * painter which is greater than the number of painters we have than
         * twe decrease the end to mid
         */
        while ( start < end ) {
            int mid = start + (end - start) / 2;
            int requiredPainters = paintersNumber(arr, arr_len,
                mid); // 2, 3

            // if number of painters are able to complete work within time
            // then reduce or max value from end to mid
            if ( requiredPainters <= num_of_painters ) {
                end = mid;
            } else {
                // if number of painters are not able to complete work within
                // time
                // then we increase our start value from start to mid
                start = mid + 1;
            }
        }

        return start;
    }

    public static int paintersNumber(int arr[], int arr_len,
                                     int maxTime) {
        int res = 0, numPainters = 1;

        /*
         * the strategy to assign the board to worker is
         * we assign as many boards to a painter as much he can complete
         * within the give time
         * if he takes more time than given, we allot that board to the new
         * worker */
        for ( int i = 0; i < arr_len; i++ ) {
            // we add the elements
            res += arr[i];

            // check if the added elements are greater than the max time allotted
            // we reset the sum and increase the painter by 1
            if ( res > maxTime ) {
                res = arr[i];
                numPainters++;
            }
        }
        // loop runs till it reaches the end of array
        // we calculate the number of painters we have allotted for the given
        // time
        return numPainters;
    }

    public static int maxEle(int arr[], int arr_len) {

        int max = Integer.MIN_VALUE;
        for ( int i = 0; i < arr_len; i++ ) {
            if ( arr[i] > max ) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int addEle(int arr[], int arr_len) {

        int sum = 0;
        for ( int i = 0; i < arr_len; i++ ) {
            sum += arr[i];
        }
        return sum;
    }
}

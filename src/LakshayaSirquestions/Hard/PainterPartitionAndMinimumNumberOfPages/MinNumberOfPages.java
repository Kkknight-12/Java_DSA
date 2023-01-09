package LakshayaSirquestions.Hard.PainterPartitionAndMinimumNumberOfPages;

import java.util.Arrays;
import java.util.Scanner;

public class MinNumberOfPages {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int tc = sc.nextInt();
//
//        for ( int i = 0; i < tc; i++ ) {
//
//            int arr_len = sc.nextInt();
//            int num_of_students = sc.nextInt();
//
//            int[] arr = new int[arr_len];
//
//            for ( int j = 0; j < arr_len; j++ ) {
//                arr[j] = sc.nextInt();
//            }
//
//            System.out.println(Arrays.toString(arr));
//            System.out.println(books(arr, arr_len, num_of_students));
//        }

        int arr[] = { 12, 34, 67, 90 };
        int arr_len = arr.length;
        int num_of_students = 2;
        System.out.println(books(arr, arr_len, num_of_students));
    }

    public static int books(int[] arr, int arr_len, int num_of_students) {

        if ( num_of_students > arr_len ) return -1;
        int low = maxEle(arr, arr_len); // max element in array -> 80
        int high = addEle(arr, arr_len); // summation of all the elements in

        while ( low < high ) {

//            int mid = low + high >> 1;
            int mid = low + (high - low) / 2;

            int requiredStudents = studentNumbers(arr, arr_len,
                mid);

            //
            if ( requiredStudents <= num_of_students ) {
                high = mid;
            } else {
                //
                low = mid + 1;
            }
        }
        //
        return low;
    }

    public static int studentNumbers(int arr[], int arr_len,
                                     int maxnum_of_pages) {
        int res = 0, numStudents = 1;

        for ( int i = 0; i < arr_len; i++ ) {
            // we add the elements
            res += arr[i];

            //
            if ( res > maxnum_of_pages ) {
                res = arr[i];
                numStudents++;
            }
        }
        //
        return numStudents;
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

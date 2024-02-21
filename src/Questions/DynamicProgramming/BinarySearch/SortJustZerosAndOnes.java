package Questions.DynamicProgramming.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SortJustZerosAndOnes {
    public static void main(String[] args) {

//        int[] arr = {1, 0, 0, 1, 1, 0, 1};

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // using dynamic array
        int[] arr = new int[N];

        // store user numbers
        for ( int i = 0; i < N; i++ ) {
            int digit = sc.nextInt();
            arr[i] = digit;
        }

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//        for ( int i = 0; i < arr.length; i++ ) {
//            System.out.print(arr[i] + " ");
//        }
//        int[] resultarr = printSortedArray(arr);
        int[] resultarr = separate0s1sSolution2(arr);
        System.out.println(Arrays.toString(resultarr));
    }

    static int[] printSortedArray(int[] arr) {

        int count = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] == 0 ) {
                count++;
            }
        }

        for ( int i = 0; i < count; i++ ) {
            arr[i] = 0;
        }

        for ( int i = count; i < arr.length; i++ ) {
            arr[i] = 1;
        }
        return arr;
    }

    public static int[] separate0s1sSolution2(int arr[]) {

//        for ( int i = 0; i < arr.length; i++ )
        while ( true ) {
            int left = 0;
            int right = arr.length - 1;

            while ( arr[left] == 0 ) {
                left++;
            }
            while ( arr[right] == 1 ) {
                right--;
            }

            if ( left < right ) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            } else {
                break;
            }
        }
        return arr;
    }

}

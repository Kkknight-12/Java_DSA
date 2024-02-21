package Questions.Medium.Arrays;

import java.util.Scanner;

/*
 * 1
 * 4
 * 54 546 548 60 */

public class BigggestNumber {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
//        int tc = scn.nextInt();

//        while ( tc > 0 ) {
//            int n = scn.nextInt();
//            int[] arr = new int[n];
//
//            for ( int i = 0; i < arr.length; i++ ) {
//                arr[i] = scn.nextInt();
//            }
//
//            sort(arr);
////            System.out.println(Arrays.toString(arr)); // [60, 548, 546, 54]
//            display(arr);
//            tc--;
//        }
        int[] arr = { 60, 548, 546, 54 };
        sort(arr);
        display(arr); // 6054854654

    }

    public static void display(int[] arr) {

        for ( int val : arr ) {
            System.out.print(val + "");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        for ( int i = 0; i < arr.length - 1; i++ ) {
            for ( int j = 0; j < arr.length - i - 1; j++ ) {
                if ( compare(arr[j], arr[j + 1]) > 0 ) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int compare(int n1, int n2) {
        String val1 = n1 + "" + n2;
        String val2 = n2 + "" + n1;

        int val1int = Integer.valueOf(val1);
        int val2int = Integer.valueOf(val2);

        if ( val1int > val2int )
            return -1;
        else
            return 1;
    }
}

/*
 * program is using the selection sort algorithm.
 *
 * The time complexity of selection sort algorithm is also O(n^2) in the worst case, and O(n) in the best case (when the array is already sorted). The space complexity is also O(1).
 *
 * programs have a time complexity of O(n^2) in the worst case and O(n) in the best case, and the space complexity is O(1).
 * */
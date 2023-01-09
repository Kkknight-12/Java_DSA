package LakshayaSirquestions.Sorting;

import java.util.Scanner;

/*
 * https://www.wikitechy.com/interview-questions/java/what-is-linear-sort-in-java/
 *  */
public class SelectionSortArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int arr[] = new int[arrLen];

        for ( int i = 0; i < arrLen; i++ ) {
            arr[i] = sc.nextInt();
        }
//        int arr[] = { 27, 28, 45, 68, 32 };
        SelectionSort(arr);
        printArray(arr);
    }

    static void SelectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for ( int i = 0; i < n - 1; i++ ) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for ( int j = i + 1; j < n; j++ ) {
                if ( arr[j] < arr[min_idx] ) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for ( int i = 0; i < n; ++i )
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

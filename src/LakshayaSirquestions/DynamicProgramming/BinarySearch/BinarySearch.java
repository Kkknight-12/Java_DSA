package LakshayaSirquestions.DynamicProgramming.BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int arr_size = sc.nextInt();
//        int[] arr = new int[arr_size];

//        for ( int i = 0; i < arr_size; i++ ) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {3, 5, 6, 9, 78};

        int target = 6;
//        int result = getNum(arr, target);
//        System.out.println(result);
        int result = search(arr, target);
        System.out.println(result);
    }

    // beats 82%
    static int getNum(int[] arr, int t) {
        int low = 0;
        int high = arr.length - 1;

        while ( low <= high ) {
            int mid = (high + low) / 2;

            if ( arr[mid] < t ) {
                low = mid + 1;
            } else if ( arr[mid] > t ) {
                high = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    // beats 89.46%
    public static int search(int[] nums, int target) {
        // Set the left and right boundaries
        int left = 0, right = nums.length - 1;

        // Under this condition
        while ( left <= right ) {
            // Get the middle index and the middle value.
            int mid = left + (right - left) / 2;

            // Case 1, return the middle index.
            if ( nums[mid] == target ) {
                return mid;
            }
            // Case 2, discard the smaller half.
            else if ( nums[mid] < target ) {
                left = mid + 1;
            }
            // Case 3, discard the larger half.
            else {
                right = mid - 1;
            }
        }
        // If we finish the search without finding target, return -1.
        return -1;
    }

    // // beats 89.46%
    public static int search2(int[] arr, int item) {

        int lo = 0;
        int hi = arr.length - 1;

        while ( lo <= hi ) {

            int mid = (lo + hi) / 2;

            if ( arr[mid] > item ) hi = mid - 1;
            else if ( arr[mid] < item ) lo = mid + 1;
            else return mid;
        }

        return -1;
    }
}

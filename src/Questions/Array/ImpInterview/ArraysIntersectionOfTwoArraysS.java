package Questions.Array.ImpInterview;

import java.util.ArrayList;
import java.util.Arrays;


public class ArraysIntersectionOfTwoArraysS {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr1 = new int[n];
//        int[] arr2 = new int[n];
//
//        // Input for first array
//        for ( int i = 0; i < n; i++ ) {
//            arr1[i] = sc.nextInt();
//        }
//
//        // Input for second array
//        for ( int i = 0; i < n; i++ ) {
//            arr2[i] = sc.nextInt();
//        }
        int[] arr1 = { 1, 1, 1, 2, 2, 3, 4 };
        int[] arr2 = { 2, 1, 3, 1, 5, 2, 2 };

        System.out.println(findIntersection(arr1, arr2));
    }

    public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> intersection = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        while ( i < arr1.length && j < arr2.length ) {
            if ( arr1[i] < arr2[j] ) {
                i++;
            } else if ( arr1[i] > arr2[j] ) {
                j++;
            } else {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }


}

/*
 * This implementation sorts both arrays first and then uses two pointers, one
 * for each array, to iterate through them. If the element at the current
 * position in the first array is less than the element at the current
 * position in the second array, the pointer for the first array is
 * incremented.
 *
 * // array which have a smaller element is incremented
 *
 * If the element at the current position in the first array is
 * greater than the element at the current position in the second array, the
 * pointer for the second array is incremented.
 *
 * If the element at the current position in the first array is equal to the
 * element at the current position in the second array, the element is added
 * to the intersection list and both pointers are incremented. This way it
 * will only add the common element once in the intersection list and will
 * return the correct output.
 *
 * The time complexity of this solution is O(n log n) because it takes O(n
 * log n) to sort the arrays and O(n) to iterate through the arrays and find
 * the intersection. The total time complexity is the sum of the time
 * complexities of the sorting and the iteration which is O(n log n) + O(n) =
 * O(n log n).
 *  */

/* 0 1 2 3 4 5 6
 *-----------------
 * 1 1 1 2 2 3 4  |  i
 * 1 1 2 2 2 3 5  |  j
 *-----------------
 * i = 0 and j = 0 => 1
 * i = 1 and j = 1 => 1
 * i = 2 and j = 2 => i++ ( i is incremented as i is smaller )
 * i = 3 and j = 2 => 2 and +1 i, j
 * i = 4 and j = 3 => 2 and +1 i, j
 * i = 5 and j = 4 => j++
 * i = 5 and j = 5 => 3 , and i, j ++
 * i = 6 and j = 6 => i++
 * i = 7 and j = 6 => i++
 *  */

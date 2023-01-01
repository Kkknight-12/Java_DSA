package LakshayaSirquestions.ArraysQuestions;

import java.util.Arrays;

/*
 * https://www.techiedelight.com/move-zeros-present-array-end/
 *  */
public class PushZeroesToEnd2 {
    // Function to move all zeros present in the array to the end
    public static void reorder(int[] A) {
        // `k` stores the index of the next available position
        int k = 0;

        // do for each element
        for ( int i : A ) {
            // if the current element is non-zero, put the element at the
            // next free position in the array
            if ( i != 0 ) {
                A[k++] = i;
            }
        }

        // move all 0's to the end of the array (remaining indices)
        for ( int i = k; i < A.length; i++ ) {
            A[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] A = {6, 0, 8, 2, 3, 0, 4, 0, 1};

        reorder(A);
        System.out.println(Arrays.toString(A));
    }
}
/*
 *  0, 1, 2, 3, 4, 5, 6, 7, 8
 * {6, 0, 8, 2, 3, 0, 4, 0, 1};
 *
 * k is key and i is value
 *
 * k-> 0, i -> 6
 * A[0] = 6 -> nothing changes as a[0] is 6
 * k++;
 *
 * k-> 1, i -> 0
 * if condition fails
 *
 * k-> 1, i -> 8
 * A[1] = 8
 * {6, 8, 8, 2, 3, 0, 4, 0, 1};
 *     j, i
 * k++;
 *
 * k-> 2, i-> 2
 * A[2] = 2
 * {6, 8, 2, 2, 3, 0, 4, 0, 1};
 *        k, i
 *  k++;
 *
 * k-> 3, i -> 3
 * A[3] = 3
 * {6, 8, 2, 3, 3, 0, 4, 0, 1};
 *           k  i
 * k++;
 *
 * k-> 4, i -> 0
 * if condition will fail
 *  i++;
 *
 * k-> 4, i -> 4
 * A[4] = 4
 * {6, 8, 2, 3, 4, 0, 4, 0, 1};
 *              k     i
 * k++;
 *
 * k -> 5, i -> 0
 * if condition will fail
 *
 * k -> 5, i -> 1
 * A[5] = 1
 * {6, 8, 2, 3, 4, 1, 4, 0, 1};
 *                 k        i
 * k++;
 *
 * for loop will start from kth position and runs till
 * end of array
 * from 6th to 8th position
 * fill all the index with zero
 *
 * */
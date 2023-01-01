package LakshayaSirquestions.ArraysQuestions;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array/
 * https://www.enjoyalgorithms.com/blog/move-all-the-zeroes-to-the-end
 * https://www.techiedelight.com/move-zeros-present-array-end/
 *  */
public class PushZeroesToEnd {
    public static void main(String[] args) {

//        int[] X = {4, 8, 6, 0, 2, 0, 1, 15, 12, 0};

        Scanner sc = new Scanner(System.in);

        int length_of_array = sc.nextInt();
        int[] X = new int[length_of_array];

        //
        for ( int i = 0; i < length_of_array; i++ ) {
            X[i] = sc.nextInt();
        }

        moveZeroEnd(X, X.length);
        for ( int i = 0; i < X.length; i++ ) {
            System.out.print(X[i] + " ");
        }
    }

    static void moveZeroEnd(int X[], int n) {
        int j = 0;
        for ( int i = 0; i < n; i = i + 1 ) {
            if ( X[i] != 0 ) {
                swap(X, j, i);
                j = j + 1;
            }
        }
    }

    static void swap(int[] arr, int j, int i) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }
}

/*
 *  0, 1, 2, 3, 4, 5, 6,  7,  8, 9
 * {4, 8, 6, 0, 2, 0, 1, 15, 12, 0};
 *
 * i -> 0, 1, 2 -> i and j will be same and will replace each other. Will make
 *  no diff
 *
 * i -> 3, j -> 3
 * if condition will fail
 *
 * i -> 4, j -> 3
 * i value -> 2, j value -> 0
 * swap arr[4], arr[3];
 * j++;
 *  {4, 8, 6, 2, 0, 0, 1, 15, 12, 0};
 *
 * i -> 5, j -> 4
 * i value -> 0, j value -> 0
 * if condition will fail
 *
 * i -> 6, j -> 4
 * i value -> 1, j value -> 0
 * swap arr[6], arr[4];
 * j++;
 *  {4, 8, 6, 2, 1, 0, 0, 15, 12, 0};
 *               4     6
 *
 * i -> 7, j -> 5;
 * i value -> 15, j value -> 0;
 * swap arr[7], arr[5];
 * j++;
 * {4, 8, 6, 2, 1, 15, 0, 0, 12, 0};
 *                  5     7
 *
 * i -> 8, j -> 6;
 * i value -> 12, j value -> 0;
 * swap arr[8], arr[6];
 * j++;
 * {4, 8, 6, 2, 1, 15, 12, 0, 0, 0};
 *                      6     8
 *
 *  i -> 9, j -> 10;
 * for ( i < n )
 * -> loop terminate
 *
 * Observation
 *  -> on a non-zero number if condition will not run
 *      so j will remain that index whose value will obviously be 0,
 *      And i will move on to the next value.
 *
 *  -> next time if the value is non-zero if condition will run, and
 *     swap the j which is zero with i which is non-zero. j and i will be
 *     incremented.
 *     As j which was zero is switched with which is a non-zero number, we
 *     pushed zero little further in array ( right ).
 *     j's position is incremented and the incremented position will always
 *     be with value zero
 *
 * -> once j become zero i will increment till it is non-zero, and we switch
 *     non-zero i with zero j place
 *
 *
 *  { 6, 0, 2, 15, 12, 0 }
 *    0, 1, 2,  3,  4, 5
 *  i -> 0, j -> 0
 *  6 will interchange it's value  with itself
 *  j++;
 *
 *  i -> 1, j -> 1
 *  if condition will fail
 *  i++;
 *
 *  i -> 2, j -> 1
 *  swap -> arr[2], arr[1]
 *  { 6, 2, 0, 15, 12, 0 }
 *  j++;
 *
 *  i -> 3, j -> 2
 *  swap -> arr[3], arr[2]
 *  { 6, 2, 15, 0, 12, 0 }
 *  j++;
 *
 *  i -> 4, j -> 3
 *  swap -> arr[4], arr[3]
 * { 6, 2, 15, 12, 0, 0 }
 * j++;
 * */
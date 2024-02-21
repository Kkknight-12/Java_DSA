package Questions.Easy.IncreaseDecreaseSequence;

import java.util.Scanner;

/*
 * passing 6/9 cases
 *
 * Given a series of N Integers, check if it is possible to split sequence
 * into two sequences s1 to si and si to sN such that first sequence is
 * strictly decreasing and second is strictly increasing. Print true/false as
 * output.
 *
 * Input Format
 * First line contains a single integer N denoting the number of elements int
 * the series.
 * Next N lines contain a single integer each denoting the elements of the
 * array S.
 *
 * Constraints
 * 0 < N < 1000 Each number in sequence S is > 0 and < 1000000000
 *
 * Output Format
 * Print boolean output - "true" or "false" defining whether the sequence is
 * increasing - decreasing or not.
 *
 * Sample Input
 * 5
 * 1
 * 2
 * 3
 * 4
 * 5
 *
 * Sample Output
 * true
 *
 * Explanation
 * Carefully read the conditions to judge which all sequences may be valid.
 * Don't use arrays or lists.
 * */
public class IncreaseDecreaseSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean incOrder = true;
        boolean decOrder = true;

        // using dynamic array
        int[] arr = new int[N];

        // store user numbers
        for ( int i = 0; i < N; i++ ) {
            int digit = sc.nextInt();
            arr[i] = digit;
        }

        int length = arr.length - 1;

        for ( int i = 0; i < length; i++ ) {
            //
            if ( !(arr[i] < arr[i + 1]) ) {
                incOrder = false;
            }
        }

        for ( int i = 0; i < length; i++ ) {
            //
            if ( !(arr[i + 1] > arr[i]) ) {
                decOrder = false;
            }
        }

        if ( incOrder || decOrder ) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}

package LakshayaSirquestions.Easy;

import java.util.Scanner;

/* https://gist.github.com/vignesh628/552cd55acb4022cd1410e70a4899596d */

/*
 * criteria to accept the solution
 * sequence can be increasing | decreasing
 * or increasing then it can be at someplace decreasing
 * but it can't be increasing and then decreasing   */
public class IncreaseDecreaseSolution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int[] a = new int[N];

        for ( int i = 0; i < N; i++ ) {
            a[i] = s.nextInt();
        }

        int[] A = new int[N - 1];

        // if next number is equal to current num then false
        for ( int i = 0; i < N - 1; i++ ) {
            if ( a[i] == a[i + 1] ) {
                System.out.println("false");
                return;
            }
            // take the difference of current and next number and store it in
            // An array
            A[i] = a[i] - a[i + 1];
        } // for loop ends

        //
        // loop over the difference array and check if the current number is
        // any negative number and next number is positive number, which means
        // it is a sequence which is increasing and then decreasing, print false
        int i = 0;
        while ( i < N - 2 ) {
            if ( A[i] < 0 && A[i + 1] > 0 ) {
                System.out.println("false");
                return;
            }
            i++;
        } // while loop ends

        System.out.println("true");
    }

}

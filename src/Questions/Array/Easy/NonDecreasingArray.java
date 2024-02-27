package Questions.Array.Easy;

import java.util.Scanner;

//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/make-it-non-decreasing-7d3391fd/?purpose=login&source=problem-page&update=github

public class NonDecreasingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while ( t-- > 0 ) {
            int n = scanner.nextInt();
            int[] A = new int[n];

            for ( int i = 0; i < n; i++ ) {
                A[i] = scanner.nextInt();
            }

            int[] B = new int[n];

            // 1. B[i] <= B[i + 1]
            // 2. B[i] % A[i] == 0

            B[0] = A[0];

            for ( int i = 1; i < n; i++ ) {
                B[i] = Math.max(A[i], B[i - 1]);
                if ( B[i] % A[i] != 0 ) {
                    B[i] = B[i] + (A[i] - B[i] % A[i]);
                }
            }

            for ( int b : B ) {
                System.out.print(b + " ");
            }

            System.out.println();
        }
    }
}

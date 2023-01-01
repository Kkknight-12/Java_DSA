package LakshayaSirquestions.ArraysQuestions.ImpInterview.Bitonic;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.codingninjas.com/codestudio/library/maximum-sum-path
 * https://www.geeksforgeeks.org/maximum-sum-path-across-two-arrays/
 * https://www.techiedelight.com/find-maximum-sum-path-involving-elements-given-arrays/
 *
 * // practice
 * https://practice.geeksforgeeks.org/problems/max-sum-path-in-two-arrays/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article */
public class MaximumSumPathInTwoArrays {
    public static void main(String[] args) {
        // to store the size of both the arrays

        /*
         Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for ( int i = 0; i < tc; i++ ) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            int[] a = new int[n1];
            int[] b = new int[n2];

            for ( int j = 0; j < n1; j++ ) {
                a[j] = sc.nextInt();
            }

            for ( int j = 0; j < n2; j++ ) {
                b[j] = sc.nextInt();
            }

            findMaxSumPath(a, n1, b, n2);
        }*/
        //
        int n1 = 8;
        int n2 = 8;
        int[] a = {2, 3, 7, 10, 12, 15, 30, 34};
        int[] b = {1, 5, 7, 8, 10, 15, 16, 19};
        findMaxSumPath(a, n1, b, n2);
    }

    static void findMaxSumPath(int[] a, int n1, int[] b, int n2) {
        // sorting first array using inbuilt sort function of c++
        Arrays.sort(a);

        // sorting second array using inbuilt sort function of c++
        Arrays.sort(b);

        // to store the index values of both the arrays
        int i = 0, j = 0;

        // to store the individual sum of both the arrays
        // until there is a common element in both the arrays
        int sumA = 0, sumB = 0;

        // to store the final answer
        int finalSum = 0;

        while ( i < n1 && j < n2 ) {
            // if (a[i] < b[j]) then add this element
            // in sumA and increment the value of i
            if ( a[i] < b[j] ) {
//                System.out.println("a  " + a[i]);
                sumA += a[i++];
            }
            // if (b[j] < a[i]) then add this element
            // in sumB and increment the value of j
            else if ( b[j] < a[i] ) {
//                System.out.println("b " + b[j]);
                sumB += b[j++];
            } else {
                // taking max of both the sums and
                // storing it in the final answer
                finalSum += Math.max(sumA, sumB);
                System.out.println("finalSum " + finalSum);

                // reinitializing both values to zero
                sumA = sumB = 0;

                // traversing in both the arrays till they have same elements
                while ( a[i] == b[j] && i < n1 && j < n2 ) {
                    finalSum += a[i];
                    // incrementing both the indexes simultaneously
                    i++;
                    j++;
                }
            }
        }
//        System.out.println("A sum " + sumA);
//        System.out.println("B sum " + sumB);

        // to handle the edge case where the j=n2 and i is still less than n1
        while ( i < n1 ) {
            System.out.println("a & " + a[i]);
            sumA += a[i++];
        }

        // to handle the edge case where the i=n1 and j is still less than n2
        while ( j < n2 ) {
//            System.out.println("b " + b[j]);
            sumB += b[j++];
        }

        finalSum += Math.max(sumA, sumB);
        // print the maximum sum path
        System.out.println(finalSum);
    }
}

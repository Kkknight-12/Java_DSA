package LakshayaSirquestions.Hard;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.youtube.com/watch?v=wSOfYesTBRk
 * https://takeuforward.org/data-structure/aggressive-cows-detailed-solution/
 * https://hack.codingblocks.com/app/contests/3668/1056/problem
 *  */
public class AggressiveCows {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cows = sc.nextInt();
        int a[] = new int[n];

        for ( int i = 0; i < n; i++ ) {
            a[i] = sc.nextInt();
        }
//        int n = 5, cows = 3;
//        int a[] = {1, 2, 8, 4, 9};
        Arrays.sort(a);

        /*
         * low and high will be the distance between cows
         * lower bound will be the 1 ( min distance )
         * upper bound will be the last element in the array ( max distance ) */
        int low = 1, high = a[n - 1] - a[0];

        while ( low <= high ) {
            int mid = low + high >> 1;
//            System.out.println("mid " + mid); // 4, 2, 3

            if ( isPossible(a, n, cows, mid) ) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(high);
    }

    public static boolean isPossible(int a[], int n, int cows, int minDist) {
        int countCows = 1;
        int lastPlacedCow = a[0];
        for ( int i = 0; i < n; i++ ) {
            // if current element - last position of cow >= minDist
            // then we can place the cow at that stall
            if ( a[i] - lastPlacedCow >= minDist ) {
                countCows++;
                lastPlacedCow = a[i];
            }
        }
        if ( countCows >= cows ) return true;
        return false;
    }
}

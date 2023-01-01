package LakshayaSirquestions.DynamicProgramming.BinarySearch;


import java.util.Scanner;

/*
 * https://www.youtube.com/watch?v=WjpswYrS2nY
 * https://takeuforward.org/data-structure/nth-root-of-a-number-using-binary-search/
 *  */
public class NthRootOfANumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for ( int i = 0; i < tc; i++ ) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int result = getNthRoot(n, m);
            System.out.println(result);
        }
//        int n = 2, m = 9;
//        int result = getNthRoot(n, m);
//        System.out.println(result);
    }

    static int getNthRoot(int n, int m) {
        double low = 1;
        double high = m;
        double eps = 1e-7;

        while ( (high - low) > eps ) {
            double mid = (low + high) / 2.0;

            if ( multiply(mid, n) < m ) {
                low = mid;
            } else {
                high = mid;
            }
            //
            if ( Math.pow(Math.round(low), n) == m ) {
                return ( int ) Math.round(low);
            }
        }
        return -1;
    }

    static double multiply(double num, int n) {
        double ans = 1.0;
        for ( int i = 1; i <= n; i++ ) {
            ans = ans * num;
        }
        return ans;
    }
}

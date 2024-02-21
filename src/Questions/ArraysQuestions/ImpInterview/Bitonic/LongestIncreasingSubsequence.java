package Questions.ArraysQuestions.ImpInterview.Bitonic;

import java.util.Arrays;

/*
* https://www.youtube.com/watch?v=odrfUCS9sQk&t=1391s
*  */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {

        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80, 3};

        int omax = 0;
        int[] dp = new int[arr.length];

        for ( int i = 0; i < dp.length; i++ ) {
            int max = 0;

            for ( int j = 0; j < i; j++ ) {
                if ( arr[j] < arr[i] ) {
                    if ( dp[j] > max ) {
                        max = dp[j];
                    }
                }
            }

            dp[i] = max + 1;

            if ( dp[i] > omax ) {
                omax = dp[i];
            }
        }
        System.out.println("dp " + Arrays.toString(dp));
        // [1, 2, 1, 3, 2, 4, 4, 5, 6, 1]
        System.out.println(omax);
    }
}

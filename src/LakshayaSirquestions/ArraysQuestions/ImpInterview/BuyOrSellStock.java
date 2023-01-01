package LakshayaSirquestions.ArraysQuestions.ImpInterview;

import java.util.Arrays;
import java.util.Scanner;

public class BuyOrSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length_of_array1 = sc.nextInt();
        int[] arr = new int[length_of_array1];

        //
        for ( int i = 0; i < length_of_array1; i++ ) {
            arr[i] = sc.nextInt();
        }

        MaxProfit(arr);
//        int result = FindMaxProfit(arr);
//        System.out.println(result);
    }

    // Time Complexity is O(n^2)
    static void MaxProfit(int[] arr) {
        int max_profit = 0;

        for ( int i = 0; i < arr.length - 1; i++ ) {

            int profit = 0;
            int j = i + 1;
            for ( ; j < arr.length; j++ ) {
                if ( arr[j] > arr[i] ) {
                    if ( arr[j] - arr[i] > profit ) {
                        profit = arr[j] - arr[i];
                    }
                }
            }

//            if ( profit > max_profit ) {
//                max_profit = profit;
//            }
            max_profit = Math.max(profit, max_profit);
        }

        System.out.println(max_profit);
    }

    /* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/discuss/1735493/JavaC%2B%2B-best-ever-EXPLANATION-could-possible
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solutions/127440/best-time-to-buy-and-sell-stock/*/
    public static int FindMaxProfit(int[] prices) {
        int least_so_far = Integer.MAX_VALUE;
        int overall_profit = 0;
        int profit_if_sold_today;

        for ( int i = 0; i < prices.length; i++ ) {

            if ( prices[i] < least_so_far ) {
                least_so_far = prices[i];
            }

            profit_if_sold_today = prices[i] - least_so_far;

            if ( overall_profit < profit_if_sold_today ) {
                overall_profit = profit_if_sold_today;
            }
        }
        return overall_profit;
    }
}

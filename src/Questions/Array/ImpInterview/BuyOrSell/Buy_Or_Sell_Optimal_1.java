package Questions.Array.ImpInterview.BuyOrSell;

public class Buy_Or_Sell_Optimal_1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int length_of_array1 = sc.nextInt();
//        int[] arr = new int[length_of_array1];
//
//        //
//        for ( int i = 0; i < length_of_array1; i++ ) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = { 10, 8, 6, 4, 2 };
        int result = FindMaxProfit(arr);
        System.out.println(result);
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

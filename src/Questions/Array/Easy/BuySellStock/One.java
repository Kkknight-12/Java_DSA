package Questions.Array.Easy.BuySellStock;

public class One {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] arr) {

        int maxProfit = 0;
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;

        for ( int i = 0; i < arr.length; i++ ) {

//          minPrice = Math.min(minPrice, arr[i]);

            // using condition over min max as they are faster than Math.min and Math.max
            if ( arr[i] < minPrice ) {
                minPrice = arr[i];
            }

            profit = arr[i] - minPrice;
//            maxProfit = Math.max(maxProfit, profit);
            if ( profit > maxProfit ) {
                maxProfit = profit;
            }

        }

        return maxProfit;
    }
}

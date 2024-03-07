package Questions.Array.Easy.BuySellStock;

public class Two {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 4, 6 };
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for ( int i = 1; i < prices.length; i++ ) {
            if ( prices[i] > prices[i - 1] ) {
                System.out.println("today => " + prices[i]);
                System.out.println("yesterday => " + prices[i - 1]);
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;

    }
}

/*
 * The reason we don’t just hold and sell at the max price is because this
 * problem allows us to complete as many transactions as we want. This means
 * we can buy and sell the stock multiple times to maximize our profit.
 *
 * Consider this example: prices = [1, 2, 3, 4, 5]. If we buy on day 1 and
 * sell on day 5, our profit is 5 - 1 = 4. However, if we buy and sell on each
 * day, our profit is (2 - 1) + (3 - 2) + (4 - 3) + (5 - 4) = 4, which is the
 * same as the previous strategy.
 *
 * Now consider this example: prices = [1, 5, 2, 6]. If we buy on day 1 and
 * sell on day 4, our profit is 6 - 1 = 5. But if we buy on day 1, sell on day
 * 2, buy again on day 3, and sell on day 4, our profit is (5 - 1) + (6 - 2) =
 * 8, which is greater than the previous strategy.
 *
 * So, in scenarios where the stock price keeps increasing, both strategies
 * yield the same profit. But in scenarios where the stock price fluctuates,
 * buying and selling multiple times can yield a higher profit. This is why
 * the solution involves buying and selling on every profitable transaction.
 *  */
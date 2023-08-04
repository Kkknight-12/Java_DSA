package LakshayaSirquestions.ArraysQuestions.ImpInterview.BuyOrSell;

public class Buy_Or_Sell_Optimal_2 {


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

    static int FindMaxProfit(int[] arr) {
        int n = arr.length;
        if ( n == 0 ) {
            return 0; // No profit can be made if the array is empty
        }

        int maxProfit = 0;
        int minPrice = arr[0];

        for ( int i = 1; i < n; i++ ) {
            // Update the minimum stock price seen so far
            minPrice = Math.min(minPrice, arr[i]);

            // Calculate the profit if selling at the current day
            int currentProfit = arr[i] - minPrice;

            // Update the maximum profit if the current profit is higher
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }
}

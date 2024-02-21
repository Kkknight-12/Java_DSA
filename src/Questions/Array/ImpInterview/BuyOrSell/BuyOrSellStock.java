package Questions.Array.ImpInterview.BuyOrSell;

public class BuyOrSellStock {
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
        int[] arr = { 5 };
        MaxProfit(arr);
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
}

/*
 * TIME LIMIT Exceeds */

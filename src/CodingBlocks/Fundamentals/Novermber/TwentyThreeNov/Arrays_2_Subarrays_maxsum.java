package CodingBlocks.Fundamentals.Novermber.TwentyThreeNov;

public class Arrays_2_Subarrays_maxsum {
    public static void main(String[] args) {
        int[] arr = { 10, 20, -35, 40, 50 };
        PrintAll(arr);
    }

    static void PrintAll(int[] arr) {
        // starting range
        int ans = Integer.MIN_VALUE;
        for ( int starting = 0; starting < arr.length; starting++ ) { //
            for ( int ending = starting; ending < arr.length; ending++ ) { //
                // end range
                int sum = 0;

                for ( int i = starting; i <= ending; i++ ) {
                    sum = sum + arr[i];
                    System.out.print(arr[i] + " ");
                } // last loop ends

                ans = Math.max(ans, sum);
                System.out.println();
            } // middle loop ends
            System.out.println();
        } // first loop ends
        System.out.println("Max sum of sub arrays is " + ans);
    }
}

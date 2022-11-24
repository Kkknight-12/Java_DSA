package CodingBlocks.Fundamentals.TwentyThreeNov;

public class Arrays_2_Subarrays_maxsum_Optimized {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        PrintAll(arr);
        PrintAll2(arr);
    }

    static void PrintAll(int[] arr) {
        int ans = Integer.MIN_VALUE;
        for ( int starting = 0; starting < arr.length; starting++ ) {
            int sum = 0;
            for ( int ending = starting; ending < arr.length; ending++ ) {
                sum = sum + arr[ending];
                ans = Math.max(ans, sum);
            } // second for loop ends
            System.out.println(sum);
        }
    }

    static void PrintAll2(int[] arr) {
        int ans = Integer.MIN_VALUE;
        for ( int starting = 0; starting < arr.length; starting++ ) {
            int sum = 0;
            for ( int ending = starting; ending < arr.length; ending++ ) {
                sum = sum + arr[ending];

                if ( sum <= 0 ) {
                    sum = 0;
                    break;
                }
                ans = Math.max(ans, sum);
            } // second for loop ends
            System.out.println(sum);
        }
    }
}

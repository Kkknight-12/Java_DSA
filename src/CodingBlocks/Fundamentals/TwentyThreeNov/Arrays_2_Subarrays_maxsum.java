package CodingBlocks.Fundamentals.TwentyThreeNov;

public class Arrays_2_Subarrays_maxsum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        PrintAll(arr);
    }

    static void PrintAll(int[] arr) {
        for ( int starting = 0; starting < arr.length; starting++ ) { //
            // starting range
            int ans = Integer.MIN_VALUE;

            for ( int ending = starting; ending < arr.length; ending++ ) { //
                // end range
                int sum = 0;

                for ( int i = starting; i <= ending; i++ ) { //  range
                    // printing loop

                    sum = sum + arr[i];
                    System.out.print(arr[i] + " ");

                } // last loop ends
//                ans = Math.max(ans, sum);

                // if the previous stored sum is less than the current sum
                // than replace the old sum with new sum
                if ( ans < sum ) {
                    ans = sum;
                }

                System.out.println();
            } // middle loop ends
            System.out.println("SUM " + ans);
            System.out.println();
        } // first loop ends

    }
}

package CodingBlocks.Fundamentals.Novermber.TwentyThreeNov;

public class Arrays_2_Subarrays_maxsum_Optimized {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
//        PrintAll(arr);
//        System.out.println();
//        PrintAll2(arr);
//        System.out.println();
        PrintAll3(arr);
        //
//        int[] arr2 = {-10, -20, -30, -5000, -500, -600, -20};
//        System.out.println();
//        PrintAll3(arr2);
    }

    //    quadratic
    /* print all the sums of sum arrays  */
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

    /*  compare all the sums of sub arrays and write max number */
    static void PrintAll2(int[] arr) {

//        ans must be accessible outside the first loop
        int ans = Integer.MIN_VALUE;
        for ( int starting = 0; starting < arr.length; starting++ ) {
            int sum = 0;
//            each ending element will be
//            new addition to the existing array sum
            for ( int ending = starting; ending < arr.length; ending++ ) {
//                 we will be adding the ending element to
//                 the existing array sum
                sum = sum + arr[ending];
                if ( sum < 0 ) {
                    sum = 0;
                    break;
                }

                /* at the end of sub array iteration we compare the sum of last sub
                 *  array with this one and swap it if the previous sub array sum
                 * was less */
                System.out.println("sum " + sum);
                ans = Math.max(ans, sum);

            } // second for loop ends
            System.out.println();

        } // first loop ends
//        will be printed once when the first loop | sub arrays iteration stops
        System.out.println(ans);
    }

    // Linear
    /* Kadane's Algorithm for Maximum Sum Sub array
     * -> keep on adding the elements till the sum become zero or less
     * -> if the sum become zero or less than start addition from next element
     *  in array
     * -> maintain a variable to store the last max sum before the sum became
     *  negative*/
    static void PrintAll3(int[] arr) {

        int sum = 0;
        int ans = Integer.MIN_VALUE; // -2147483648

        for ( int ele : arr ) {
            sum = sum + ele;
            ans = Math.max(sum, ans);

            if ( sum < 0 ) {
                sum = 0;
            }

        } // for loop ends
        System.out.println("sum -> " + sum);
        System.out.println("Kadane algo -> " + ans);
    }
}

package CodingBlocks.Fundamentals.Novermber.TwentyThreeNov;

public class Arrays_2_Subarrays {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        PrintAll(arr);
    }

    static void PrintAll(int[] arr) {
        // you can't optimize this program as you need these 3 loop
        // to figure out the sub arrays.

        /*
         * first loop will the starting pointer
         * second loop will be the ending pointer
         * last loop will be the range printer
         *
         * on each first loop completion the starting point will be
         * incremented
         * third loop will then print the elements from that starting to each
         * incrementing ending point till it reaches end of array and loop
         * breaks
         *  */
        for ( int starting = 0; starting < arr.length; starting++ ) { //
            // starting range pointer
            for ( int ending = starting; ending < arr.length; ending++ ) { //
                // ending range pointer

                for ( int i = starting; i <= ending; i++ ) { // range printer
                    System.out.print(arr[i] + " ");
                } // last loop ends here
                System.out.println();

            } // middle loop ends here
            System.out.println();

        } // first loop ends here


        // loop iteration to understand when which loop will run
//        for ( int i = 0; i < arr.length; i++ ) {
//            System.out.print("i " + i);
//            System.out.println();
//            for ( int j = i; j < arr.length; j++ ) {
//                System.out.print("j " + j);
//                System.out.println();
//            }
//            System.out.println("cycle complete");
//        }

    }
}

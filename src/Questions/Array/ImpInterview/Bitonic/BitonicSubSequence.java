package Questions.Array.ImpInterview.Bitonic;

import java.util.Arrays;

/*
 * https://www.youtube.com/watch?v=jdfpGSSyN2I */
public class BitonicSubSequence {
    public static void main(String[] args) {

        int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80, 3 };

        // longest Increasing Subsequence
        int[] lis = new int[arr.length];

        for ( int i = 0; i < arr.length; i++ ) {
            int max = 0;

            for ( int j = 0; j < i; j++ ) {
                if ( arr[j] < arr[i] ) {
                    if ( lis[j] > max ) {
                        max = lis[j];
                    }
                }
            }

            lis[i] = max + 1;
        }
        System.out.println("lis " + Arrays.toString(lis));
        // [1, 2, 1, 3, 2, 4, 4, 5, 6, 1]

        // Longest Decreasing Subsequence
        int[] lds = new int[arr.length];

        for ( int i = arr.length - 1; i >= 0; i-- ) {
            int max = 0;

            for ( int j = arr.length - 1; j > i; j-- ) {
                if ( arr[j] < arr[i] ) {
                    if ( lds[j] > max ) {
                        max = lds[j];
                    }
                }
            }

            lds[i] = max + 1;
        }

        System.out.println("lds " + Arrays.toString(lds));
        // [3, 3, 2, 3, 2, 3, 2, 2, 2, 1]

        int omax = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            int omax1 = lis[i] + lds[i] - 1;

            if ( omax1 > omax ) {
                omax = omax1;
            }
        }
        System.out.println(omax);

    }
}

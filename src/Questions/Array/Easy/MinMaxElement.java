package Questions.Array.Easy;

public class MinMaxElement {
    static class Pair {
        long min;
        long max;

        public Pair(long min, long max) {
            this.min = min;
            this.max = max;
        }
    }

    public static void main(String[] args) {

        long arr[] = { 10, 5, 3, 9, 8, 3 };
        int arrLength = arr.length;
        Pair result = getMinMax(arr, arrLength);
        System.out.println("Min: " + result.min + ", Max: " + result.max);
    }

    static Pair getMinMax(long arr[], long n) {
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;

        for ( int i = 0; i < n; i++ ) {
            if ( arr[i] < min ) {
                min = arr[i];
            }
            if ( arr[i] > max ) {
                max = arr[i];
            }
        }

        return new Pair(min, max);
    }
}


/*
 * i = 0
 * 10 < min true => min = 10;
 *
 * i = 1
 * 5 < min ( 10 ) true => min = 5;
 *
 * i = 2
 * 3 < min ( 5 ) true => min = 3;
 *
 * i = 3
 * 9 < min ( 3 ) false
 * 9 > max true => max = 9
 * */

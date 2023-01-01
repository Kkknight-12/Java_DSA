package CodingBlocks.Fundamentals.December.TwoDec;

public class CoilPatten {
    public static void main(String[] args) {
        int[][] a = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34},
            {41, 42, 43, 44}
        };
//        System.out.println(a[0].length); // length of row 4
//        System.out.println(a.length); // length of column 4

        /* wave pattern logic
         * 11, 21, 31, 41
         * 42, 43, 44,
         * 34, 24, 14
         * 13, 12,
         * 22, 32,
         * 33, 23
         *  */

        printSpiral(a);
    }

    /* 1:36 */
    static void printSpiral(int[][] arr) {
        int row_start = 0;
        int row_ending = arr.length - 1;
        int col_start = 0;
        int col_ending = arr[0].length - 1;

        //
        int count = 0;
        int max = arr.length * arr[0].length;
        while ( row_start <= row_ending && col_start <= col_ending ) {

            // pattern 1
            for ( int row = row_start; row <= row_ending && count < max; row++ ) {
                System.out.println(arr[row][col_start]);
            }
            System.out.println();

            // pattern 2
            for ( int col = col_start + 1; col <= col_ending && count < max; col++ ) {
                System.out.println(arr[row_ending][col]);
            }
            System.out.println();

            // pattern 3
            for ( int row = row_ending - 1; row >= row_start && count < max; row-- ) {
                System.out.println(arr[row][col_ending]);
            }
            System.out.println();

            // pattern 4
            for ( int col = col_ending - 1; col >= col_start + 1 && count < max; col-- ) {
                System.out.println(arr[row_start][col]);
            }
            System.out.println();

            row_start++;
            row_ending--;
            col_start++;
            col_ending--;
        }
    }
}

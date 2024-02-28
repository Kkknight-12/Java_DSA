package LearnBasics.LinearDataStructure.Array.TwoDArray;

public class PrintInSpiralOrder {
    public static void main(String[] args) {

        /*
         * row[0]Col[j++];
         * row[i++]Col[arr.length - 1];
         * row[arr.length - 1]Col[j--];
         * row[i--]Col[1];
         *
         * */

        int[][] arr = {
            { 11, 12, 13, 14 },
            { 21, 22, 23, 24 },
            { 31, 32, 33, 34 },
            { 41, 42, 43, 44 }
        };

        printSpiral(arr);
        /* wave pattern logic
         * 11, 12, 13, 14,
         * 24, 34, 44,
         * 43, 42, 41,
         * 31, 21,
         * 22, 23,
         * 33,
         * 32,
         */

    }

    static void printSpiral(int[][] arr) {
        int row_start = 0;
        int row_ending = arr.length - 1;
        int col_start = 0;
        int col_ending = arr[0].length - 1;

        while ( row_start <= row_ending && col_start <= col_ending ) {
            // →
            for ( int i = col_start; i <= col_ending; i++ ) {
                System.out.print(arr[row_start][i] + " ");
            }

            System.out.println();

            // ↓
            for ( int i = row_start + 1; i <= row_ending; i++ ) {
                System.out.print(arr[i][col_ending] + " ");
            }

            System.out.println();
            ;

            // ←
            for ( int i = col_ending - 1; i >= col_start; i-- ) {
                System.out.print(arr[row_ending][i] + " ");
            }

            System.out.println();

            //  ↑
            for ( int i = row_ending - 1; i > row_start; i-- ) {
                System.out.print(arr[i][col_start] + " ");
            }

            System.out.println();

            row_start++;
            row_ending--;
            col_start++;
            col_ending--;
        }


    }
}

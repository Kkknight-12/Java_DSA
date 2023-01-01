package CodingBlocks.Fundamentals.December.TwoDec;

public class DiagonalPattern {
    public static void main(String[] args) {
        int[][] a = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34},
            {41, 42, 43, 44}
        };
        printDiagonalPattern(a);
    }

    static void printDiagonalPattern(int[][] arr) {
        int row_start = 0;
        int row_ending = arr.length - 1;
        int col_start = 0;
        int col_ending = arr[0].length - 1;


        for ( int row = row_ending; row >= row_start; row-- ) {
            int count = 0;

            for ( int r = row; r <= row_ending && count <= col_ending; r++ ) {
                System.out.println(arr[r][count]);
                count++;
            }
            System.out.println();
        }

        for ( int col = col_start + 1; col <= col_ending; col++ ) {
            int count = 0;
            for ( int c = col; c <= col_ending && count <= row_ending; c++ ) {
                System.out.println(arr[count][c]);
                count++;
            }
            System.out.println();
        }
    }
}

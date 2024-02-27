package LearnBasics.LinearDataStructure.Array.TwoDArray;


/*
 * Main Diagonal ("\")
 * 1 | - | -
 * - | 5 | -
 * - | - | 9
 *
 * Secondary Diagonal ("/")
 * - | - | 3
 * - | 5 | -
 * 7 | - | -
 *
 *  */

/*
 *       | Column 0  | Column 1  | Column 2  |
 * ------------------------------------------
 * Row 0 | x [0][0]  | x [0][1]  | x [0][2]  |
 * ------------------------------------------
 * Row 1 | x [1][0]  | x [1][1]  | x [1][2]  |
 * ------------------------------------------
 * Row 2 | x [2][0]  | x [2][1]  | x [2][2]  |
 * ------------------------------------------
 *
 * arr [row][column]
 *
 * */

public class PrintMainAndSecondaryDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 2, 3, },
            { 4, 5, 6, },
            { 7, 8, 9, },
           
        };

        System.out.println("Main Diagonal:");
        for ( int i = 0; i < matrix.length; i++ ) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println("Secondary Diagonal:");
        for ( int i = 0; i < matrix.length; i++ ) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }
    }
}

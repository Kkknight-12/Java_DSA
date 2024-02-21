package Questions.Medium.Matrix;


import java.util.Scanner;

/*
 * https://www.educative.io/answers/how-to-check-if-a-given-matrix-is-a-toeplitz-matrix
 *  */
public class MatrixIsToeplitz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        for ( int i = 0; i < row; i++ ) {
            for ( int j = 0; j < col; j++ ) {
                matrix[i][j] = sc.nextInt();
            }
        } // for loop ends

        //
//        int[][] matrix = { { 3, 7, 0, 9, 8 }, { 5, 3, 7, 0, 9 },
//            { 6, 5, 3, 7, 0 }, { 4, 6, 5, 3, 7 } };

        checkToepliz(matrix);
    }

    static void checkToepliz(int[][] matrix) {
        boolean result = true;
        for ( int i = 0; i < matrix.length - 1; i++ ) {
            for ( int j = 0; j < matrix[0].length - 1; j++ ) {
                if ( matrix[i][j] != matrix[i + 1][j + 1] ) {
                    result = false;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}


/* 0 1 2 3 4
 *
 * 3 7 0 9 8   |  0
 * 5 3 7 0 9   |  1
 * 6 5 3 7 0   |  2
 * 4 6 5 3 7   |  3
 * */
package LakshayaSirquestions.Medium.Matrix;


import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = row;

        int[][] matrix = new int[row][col];

        for ( int i = 0; i < row; i++ ) {
            for ( int j = 0; j < col; j++ ) {
                matrix[i][j] = sc.nextInt();
            }
        } // for loop ends

        // Manual Input
//        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13,
//            14, 15, 16 } };
//
//        int row = matrix.length; // 4
//        int col = matrix[0].length; // 4


        for ( int j = col - 1; j >= 0; j-- ) {
            for ( int i = 0; i < row; i++ ) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        /*
         * 0 1 2 3
         * ----------------
         * 1 2 3 4        | 0
         * 5 6 7 8        | 1
         * 9 10 11 12     | 2
         * 3 14 15 16     | 3
         * */
    }
}

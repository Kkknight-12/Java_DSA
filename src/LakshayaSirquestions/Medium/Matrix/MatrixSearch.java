package LakshayaSirquestions.Medium.Matrix;

import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

//        int[][] matrix = {{3, 30, 38}, {44, 52, 54}, {57, 60, 69}};
        int[][] matrix = new int[row][col];

        for ( int i = 0; i < row; i++ ) {
            for ( int j = 0; j < col; j++ ) {
                matrix[i][j] = sc.nextInt();

            }
        } // for loop ends

//        int target = 60;
        int target = sc.nextInt();

        boolean result = false;

        for ( int i = 0; i < row; i++ ) {
            for ( int j = 0; j < col; j++ ) {
                if ( matrix[i][j] == target ) {
                    result = true;
                }
            }
        } // for loop ends

        if ( result ) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

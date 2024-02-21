package Questions.Medium.Matrix;

import java.util.Scanner;

/* staircase Search
 * https://leetcode.com/problems/search-a-2d-matrix/submissions/868365358/
 * https://onedrive.live.com/redir?resid=3D088623E4DD16B6%215658&authkey=%21AMd8LJGXOwlHVLE&page=Edit&wd=target%28Medium%20Questions.one%7Cfdd75563-0398-374e-bd76-67346285631b%2FUntitled%20Page%7Cc47e32c8-d780-b546-8cc1-6e28c4b8757a%2F%29&wdorigin=NavigationUrl
 *  */
public class MatrixSearch2 {
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
        searchMatrix(matrix, target);
    }

    public static void searchMatrix(int[][] matrix, int item) {
        int row = 0;
        int col = matrix[0].length - 1;
        while ( row < matrix.length && col >= 0 ) {

            if ( matrix[row][col] == item ) {
                System.out.println(1);
                return;
            } else if ( matrix[row][col] > item ) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println(0);
    }
}

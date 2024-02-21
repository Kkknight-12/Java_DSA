package Questions.Pattern;

import java.util.Scanner;

/*
1
2 2
3 0 3
4 0 0 4
5 0 0 0 5
*  */
public class PatternZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        zeroPattern(num);
    }

    static void zeroPattern(int n) {

        for ( int row = 1; row <= n; row++ ) {
            // start column with 1
            // print till column reaches row number
            for ( int col = 1; col <= row; col++ ) {

                // print zero only if column is not 1
                // and is not last
                if ( col != 1 && col != row ) {
                    System.out.print(0 + " ");
                } else {
                    // printing row as numbering starts and
                    // ends with row number
                    System.out.print(row + " ");
                }
            }
            System.out.println();
        }
    }
}

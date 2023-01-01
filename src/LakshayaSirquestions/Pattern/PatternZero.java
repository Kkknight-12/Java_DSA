package LakshayaSirquestions.Pattern;

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

    static void zeroPattern(int k) {
        for ( int col = 1; col <= k; col++ ) {
            for ( int row = 1; row <= col; row++ ) {

                if ( row != 1 && row != col ) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(col + " ");
                }
            }
            System.out.println();
        }
    }
}

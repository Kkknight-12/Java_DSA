package CodingBlocks.Fundamentals.Novermber.SevenNov;

/*

 * * * * *
 * * * *
 * * *
 * *
 *

 */

public class Pattern_3 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int total_start = n; // total starts from 1

        while ( row <= n ) {
            int count_starts = 0;
            while ( count_starts < total_start ) {
                System.out.print("* ");
                count_starts++;
            }
            total_start--; // increase on every row change
            row++;
            System.out.println();
        }
    }
}

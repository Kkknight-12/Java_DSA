package CodingBlocks.Fundamentals.Novermber.SevenNov;

/*
n = 5

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

*
*  *
*  *  *
*  *  *  *
*  *  *  *  *
*  *  *  *
*  *  *
*  *
*

r = 1    |   *1 *2 *3 *4 *5
r = 2    |   *1 *2 *3 *4 *5
r = 3    |   *1 *2 *3 *4 *5
r = 4    |   *1 *2 *3 *4 *5
r = 5    |   *1 *2 *3 *4 *5

*/

public class Pattern_demo1 {
    public static void main(String[] args) {
        BasicStructure();
    }

    static void BasicStructure() {
        int n = 5;
        int row = 1;
        int total_start = n;

        while ( row <= n ) {
            int count_starts = 0;
            while ( count_starts < total_start ) {
                System.out.print("* ");
                count_starts++;
            }
            row++;
            System.out.println();
        }
    }
}

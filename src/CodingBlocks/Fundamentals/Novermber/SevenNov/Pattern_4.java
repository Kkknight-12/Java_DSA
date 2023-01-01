package CodingBlocks.Fundamentals.Novermber.SevenNov;

/*

S S S S *
S S S * *
S S * * *
S * * * *
* * * * *

r    |  total space  | total stars
     |               |
1    |  n - 1 => 4   |    1
2    |     3         |    2
3    |     2         |    3
4    |     1         |    4
5    |     0         |    5

*/
public class Pattern_4 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int total_start = 1; // total starts from 1
        int total_space = n - 1; // total starts from n - 1

        // print rows
        while ( row <= n ) {
            int count_space = 0;

//            print space
            while ( count_space < total_space ) {
                System.out.print("S ");
                count_space++;
            }

//          print stars
            int count_starts = 0;
            while ( count_starts < total_start ) {
                System.out.print("* ");
                count_starts++;
            }
            total_start++; // increase on every row change
            total_space--; // decrease space on every row change

            row++;
            System.out.println();
        }
    }
}

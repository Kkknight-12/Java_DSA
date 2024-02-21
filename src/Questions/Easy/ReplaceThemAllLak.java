package Questions.Easy;

import java.util.Scanner;

public class ReplaceThemAllLak {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        long num = scn.nextLong();
        long mult = 1;
        long ans = 0;

        // solve till number have digit
        while ( num > 0 ) {
            int digit = ( int ) (num % 10);
            if ( digit == 0 ) {
                digit = 5;
            }

            ans = ans + (digit * mult);
            mult = mult * 10;
            num = num / 10;
        }
        System.out.println(ans);

    }
}

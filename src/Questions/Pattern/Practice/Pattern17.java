package Questions.Pattern.Practice;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int num_of_starts = num / 2;
        int num_of_spaces = 1;

        int row = 1;
        while ( row <= num ) {

            for ( int i = 1; i <= num_of_starts; i++ ) {
                System.out.print("*");
            }
            for ( int i = 1; i <= num_of_spaces; i++ ) {
                System.out.print(" ");
            }
            for ( int i = 1; i <= num_of_starts; i++ ) {
                System.out.print("*");
            }

            System.out.println();
            if ( row <= num / 2 ) {
                num_of_spaces = num_of_spaces + 2;
                num_of_starts = num_of_starts - 1;
            } else {
                num_of_spaces = num_of_spaces - 2;
                num_of_starts = num_of_starts + 1;
            }
            row++;
        }
    }
}

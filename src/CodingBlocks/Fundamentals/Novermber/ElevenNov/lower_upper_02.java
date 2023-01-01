package CodingBlocks.Fundamentals.Novermber.ElevenNov;

import java.util.Scanner;

/*
 * we will be comparing the first letter of the input by the user and check
 * that if the first letter is capital or small
 * first letter capital -> sout - Upper
 * first letter small -> sout - Lower
 */
public class lower_upper_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input
        // from user input pick first letter
        char ch = sc.next().charAt(0);
        System.out.println(ch);


        // Use single quotes for literal chars,
        // double quotes for literal Strings

        /* i do not understand how it is comparing character with 'A' and 'Z" */
        if ( ch >= 'A' && ch <= 'Z' ) {
            System.out.println("Upper");
        } else if ( ch >= 'a' && ch <= 'z' ) {
            System.out.println("Lower");
        } else {
            System.out.println("???");
        }
    }
}

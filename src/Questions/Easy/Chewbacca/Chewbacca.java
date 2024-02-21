package Questions.Easy.Chewbacca;

import java.util.Scanner;
/*
 *
 * Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at
 * numbers but he loves inverting digits in them. Inverting digit t means
 * replacing it with digit 9 - t.
 *
 * Help Chewbacca to transform the initial number x to the minimum possible
 * positive number by inverting some (possibly, zero) digits. The decimal
 * representation of the final number shouldn't start with a zero.

 * Input Format
 * The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that
 * Luke Skywalker gave to Chewbacca.
 *
 * Constraints
 * x <= 100000000000000000
 *
 * Output Format
 * Print the minimum possible positive number that Chewbacca can obtain after
 * inverting some digits. The number shouldn't contain leading zeroes.
 *
 * Sample Input
 * 4545
 * Sample Output
 * 4444
 *
 * Explanation
 * There are many numbers form after inverting the digit. For minimum number,
 * check if inverting digit is less than or greater than the original digit.
 * If it is less, then invert it otherwise leave it.
 *  */


public class Chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long inp = sc.nextLong(); // Use nextLong() to handle larger numbers

        // Convert the number to a string to work with individual digits
        String numberStr = String.valueOf(inp);
        StringBuilder result = new StringBuilder();

        for ( int i = 0; i < numberStr.length(); i++ ) {
            int digit = numberStr.charAt(i) - '0';

            // Invert the digit if it's greater than 4 and it's not the first digit
            if ( i == 0 && digit == 9 ) {
                // Handle the special case where the first digit is 9, and inverting it would result in 0
                result.append(9);
            } else {
                result.append(Math.min(digit, 9 - digit)); // Choose the smaller inverted digit
            }
        }
        System.out.println(result);
    }
}

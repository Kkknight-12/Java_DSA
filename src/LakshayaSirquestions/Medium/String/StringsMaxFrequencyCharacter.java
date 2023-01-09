package LakshayaSirquestions.Medium.String;

/*
 * Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.
 *
 * Input Format
 * String
 *
 * Constraints
 * A string of length between 1 to 1000.

 * Output Format
 * Character

 * Sample Input
 * aaabacb

 * Sample Output
 * a

 * Explanation
 * For the given input string, a appear 4 times. Hence, it is the most frequent character.
 *  */

import java.util.Arrays;
import java.util.Scanner;

public class StringsMaxFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        char[] str = sc.next().toCharArray();
        char[] charArr = "aaabacb".toCharArray();

        Arrays.sort(charArr);

        //sorted character array converted back to string
        String str = new String(charArr);

        char maxRepChar = str.charAt(0);

        int maxCount = 0;
        int count = 1;
        int i;
        for ( i = 1; i < str.length(); i++ ) {

            if ( str.charAt(i) == str.charAt(i - 1) ) {
                count++;
            } else {
                if ( count > maxCount ) {
                    maxCount = count;
                    maxRepChar = str.charAt(i - 1);
                }
                count = 1;
            }
        }
        if ( count > maxCount ) {
            maxCount = count;
            maxRepChar = str.charAt(i - 1);
        }
        System.out.println(maxRepChar);
        System.out.println(maxCount);
    }
}

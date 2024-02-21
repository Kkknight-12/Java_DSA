package Questions.Medium.String;

import java.util.Scanner;


/*
 * Take as input S, a string. Write a function that does basic string
 * compression. Print the value returned. E.g. for input “aaabbccds” print out
 *  a3b2c2ds.
 *
 * Input Format
 * A single String S.
 *
 * Constraints
 * A string of length between 1 to 1000
 *
 * Output Format
 * The compressed String.
 *
 * Sample Input
 * aaabbccds
 *
 * Sample Output
 * a3b2c2ds
 *
 * Explanation
 * In the given sample test case 'a' is repeated 3 times consecutively, 'b' is
 * repeated twice, 'c' is repeated twice. But, 'd' and 's' occurred only once
 * that's why we do not write their occurrence.
 *  */

public class StringComparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        char[] str = sc.next().toCharArray();
        char[] str = "aaabbbccds".toCharArray();
//        char[] str = "a".toCharArray();
        String countStr = "";

        for ( int i = 0; i < str.length; i++ ) {

            int count = 1;

            while ( i < str.length - 1 && str[i] == str[i + 1] ) {
                count = count + 1;
                i++;
            }
            if ( count > 1 ) {
                countStr = countStr + str[i] + count;
            } else {
                countStr = countStr + str[i];
            }
            count = 0;
        }
        System.out.println(countStr);
    }

}

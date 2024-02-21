package Questions.Medium.String;

import java.util.Scanner;

public class StringsRemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] str = sc.next().toCharArray();
//        char[] str = "aaabbbccds".toCharArray();
        String countStr = String.valueOf(str[0]);


        for ( int i = 1; i < str.length; i++ ) {

            if ( str[i] == str[i - 1] ) {
                continue;
            } else {
                countStr = countStr + str[i];
            }
        }
        System.out.println(countStr);
    }
}


/*
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * 1 2 4
 * 7 5 3
 * 6 8 9 */
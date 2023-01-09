package LakshayaSirquestions.Medium.String;

import java.util.Scanner;

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

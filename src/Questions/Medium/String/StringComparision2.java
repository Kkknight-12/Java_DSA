package Questions.Medium.String;

import java.util.Scanner;

public class StringComparision2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        char[] str = sc.next().toCharArray();
        char[] str = "aaabbbccds".toCharArray();
//        char[] str = "a".toCharArray();
        String countStr = String.valueOf(str[0]);

        int count = 1;
        for ( int i = 1; i < str.length; i++ ) {
//            while ( i < str.length - 1 && str[i] == str[i + 1] ) {
//                count = count + 1;
//                i++;
//            }
            if ( str[i] == str[i - 1] ) {
                count = count + 1;
            } else {
                if ( count > 1 ) {
                    countStr = countStr + count;
                    count = 1;
                }
                countStr = countStr + str[i];
            }
        }
        if ( count > 1 ) {
            countStr = countStr + count;
            count = 1;
        }
        System.out.println(countStr);
    }
}

package Questions.String.Medium;

import java.util.Scanner;

public class PlayingStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        char[] charArr = sc.next().toCharArray();
        char[] subSrt = { 'a', 'e', 'i', 'o', 'u' };

        //
        char[] charArr = "cbaeicde".toCharArray();
        String str = String.valueOf(charArr);


        findgGoodSubStr(str);
        findSubStr2(str, subSrt);

    }

    /* https://www.educative.io/answers/how-to-check-all-the-present-vowels-in-a-string-in-java */
    static void findgGoodSubStr(String str) {
        int count = 0;
        for ( int i = 0; i < str.length(); i++ ) {
            int bStr = 0;
            while ( i < str.length() ) {
                if ( str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' ) {
                    count++;
                } else {
                    count = 0;
                }
                i++;
                if ( count > bStr ) {
                    bStr = count;
                }
            }
            System.out.println(bStr);
        }
    }

    static void findSubStr2(String word, char[] subSrt) {
        String goodSubStr = "";
        int count = 0;

        for ( int i = 0; i < subSrt.length; i++ ) {

            goodSubStr += String.valueOf(subSrt[i]);
//            System.out.println("subStr " + subStr);
            boolean retval = word.contains(goodSubStr);

            if ( retval ) {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}

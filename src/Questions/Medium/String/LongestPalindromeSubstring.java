package Questions.Medium.String;

import java.util.Scanner;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            String s = sc.next();
            String lps = longestPalSubstring(s);
            System.out.println(lps);
            System.out.println(lps.length());
        }
    }

    public static String longestPalSubstring(String s) {
        int strLen = 2 * s.length() + 3;
        char[] sChars = new char[strLen];

        sChars[0] = '@';
        sChars[strLen - 1] = '$';
        int t = 1;
        for ( char c : s.toCharArray() ) {
            sChars[t++] = '#';
            sChars[t++] = c;
        }
        sChars[t] = '#';

        int maxLen = 0;
        int start = 0;
        int maxRight = 0;
        int center = 0;
        int[] p = new int[strLen];
        for ( int i = 1; i < strLen - 1; i++ ) {
            if ( i < maxRight ) {
                p[i] = Math.min(maxRight - i, p[2 * center - i]);
            }

            while ( sChars[i + p[i] + 1] == sChars[i - p[i] - 1] ) {
                p[i]++;
            }

            if ( i + p[i] > maxRight ) {
                center = i;
                maxRight = i + p[i];
            }

            if ( p[i] > maxLen ) {
                start = (i - p[i] - 1) / 2;
                maxLen = p[i];
            }
        }

        String lps = s.substring(start, start + maxLen);
        return lps;
    }
}

/*
 * code that implements Manacher's algorithm to solve the problem. */
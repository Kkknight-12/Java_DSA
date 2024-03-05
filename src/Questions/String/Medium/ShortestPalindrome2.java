package Questions.String.Medium;

import java.util.Arrays;

public class ShortestPalindrome2 {
    public static String shortestPalindrome(String s) {

        String temp = s + "#" + new StringBuilder(s).reverse().toString();
        // aacecaaa#aaacecaa

        int[] lps = new int[temp.length()];
        int i = 1, j = 0;

        while ( i < temp.length() ) {
            if ( temp.charAt(i) == temp.charAt(j) ) {
                lps[i] = j + 1;
                i++;
                j++;
            } else {
                if ( j != 0 ) {
                    j = lps[j - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // temp.length() = lps.length -> 17
        System.out.println(temp); // aacecaaa#aaacecaa
        System.out.println(Arrays.toString(lps)); // [0, 1, 0, 0, 0, 1, 2, 2, 0, 1, 2, 2, 3, 4, 5, 6, 7]
        System.out.println(lps[temp.length() - 1]); // 7

        // aacecaaa -> aacecaa -> a
        System.out.println(s.substring(lps[temp.length() - 1])); // a
        return new StringBuilder(s.substring(lps[temp.length() - 1])).reverse().toString() + s;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char[] charArr = sc.next().toCharArray();
//        String s = String.valueOf(charArr);
        String s = String.valueOf("aacecaaa");
        System.out.println(shortestPalindrome(s));
    }

}

/*
 * # The step String temp = s + "#" + new StringBuilder(s).reverse().toString();
 * is needed to create a new string "temp" that combines the original input string "s",
 * a special character "#" and the reversed string "s". This is done to make
 * the KMP algorithm work properly. The KMP algorithm works by finding the longest common
 * prefix and suffix of a given string. However, the original input string "s" and its
 * reverse are not the same, so we cannot use the KMP algorithm on them directly.
 *
 * By concatenating the original input string "s", a special character "#" and the reversed
 * string "s", we are creating a new string "temp" that has the original input string "s"
 * as both its prefix and suffix.
 *
 * The special character "#" is used to separate the original input string "s" and its
 * reverse in the new string "temp", so that the KMP algorithm can find the longest common
 * prefix and suffix of the new string "temp" which is the longest palindrome that can be
 * formed by adding characters in front of the original input string.
 *
 * After the KMP algorithm is applied on the string "temp", the last element of the "f" array
 * will have the length of the longest common prefix and suffix of the string "temp", which
 * is the longest palindrome that can be formed by adding characters in front of the original
 * input string.
 *
 * By having the original input string "s" as both prefix and suffix of the new string "temp" ,
 * the algorithm can find the longest common prefix and suffix of the new string "temp" which
 * is the longest palindrome that can be formed by adding characters in front of the original input string.
 *
 * in the last step of the KMP algorithm implementation, we are creating the shortest palindrome from
 * the input string. `s.substring(lps[temp.length() - 1])` is taking the
 * substring of the original input string "s", starting from the index equal to
 * the last value in the "lps" array. This is the part of the original string that is
 * not a part of the longest common prefix and suffix.
 *
 * Then, we are reversing this substring using
 * `new StringBuilder(s.substring(lps[temp.length() - 1])).reverse().toString()`
 *
 * Finally, we are concatenating this reversed substring with the original input
 * string "s" using the + s at the end, which gives the shortest palindrome that can be obtained
 * by adding characters to the original string s.
 * `return new StringBuilder(s.substring(lps[temp.length() - 1])).reverse().toString() + s;`
 * This line of code is returning the final result, which is the shortest palindrome obtained
 * by adding characters in front of original string s.
 * */
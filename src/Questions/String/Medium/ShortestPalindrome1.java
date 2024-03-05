package Questions.String.Medium;

import java.util.Arrays;

public class ShortestPalindrome1 {
    public static String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString(); // aaacecaa
        String str = s + "#" + rev;
        int n = str.length();
        int[] f = new int[n];

        for ( int i = 1, j = 0; i < n; i++ ) {
            while ( j > 0 && str.charAt(i) != str.charAt(j) )
                j = f[j - 1];
            if ( str.charAt(i) == str.charAt(j) )
                j++;
            f[i] = j;
        }

        System.out.println(s.length()); // 8
        System.out.println(f.length); // 18
//        System.out.println(str); // aacecaaa#aaacecaa | abcd#dcba
        System.out.println(Arrays.toString(f)); // [0, 1, 0, 0, 0, 1, 2, 2, 0, 1, 2, 2, 3, 4, 5, 6, 7]
        System.out.println(f[n - 1]); // 7
        System.out.println(s.length() - f[n - 1]); // 1
        System.out.println(rev.substring(0, s.length() - f[n - 1])); // a

        return rev.substring(0, s.length() - f[n - 1]) + s;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char[] charArr = sc.next().toCharArray();
        char[] charArr = "aacecaaa".toCharArray();
//        char[] charArr = "abcd".toCharArray();
        String S = String.valueOf(charArr);
        String Result = shortestPalindrome(S);
        System.out.println(Result);
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
 * After the KMP algorithm is applied on the string "temp", ---> the last
 * element of the "f" array will have the length of the longest common prefix
 * and suffix of the string "temp", which is the longest palindrome <--- that
 * can be formed by adding characters in front of the original input string.
 *
 * By having the original input string "s" as both prefix and suffix of the new string "temp" ,
 * the algorithm can find the longest common prefix and suffix of the new string "temp".
 *
 *
 *  in the last step we are constructing the shortest palindrome by concatenating a substring
 * of the reversed input string "rev" with the original input string "s".
 * `rev.substring(0, s.length() - f[n - 1]) is taking a substring of the reversed input
 * string "rev", starting from index 0, and ending at index "s.length() - f[n - 1]".
 *
 * The starting index is 0, which means it is taking the substring from the beginning of
 * the reversed input string.
 *
 * The ending index is "s.length() - f[n - 1]", which means it is taking the substring up to the
 * point where the length of the substring is equal to the difference between the length of the
 * original input string "s" and the last element of the "f" array (which contains the length of
 * the longest common prefix and suffix). This part of the reversed input string is the part that
 * is not a part of the longest common prefix and suffix.
 *
 * Then it concatenates this substring with the original input string "s" using + s at the end,
 * which gives the shortest palindrome that can be obtained by adding characters to the
 * original string s.
 *
 * `return rev.substring(0, s.length() - f[n - 1]) + s;` . This line of code is
 * returning the final result, which is the shortest palindrome. In simple terms, it returns
 * the part of the reversed string which is not a part of the longest common
 * prefix and suffix + the original input string.
 *
 * The substring is taken up to the point where the length of the substring is equal to the
 *  difference between the length of the original input string "s" and the last element of the "f"
 * array because the value stored in "f[n-1]" is the length of the longest common prefix and suffix
 * of the concatenated string "str" (which is the concatenation of the original input string "s",
 * a special character "#" and the reversed string "rev").
 *
 * So, if we subtract this length from the length of the original input string "s", we get the
 *  length of the part of the original input string which is not a part of the longest common
 *  prefix and suffix.
 *
 * By taking a substring of the reversed input string "rev" up to this length, we are getting
 * the part of the reversed input string which is not a part of the longest common prefix
 * and suffix.
 *
 * Finally, by concatenating this substring with the original input string "s", we are adding
 * the characters to the original input string that are necessary to form a palindrome.
 * It is important to note that the longest common prefix and suffix of the original input
 * string and its reverse is the longest palindrome that can be formed by adding characters
 * in front of the original input string, so the substring of the reversed input string that
 * is not a part of the longest common prefix and suffix is the part of the string that needs
 * to be added to the original input string in order to form the shortest palindrome.



 */

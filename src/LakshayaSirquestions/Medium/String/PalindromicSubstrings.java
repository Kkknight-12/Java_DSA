package LakshayaSirquestions.Medium.String;

/* https://leetcode.com/problems/palindromic-substrings/description/
 *  */
public class PalindromicSubstrings {
    public static int countSubstrings(String s) {
        int count = 0;
        for ( int i = 0; i < s.length(); i++ ) {
            // Check for odd length palindromes
            int left = i, right = i;
            while ( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ) {
                count++;
                left--;
                right++;
            }
            // Check for even length palindromes
            left = i;
            right = i + 1;
            while ( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ) {
                count++;
                left--;
                right++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String s = "abc";
        int result = countSubstrings(s);
        System.out.println(result);
    }
}

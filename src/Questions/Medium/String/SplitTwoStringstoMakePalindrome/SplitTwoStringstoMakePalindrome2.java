package Questions.Medium.String.SplitTwoStringstoMakePalindrome;

import java.util.Scanner;

public class SplitTwoStringstoMakePalindrome2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char[] charArr1 = sc.next().toCharArray();
//        char[] charArr2 = sc.next().toCharArray();
//        String a = String.valueOf(charArr1);
//        String b = String.valueOf(charArr2);
        String a = "ulacfd";
        String b = "jizalu";
        boolean result = checkPalindromeFormation(a, b);
        System.out.println(result);
    }

    public static boolean checkPalindromeFormation(String a, String b) {
        for ( int i = 0; i < a.length(); i++ ) {
            if ( isPalindrome(a.substring(0, i) + b.substring(i)) || isPalindrome(b.substring(0, i) + a.substring(i)) ) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPalindrome(String s) {
//        System.out.println("string " + s);
        int l = 0, r = s.length() - 1;
        while ( l < r ) {
            if ( s.charAt(l) != s.charAt(r) ) {
                return false;
            }
            l++;
            r--;
        }
        System.out.println(s);
        return true;
    }
}

/*
 * a = a l a c f d
 * b = j i z a l u
 *       ----------------------------------------------------------
 * i = 0 |    j i z a l u        |    a l a c f d
 * i = 1 |    u - i z a l u      |    j - l a c f d
 * i = 2 |    u l - z a l u      |    j i - a c f d
 * i = 3 |  ( u l a - a l u )    |    j i z - c f d
 * i = 4 |    u l a c - l u      |    j i z a - f d
 * i = 5 |    u l a c - l u      |    j i z a l - d
 *
 * at i = 3 -> we found u l a - a l u so loop will break there
 *
 *  Logic step by step:
 *
 * Define a method checkPalindromeFormation that takes in two strings a and b.
 *
 * Start a loop with a variable i that runs from 0 to the length of the
 * string a - 1.
 *
 * Inside the loop, create two substrings from the original strings a and b
 * by using the substring method. The first substring is created by taking
 * the substring of a from index 0 to i, and concatenating it with the
 * substring of b from index i to the end of the string. The second substring
 * is created by taking the substring of b from index 0 to i, and
 * concatenating it with the substring of a from index i to the end of the
 * string.
 *
 * Check if either of the two substrings created in step 3 is a palindrome by
 * calling the helper method isPalindrome which takes one string as input and
 * checks if it's a palindrome.
 *
 * If the isPalindrome method returns true for either of the two substrings,
 * return true as the output of the checkPalindromeFormation method.
 *
 * If the loop finishes running and no palindrome is found, return false as
 * the output of the checkPalindromeFormation method.
 *
 * In terms of time complexity, the loop runs n times, where n is the length
 * of the string. In each iteration, the substring method takes O(n) time and
 * the isPalindrome method takes O(n) time. So, the overall time complexity
 * of this solution is O(n^2).
 *
 * This solution checks all possible combinations of splitting the two
 * strings and check if it forms palindrome or not. It's a brute force
 * approach which is simple to implement but has a high time complexity.  */
package Questions.Medium.String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Given a string you need to print the size of the longest possible substring
 * that has exactly k unique characters.
 * Note:- If there is no possible substring print -1.
 *
 * Input Format
 * The first line of input contains an integer T denoting the no of test cases
 * .Each test case contains two lines . The first line of each test case
 * contains a string s and the next line conatains an integer k.
 *
 * Constraints
 * 1<=T<=100
 * 1<=k<=10
 *
 * Output Format
 * For each test case in a new line print the required output.
 *
 * Sample Input
 * 2
 * aaaa
 * 1
 * qmb
 * 6
 *
 * Sample Output
 * 4
 * -1
 *
 *  */
public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            String s = sc.next();
            int k = sc.nextInt();
            int max = -1;

            for ( int i = 0; i < s.length(); i++ ) {
                for ( int j = i + 1; j <= s.length(); j++ ) {
                    String sub = s.substring(i, j);
                    if ( countUnique(sub) == k ) {
                        max = Math.max(max, sub.length());
                    }
                }
            }

            System.out.println(max);
        }
    }

    public static int countUnique(String s) {
        Set<Character> set = new HashSet<>();
        for ( int i = 0; i < s.length(); i++ ) {
            set.add(s.charAt(i));
        }
        return set.size();
    }

}

/* OBSERVATION :
 *
 * The Question is asking us to find a longest substring of length k which have
 * unique characters.
 *
 * String -> aabcbcdbca  | length -> 4
 *
 * substring that can be formed from String
 * that have 2 unique character are
 * aab, bc, bcbc.
 *
 * This code uses two nested loops to generate all possible substrings of the
 * input string, and checks each substring to see if it has exactly k unique
 * characters. If a substring has k unique characters, it compares its length
 * to the current maximum length, and updates the maximum length if necessary.
 * The function countUnique() is used to count the number of unique characters
 * in a given substring.
 *
 * The time complexity of this solution is O(n^3) as we are using 3 nested
 * loops. 1st one is for test cases, 2nd one is to traverse the string and 3rd
 * one is to traverse the substring.
 *
 * The space complexity is O(n) as we are using a Set to store unique characters
 * of substring.s */
package Questions.Medium.String;

/*
* You are given a string, count all palindrome substring in a given string
* with size >=2.

Input Format
The input string S.

Constraints
Length of the string is less than 500.

Output Format
An integer n representing the count of palindromic substrings

Sample Input
abaab
Sample Output
3

Explanation
3 SubStrings are as follows : aba baab aa
*  */

public class CountPalindromeSubstring {

    public static int countPalindromeSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for ( int i = 0; i < n; i++ ) {
            int left = i - 1, right = i + 1;

            //            <----  l r ---->
            //  checks for palindrome substrings with odd length
            while ( left >= 0 && right < n && s.charAt(left) == s.charAt(right) ) {
                System.out.println("left " + s.charAt(left));
                System.out.println("right " + s.charAt(right));
                count++;
                left--;
                right++;
            }

            left = i;
            right = i + 1;

            // and the second while loop checks for palindrome substrings with
            // even length
            while ( left >= 0 && right < n && s.charAt(left) == s.charAt(right) ) {
                count++;
                left--;
                right++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char[] charArr1 = sc.next().toCharArray();
//        String s = String.valueOf(charArr1);
        String s = "abc";
        System.out.println(countPalindromeSubstrings(s));
    }

}

/*
 * The code is a solution for counting the number of palindrome substrings in
 * a given string. It uses two nested while loops to check for palindrome
 * substrings of both odd and even lengths.
 *
 * step-by-step explanation of the code:
 *
 * The function takes in a string as an input.It initializes two variables,
 * left and right to keep track of the positions of the characters being compared in the while loops.
*
The first while loop starts with the first character of the input string and checks for palindrome substrings of odd length by comparing the character at the current position with the characters on its left and right.
*
If the characters being compared are equal, it increments the count by 1 and moves the left and right pointers one step to the left and right respectively.
*
The second while loop starts with the second character of the input string and checks for palindrome substrings of even length by comparing the character at the current position with the character next to it on the right.
*
If the characters being compared are equal, it increments the count by 1 and moves the left and right pointers one step to the left and right respectively.
*
The function returns the count of palindrome substrings found.
*
The time complexity of the code is O(n^2) because it uses two nested loops where the outer loop runs for n times and inner loop runs for n times for the worst case scenario.
*

In each iteration of the outer loop, the inner loops check for all palindrome substrings of odd and even lengths centered around the current character being considered. This results in a time complexity of O(n^2) which is not very efficient.
*  */
package LearnBasics.LinearDataStructure.String.Algorithms;

import java.util.Scanner;

class Manacher {

    // A function to print a substring.
    static void printSubstring(String str, int left, int right) {
        for ( int i = left; i <= right; i++ )
            System.out.print(str.charAt(i));
    }

    // Implementation of Manacher's Algorithm
    public static void longestPalSubstring(String s) {
        /*
         If length of given string is n then its length after
         inserting n+1 "#", one "@", and one "$" will be
         (n) + (n+1) + (1) + (1) = 2n+3
        */
        int strLen = 2 * s.length() + 3;
        char[] sChars = new char[strLen];

        /*
         Inserting special characters to ignore special cases
         at the beginning and end of the array
         "abc" -> @ # a # b # c # $
         "" -> @#$
         "a" -> @ # a # $
        */
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
        int[] p = new int[strLen]; // i's radius, which doesn't include i
        for ( int i = 1; i < strLen - 1; i++ ) {
            if ( i < maxRight ) {
                p[i] = Math.min(maxRight - i, p[2 * center - i]);
            }

            // Expanding along the center
            while ( sChars[i + p[i] + 1] == sChars[i - p[i] - 1] ) {
                p[i]++;
            }

            // Updating center and its bound
            if ( i + p[i] > maxRight ) {
                center = i;
                maxRight = i + p[i];
            }

            // Updating ans
            if ( p[i] > maxLen ) {
                start = (i - p[i] - 1) / 2;
                maxLen = p[i];
            }
        }

        // Printing the longest Palindromic substring
        System.out.print("The Longest Palindromic Substring is: ");
        printSubstring(s, start, start + maxLen - 1);
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charArr1 = sc.next().toCharArray();
        String s = String.valueOf(charArr1);
//        String s = "abaab";
        longestPalSubstring(s);
    }
}
/*
 * step by step explanation of the Manacher's Algorithm code:
 *
 * First, the length of the input string s is calculated, and a new character
 * array sChars is created with size 2*n + 3, where n is the length of the
 * input string s.
 *
 * Next, special characters '@' and '$' are added at the beginning and end of
 * the sChars array respectively, to handle special cases at the beginning and
 * end of the array. This is done to eliminate the need to check the
 * boundaries while expanding the palindrome substring.
 *
 * Then, a loop iterates over each character of the input string s, and a
 * special character '#' is added before each character and stored in the
 * sChars array. This is done to handle even length palindrome substrings.
 *
 * An array p[] is initialized to store the radius of each character in the
 * modified string, which doesn't include the character itself.
 *
 * A variable maxRight is used to keep track of the right boundary of the
 * currently known largest palindrome substring, and a variable center is used
 * to keep track of the center of the currently known largest palindrome
 * substring.
 *
 * Then, a for loop iterates over the sChars array, starting from index 1 and
 * ending at index n-2.
 *
 * Inside the for loop, if the current character's index is less than
 * maxRight, then the radius of that character is set as the minimum value
 * between maxRight - i and p[2*center - i].
 *
 * Then, a while loop iterates until the characters at indices i + p[i] + 1
 * and i - p[i] - 1 are equal. Inside the while loop, the radius of the
 * current character is incremented.
 *
 * After the while loop, if the current character's index plus its radius is
 * greater than maxRight, then the center and maxRight are updated to the
 * current character's index and the current character's index plus its radius
 * respectively.
 *
 * If the radius of the current character is greater than the previously known
 * maximum length, then the start index of the substring is updated and the
 * maxLen is updated to the current character's radius.
 *
 * After the for loop, the longest palindrome substring is printed by calling
 * the printSubstring method, passing the input string s, the start index, and
 * the end index of the substring.
 *
 * The time complexity of Manacher's algorithm is O(n) where n is the length
 * of the input string.
 *  */
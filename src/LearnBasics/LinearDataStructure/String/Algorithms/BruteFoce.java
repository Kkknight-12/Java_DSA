package LearnBasics.LinearDataStructure.String.Algorithms;

/* https://www.notion.so/DSA-fda9924b4968467e8b5499b06a790af1?p=ab89113dd1304769bd76f6dbccdbaaf8&pm=s
 *  */
public class BruteFoce {
    public static void main(String[] args) {

        String text = "Hello, World!";
        String pattern = "World";

        int index = search(text, pattern);

        if ( index != -1 ) {
            System.out.println("Pattern found at index " + index);
        } else {
            System.out.println("Pattern not found in text");
        }
    }

    public static int search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        for ( int i = 0; i <= n - m; i++ ) {
            int j;
            for ( j = 0; j < m; j++ ) {
                if ( text.charAt(i + j) != pattern.charAt(j) ) {
                    break;
                }
            }
            if ( j == m ) {
                return i;
            }
        }
        return -1;
    }

}

/*
* This implementation takes two input strings, the text and the pattern, and
* returns the starting index of the first occurrence of the pattern in the
* text. If the pattern is not found in the text, the function returns -1.
*
* The function uses two nested loops, the outer loop iterates through the
* text while the inner loop iterates through the pattern.
*
* The outer loop starts from index 0 of the text and goes upto n-m, where n
* is the length of the text, and m is the length of the pattern.
*
* The inner loop starts from index 0 of the pattern, and compares the
* characters of the pattern with the corresponding characters of the text.
*
* If a mismatch is found, the inner loop breaks, and the outer loop shifts
* the pattern by one character and starts comparing again.
*
* If all the characters of the pattern match the corresponding characters of
* the text, the inner loop completes and the function returns the index of
* the match.

Here is an example of how this function can be used:
* String text = "Hello, World!";
* String pattern = "World";
* int index = search(text, pattern);
*   if (index != -1) {
*        System.out.println("Pattern found at index " + index);
*      } else {
*       System.out.println("Pattern not found in text");
*   }
*
* This will output "Pattern found at index 7"

* The time complexity of the Brute Force algorithm is O(n*m), where n is the
* length of the text and m is the length of the pattern.
* The reason for this is that the algorithm uses two nested loops. The outer
* loop iterates through the text, and for each iteration of the outer loop,
* the inner loop iterates through the pattern. The total number of
* iterations for the inner loop is m, and the total number of iterations for
* the outer loop is n-m+1, since the outer loop starts from index 0 of the
* text and goes upto n-m.
*
* Since the inner loop runs m times for each iteration of the outer loop,
* the total number of iterations for both the loops is (n-m+1)m. This
* results in a time complexity of O(nm).
*
* The brute force algorithm compares the pattern with all possible
* substrings of the text of the same length, which is why the time
* complexity is O(n*m).
* It's not efficient when it used for large texts or patterns, for such
* scenario we can use other algorithm like KMP, Boyer-Moore, Rabin-Karp etc. */
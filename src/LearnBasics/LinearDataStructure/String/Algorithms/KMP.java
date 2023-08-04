package LearnBasics.LinearDataStructure.String.Algorithms;

import java.util.Arrays;

/* https://www.notion.so/DSA-fda9924b4968467e8b5499b06a790af1?p=4cf74161a69444b7b7ce7c9151ecbb25&pm=s
 *  */
public class KMP {
    public static void main(String[] args) {
        int[] result = computeFailureFunction("abcabd");
        System.out.println(Arrays.toString(result)); // [0, 0, 0, 1, 2]
    }

    public static int[] computeFailureFunction(String pattern) {
        int m = pattern.length();
        int[] f = new int[m];
        int j = 0;

        for ( int i = 1; i < m; i++ ) {
            while ( j > 0 && pattern.charAt(j) != pattern.charAt(i) ) {
                j = f[j - 1];
            }
            if ( pattern.charAt(j) == pattern.charAt(i) ) {
                j++;
            }
            f[i] = j;
        }

        return f;
    }

}

/*
 * This is an implementation of the KMP (Knuth-Morris-Pratt) algorithm for
 * string matching. The function computeFailureFunction takes a single input,
 * the pattern string, and returns an array of integers representing the
 * failure function of the pattern.
 *
 * The failure function is used in the KMP algorithm to efficiently skip over
 * matching prefixes and suffixes in the pattern when searching for a match
 * in the text. It is computed in a preprocessing step before searching for
 * the pattern in the text.
 *
 * The algorithm uses two variables, i and j, to iterate through the pattern.
 * The variable i represents the current position in the pattern, and the
 * variable j represents the length of the longest proper prefix that is also
 * a suffix in the pattern up to the current position i.
 *
 * The while loop inside the for loop starts with j > 0, which means that the
 * current position i is not the first character in the pattern. If the
 * character at position j in the pattern is not equal to the character at
 * position i, the algorithm sets j to the value of f[j-1], and continues to
 * iterate through the pattern until a match is found. If a match is found,
 * the algorithm increments j, and assigns j to f[i].
 *
 * The time complexity of this algorithm is O(n), where n is the length of the
 * pattern. The reason for this is that the algorithm iterates through the
 * pattern only once, and performs constant time operations for each character.
 *
 * The code outputs: [0, 0, 0, 1, 2], which represent the index of the
 * longest proper prefix of each sub-string of pattern string.
 */
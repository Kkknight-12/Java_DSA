package Questions.String.Medium;

public class PalindromeFunction {

    public static void main(String args[]) {
        // Your Code Here
//        Scanner sc = new Scanner(System.in);
//        char[] charArr = sc.next().toCharArray();
//        String s = String.valueOf(charArr);
        String s = String.valueOf("racecar");
        boolean result = isPalindromeFor(s);
        if ( result ) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static boolean isPalindromeFor(String s) {
        int n = s.length();

        // i is 0; i will loop till half of the string
        // i will compare the first character with the last character
        for ( int i = 0; i < n / 2; i++ ) {
            if ( s.charAt(i) != s.charAt(n - i - 1) ) {
                return false;
            }
        }
        return true;
    }

    /* The for loop iterates from i = 0 to i < n/2, where n is the length of
     * the input string s. The loop variable i is used as the index to  access
     * the characters of the string. In each iteration of the loop, the
     * character at the current index i is compared with the character  at the
     * corresponding index from the end of the string (n-i-1). The first
     * iteration compares the first character with the last character, the
     * second  iteration compares the second character with the second-last
     * character, and so on.
     * If the characters at the current index and the corresponding index from
     * the end are not equal, the function immediately returns false
     * indicating that
     * the input string is not a palindrome. If the loop completes, that means
     * the characters at all the corresponding indices are same, so the function
     * returns true indicating that the input string is a palindrome.
     * Note that by checking only half of the characters we can ensure that
     * input is a palindrome, because if the first half of the string is same
     * as the second half of the string reversed, the whole string is a palindrome.
     */

    // better and easy to understand approach
    // while loop with 2 pointer approach
    public static boolean isPalindromeWhile(String s) {
        int i = 0;
        int j = s.length() - 1;
        while ( i < j ) {
            if ( s.charAt(i) != s.charAt(j) ) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /*
     * In this function, we have two pointers i and j initialized to the first
     *  and last characters of the string respectively. We use a while loop
     * that runs while i is less than j In each iteration, the characters at
     * the current index i and j are compared. If the characters at the
     * current index and the corresponding index from the end are not equal,
     * the function immediately returns false indicating that the input
     * string is not a palindrome. If they are equal we increment the value
     * of i and decrement the value of j. If the while loop completes, that
     * means the characters at all the corresponding indices are same, so the
     * function returns true indicating that the input string is a palindrome.
     * This approach starts from the middle of the string and goes towards
     * the start and the end, comparing each pair of characters along the way.
     * It's more efficient than the previous approach because it checks half the characters.
     *  */
}

/*
 * In this function, we use a for loop to iterate through the characters of the input string s
 * from both the beginning and the end. We compare the character at the current
 * index with the character at the corresponding index from the end (n-i-1) of the string.
 * If they are not equal, then the function returns false, indicating that the input is not a palindrome.
 * If the loop completes without finding any mismatches, the function returns true, indicating that the
 * input is a palindrome.
 *
 * */
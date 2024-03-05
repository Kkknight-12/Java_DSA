package Questions.String.Medium.SplitTwoStringstoMakePalindrome;

public class Practice2 {
    public static void main(String[] args) {
        String a = "abcZXCVB";
        String b = "QWERTcba";
        boolean result = checkPalindromeFormation(a, b);
        System.out.println(result);
    }

    static boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    private static boolean check(String a, String b) {
        int i = 0, j = a.length() - 1;
        while ( i < j && a.charAt(i) == b.charAt(j) ) {
            i++;
            j--;
        }
        System.out.println("i " + i);
        System.out.println("j " + j);

        return isPalindrome(a, i, j) || isPalindrome(b, i, j);
    }

    private static boolean isPalindrome(String s, int i, int j) {
        System.out.println("string " + s.substring(i, j + 1));
        while ( i < j ) {
            if ( s.charAt(i++) != s.charAt(j--) ) {
                return false;
            }
        }

        return true;
    }
}

/*
 * The time complexity of the code is O(n), where n
 * is the length of the input strings a and b.
 *
 * This is because there are two main loops in the code. The first loop in the
 * check method runs until the characters at the corresponding positions in
 * the two strings are not equal. This loop runs in O(n) time complexity. The
 * second loop is in the isPalindrome method, which also runs in O(n) time
 * complexity. However, these two loops do not nest each other, so the overall
 * time complexity is O(n), not O(n^2).
 *
 * In the worst-case scenario, the check method will go through the entire
 * string once, and the isPalindrome method will also go through the entire
 * string once. Therefore, the worst-case time complexity is O(n + n) = O(2n),
 * which simplifies to O(n).
 *  */

/*
 *
 * a-> a b c X X X X X
 * b-> X X X X X c b a
 *
 * now to form palindrome we need to divide both the string at the same index
 * As can be seen abc is common in both the string so we can divide the string at index 3
 *
 * now we need to check if the remaining string is palindrome or not
 * that is
 * a -> a b c X X
 * b -> X X c b a
 *
 * concatenate a and b form
 * a -> a b c X X c b a
 *
 * now we need to check if the concatenated string is palindrome or not
 * so string can be for which we check if X X is palindrome or not
 *  from string a->  we send X and X to check if it is palindrome or not
 *  from string b->  we send X and X to check if it is palindrome or not
 *
 * if it is then we can return true
 *
 *
 * */
package Questions.String.Easy;


/*
 * https://leetcode.com/problems/valid-palindrome/description/
 */

/*
 * this approach take 14ms time
 * */
public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        // remove all non-alphanumeric characters
        // The ^ character inside the square brackets [] negates the pattern,
        // meaning it will match any character that is NOT in the specified range.
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        boolean result = isValidPalindrome(str);
        System.out.println(result);
    }

    static boolean isValidPalindrome(String str) {

        // convert all uppercase letters
        str = str.toLowerCase();

        int i = 0;
        int j = str.length() - 1;
        while ( i < j ) {
            if ( str.charAt(i) != str.charAt(j) ) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

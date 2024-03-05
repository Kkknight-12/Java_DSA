package Questions.String.Easy;


/*
 * https://leetcode.com/problems/valid-palindrome/description/
 */

/*
 * this approach take 1ms time
 * */

public class BetterApproach {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(str);
        System.out.println(result);
    }

    static boolean isPalindrome(String s) {
        final var chars = s.toCharArray();
        var left = 0;
        var right = s.length() - 1;

        while ( left < right ) {
            /*
             * The first condition is checking if the character at the left
             * index is alphanumeric. If it's not (meaning it could be a
             * space, punctuation, etc.), it increments the left index and
             * then skips the rest of the loop iteration using continue. This
             * means it moves the left pointer to the next character and
             * starts the next loop iteration.
             *
             * purpose of this condition is to ignore non-alphanumeric
             * characters when checking if the string is a palindrome
             * */

            if ( !(chars[left] >= 'a' && chars[left] <= 'z')
                && !(chars[left] >= 'A' && chars[left] <= 'Z')
                && !(chars[left] >= '0' && chars[left] <= '9') ) {
                left++;
                continue;
            }

            if ( !(chars[right] >= 'a' && chars[right] <= 'z')
                && !(chars[right] >= 'A' && chars[right] <= 'Z')
                && !(chars[right] >= '0' && chars[right] <= '9') ) {
                right--;
                continue;
            }

            /*
             * chars[left] == chars[right] is checking if the characters at the left
             * and right indices are the same. If they are, it increments the
             * left index and decrements the right index and then starts the
             * next loop iteration using continue. This means it moves the
             * left pointer to the next character and the right pointer to the
             * previous character and starts the next loop iteration.
             *
             * chars[left] >= 'a' && chars[left] <= 'z' && chars[right] >=
             * 'A' && chars[right] <= 'Z' && chars[left] == chars[right] + 32
             * his condition checks if the character at the left index is a
             * lowercase letter and the character at the right index is the
             * corresponding uppercase letter. The + 32 is used to convert an
             * uppercase ASCII character to its lowercase equivalent, as the
             * ASCII value of an uppercase letter is 32 less than its
             * lowercase counterpart.
             *
             * chars[right] >= 'a' && chars[right] <= 'z' && chars[left] >=
             * 'A' && chars[left] <= 'Z' && chars[right] == chars[left] + 32
             * This condition checks if the character at the right index is a
             * lowercase letter and the character at the left index is the
             * corresponding uppercase letter.
             *
             * */

            if ( chars[left] == chars[right]
                || chars[left] >= 'a' && chars[left] <= 'z' && chars[right] >= 'A' && chars[right] <= 'Z' && chars[left] == chars[right] + 32
                || chars[right] >= 'a' && chars[right] <= 'z' && chars[left] >= 'A' && chars[left] <= 'Z' && chars[right] == chars[left] + 32 ) {
                left++;
                right--;
                continue;
            }

            return false;
        }

        return true;

    }
}



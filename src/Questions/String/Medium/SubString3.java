package Questions.String.Medium;

public class SubString3 {
    public static void main(String[] args) {
        String sub = "aabacbebebe";
        KUniqueSubString(sub, 3);
    }

    static void KUniqueSubString(String subStr, int k) {
        int maxLength = -1;
        int[] count = new int[26];
        int unique = 0;
        int i = 0, j = 0;

        while ( j < subStr.length() ) {
            if ( unique <= k ) {
                int index = subStr.charAt(j) - 'a';
                if ( count[index] == 0 ) {
                    unique++;
                }
                count[index]++;
                j++;
            }
            if ( unique > k ) {
                int index = subStr.charAt(i) - 'a';
                count[index]--;
                if ( count[index] == 0 ) {
                    unique--;
                }
                i++;
            }
            if ( unique == k ) {
                maxLength = Math.max(maxLength, j - i);
            }
        }
        if ( maxLength == -1 ) {
            System.out.println(-1);
        } else {
            System.out.println(maxLength);
        }
    }
}

/*
 * refactor the code in SubString2
 *
 * Instead of using a HashMap to keep track of the unique characters in the
 * substring, I would use an array of size 26 (assuming the input string only
 * contains lowercase characters) to keep track of the count of each character
 * .This would be more memory efficient.
 *
 * Instead of using a while loop with two nested while loops to iterate
 * through the input string and check the substring, I would use a sliding
 * window approach. This would make the code more readable and easier to
 * understand.
 *
 * I have also used a variable to keep track of the maximum length of the
 * substring instead of using the 'ans' variable and updating it inside the
 * while loops.
 *
 * refactored code, use a sliding window approach, where two
 * pointers i and j are used to keep track of the substring. The variable
 * unique keeps track of the number of unique characters in the substring.
 * The outer while loop runs until j pointer is less than the length of the
 * string, and two inner if conditions keep track of expanding and shrinking
 * the window.
 *
 * As the window is expanded, the characters are added to the
 * count array and the unique variable is incremented. If the unique variable
 * is greater than k, we shrink the window and decrease the count of the
 * characters and unique variable.
 *
 * The maximum length of the substring is then returned after the loop.
 *
 *
 * The time complexity of SubString2 and SubString3 are different.
 * SubString2 uses a HashMap to keep track of the unique characters in the
 * substring, and also uses two nested while loops to iterate through the
 * input string and check the substring. The time complexity of this solution
 * is O(n^2), where n is the length of the input string. This is because for
 * each character in the input string, we are iterating through the entire
 * input string again to check the substring.
 *
 * On the other hand, SubString3 uses an array of size 26 to keep track of
 * the count of each character and uses a sliding window approach with two
 * pointers to iterate through the input string. The time complexity of this
 * solution is O(n), where n is the length of the input string. This is
 * because we are iterating through the input string only once, and for each
 * character, we are only doing constant time operations (updating the count
 * array and the unique variable).
 *
 * So, SubString3 is more efficient than SubString2 in terms of time
 * complexity, as it takes linear time.*/
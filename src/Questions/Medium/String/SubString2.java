package Questions.Medium.String;

import java.util.HashMap;
/*
 * Solution Link-> PepCoding
 * https://www.youtube.com/watch?v=SIh3RfFPQwU
 * */

public class SubString2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        char[] str = "aabacbebebe".toCharArray();
        String sub = String.valueOf(str);

        KUniqueSubString(sub, 3);
    }

    static void KUniqueSubString(String subStr, int k) {

        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int i = -1;
        int j = -1;

        while ( true ) {
            boolean f1 = false;
            boolean f2 = false;

            //
            while ( i < subStr.length() - 1 ) {
                f1 = true;
                i++;
                char ch = subStr.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if ( map.size() < k ) {
                    continue;
                } else if ( map.size() == k ) {
                    int len = i - j;
                    if ( len > ans ) {
                        ans = len;
                    }
                } else {
                    break;
                }
            }

            //
            while ( j < i ) {
                f2 = true;
                j++;
                char ch = subStr.charAt(j);
                if ( map.get(ch) == 1 ) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }

                if ( map.size() > k ) {
                    continue;
                } else if ( map.size() == k ) {
                    System.out.println("RAAAN " + map);
                    int len = i - j;
                    if ( len > ans ) {
                        ans = len;
                    }
                    break;
                }
            }

            if ( f1 == false && f2 == false ) {
                System.out.println(ans);
                System.out.println(map);
                break;
            }
        }
    }
}

/*
 * Sure, here's the logic for the SubString2 code broken down into steps:
 *
 * Initialize an integer variable ans to 0 and a HashMap map to keep track of
 * the unique characters in the substring.
 *
 * Initialize two variables i and j to -1.
 *
 * Start an infinite while loop.
 *
 * Within the while loop, use a nested while loop to iterate through the input
 * string and check the substring.
 *
 * For each character in the input string, increment the value in the HashMap
 * for that character by 1.
 *
 * If the size of the HashMap is less than k, continue iterating through the
 * input string.
 *
 * If the size of the HashMap is equal to k, update the value of ans to the
 * length of the substring.
 *
 * If the size of the HashMap is greater than k, break out of the nested while
 * loop.
 *
 * Use another nested while loop to iterate through the substring,
 * decrementing the value in the HashMap for each character.
 *
 * If the value in the HashMap for a character is 1, remove that character
 * from the HashMap.
 *
 * If the size of the HashMap is greater than k, continue iterating through
 * the substring.
 *
 * If the size of the HashMap is equal to k, update the value of ans to the
 * length of the substring, and break out of the nested while loop.
 *
 * Check if the two nested while loops have completed (i.e. f1 and f2 are both
 * false). If so, print the value of ans and break out of the infinite while
 * loop.
 *
 * The program will end here, returning the length of the longest substring
 * with at most k unique characters.
 *
 * Note that, in this implementation it is not possible to get the substring,
 * it is only returning the length of substring with at most k unique characters.
 *  */

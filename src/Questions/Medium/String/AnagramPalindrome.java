package Questions.Medium.String;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] str = sc.next().toCharArray();
        String S = String.valueOf(str);
        isPossible(S);
    }

    static void isPossible(String S) {

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for ( int i = 0; i < S.length(); i++ ) {

            if ( hm.containsKey(S.charAt(i)) ) {

                hm.remove(S.charAt(i));

            } else {
                hm.put(S.charAt(i), 0);
            }
        }

        if ( hm.size() == 1 || hm.size() == 0 ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

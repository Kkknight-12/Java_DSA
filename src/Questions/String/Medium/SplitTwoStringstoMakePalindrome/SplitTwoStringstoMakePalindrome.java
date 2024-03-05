package Questions.String.Medium.SplitTwoStringstoMakePalindrome;

import java.util.Scanner;

/*
 * time complexity is O(n)
 * https://leetcode.com/problems/split-two-strings-to-make-palindrome/solutions/891646/java-greedy-explanation-to-o-n-solution/?languageTags=java
 *  */
public class SplitTwoStringstoMakePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char[] charArr1 = sc.next().toCharArray();
//        char[] charArr2 = sc.next().toCharArray();
//        String a = String.valueOf(charArr1);
//        String b = String.valueOf(charArr2);
        String a = "ulacfd"; // ulacfd
        String b = "dfccfd"; // jizalu
        boolean result = checkPalindromeFormation(a, b);
        System.out.println(result);
    }

    public static boolean checkPalindromeFormation(String a, String b) {
        return validate(a, b) || validate(b, a);
    }

    // checking if concatenating string a and b or b and a form a palindrome
    private static boolean validate(String a, String b) {
        int l = 0, r = a.length() - 1;
        while ( l < r ) {
            System.out.println();
            System.out.println("a-l " + a.charAt(l));
            System.out.println("b-r " + b.charAt(r));
            if ( a.charAt(l) != b.charAt(r) )
                break;
            l++;
            r--;
        }
        System.out.println();
        System.out.println("a-l-r " + l + " " + r);
        System.out.println("b-l-r " + l + " " + r);
        return validate(a, l, r) || validate(b, l, r);
    }

    // checking if string a or b form a palindrome
    private static boolean validate(String a, int l, int r) {
        System.out.println("string ---" + a);
        while ( l < r ) {
            System.out.println();
            System.out.println("a-l " + a.charAt(l));
            System.out.println("a-r " + a.charAt(r));
            if ( a.charAt(l) != a.charAt(r) )
                break;
            l++;
            r--;
        }
        return l >= r;
    }
}

/*
 * The time complexity of this solution is O(n), where n is the length of the
 * string. The outer while loop in the validate() method runs for n/2 times,
 * and the inner while loop in the validate() method also runs for n/2 times.
 * Therefore, the overall time complexity is O(n).
 *  */
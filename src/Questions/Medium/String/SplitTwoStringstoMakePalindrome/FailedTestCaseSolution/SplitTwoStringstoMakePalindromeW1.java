package Questions.Medium.String.SplitTwoStringstoMakePalindrome.FailedTestCaseSolution;

import java.util.Scanner;

public class SplitTwoStringstoMakePalindromeW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charArr1 = sc.next().toCharArray();
        char[] charArr2 = sc.next().toCharArray();
        String a = String.valueOf(charArr1);
        String b = String.valueOf(charArr2);
//        String a = "ulacfd";
//        String b = "jizalu";
        boolean result = checkPalindromeFormation(a, b);
        System.out.println(result);
    }

    public static boolean checkPalindromeFormation(String a, String b) {
        int l = 0, r = a.length() - 1;
        while ( l < r ) {
            System.out.println("a-l " + a.charAt(l));
            System.out.println("b-r " + b.charAt(r));
            if ( a.charAt(l) != b.charAt(r) ) {
                break;
            }
            l++;
            r--;
        }
//        System.out.println(a + " " + l + " " + r); // 3, 2
//        System.out.println(b + " " + l + " " + r); // 3, 2
        return isPalindrome(a, l, r) || isPalindrome(b, l, r);
    }

    private static boolean isPalindrome(String s, int l, int r) {
//        System.out.println(s + " " + l + " " + r);
//        System.out.println("l " + s.charAt(l) + " " + l);
//        System.out.println("r " + s.charAt(r) + " " + r);
        while ( l < r ) {
//            System.out.println("l " + s.charAt(l));
//            System.out.println("r " + s.charAt(r));
            if ( s.charAt(l) != s.charAt(r) ) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}







package Questions.String.Medium.SplitTwoStringstoMakePalindrome;

public class Practice {
    public static void main(String[] args) {


        String a = "ulacfd";
        String b = "jizalu";

//        System.out.println(a.substring(0, 3));
//        System.out.println(b.substring(3));

        boolean result = checkPalindromeFormation(a, b);
        System.out.println(result);

    }

    static boolean checkPalindromeFormation(String a, String b) {
        for ( int i = 0; i < a.length(); i++ ) {
//            String s1 = a.substring(0, i);
//            String s2 = b.substring(i);
//            System.out.print("i " + i + " " + s1 + " - " + s2);
//            System.out.println();
//            if ( isPalindrome(s1 + s2) ) {

            if ( isPalindrome(a.substring(0, i) + b.substring(i)) || isPalindrome(b.substring(0, i) + a.substring(i)) ) {
//                System.out.println("true");
                return true;
            }


        }
        return false;
    }

    private static boolean isPalindrome(String s) {

        int l = 0, r = s.length() - 1;
        while ( l < r ) {
            if ( s.charAt(l) != s.charAt(r) ) {
                return false;
            }
            l++;
            r--;
        }
        System.out.println(s);
        return true;
    }
}

/*
 * time complexity of the code is O(n^2), where n is
 * the length of the input strings a and b.
 *
 * This is because there is a loop that runs n times, where n is the length
 * of the string. Inside this loop, two substrings are created and checked if
 * they are palindromes. The substring method has a time complexity of O(n)
 * and the isPalindrome method also has a time complexity of O(n). Therefore,
 * the overall time complexity of the checkPalindromeFormation method is O(n^2).
 *  */
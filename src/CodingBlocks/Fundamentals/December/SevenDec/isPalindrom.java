package CodingBlocks.Fundamentals.December.SevenDec;

public class isPalindrom {
    public static void main(String[] args) {
        String str = "annaa";


        boolean result = printPalindrom(str);
        System.out.println(result);
    }

    static boolean printPalindrom(String str) {
        int s = 0;
        int e = str.length() - 1;

        while ( s < e ) {
            if ( str.charAt(s) == str.charAt(e) ) {
                s++;
                e--;
            } else {
                return false;
            }
        }
        return true;
    }
}

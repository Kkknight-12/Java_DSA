package CodingBlocks.Fundamentals.December.SevenDec;

/*
 * nitin
 * -> n i t i n
 * -> i t i
 * -> n i t i n
 * */
public class isSubStringPalindrom {
    public static void main(String[] args) {
        String str = "annaa";

        AllSubString(str);
        isSubStringPalindrom(str);
    }

    static boolean isSubStringPalindrom(String str) {
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

    static void AllSubString(String str) {
        for ( int s = 0; s < str.length(); s++ ) {
            // starting + 1 to end
            for ( int e = s + 1; e <= str.length(); e++ ) {
                boolean isPalindrom = isSubStringPalindrom(str.substring(s, e));
                if ( isPalindrom ) {
                    System.out.println(str.substring(s, e));
                }
            }
        }
    }
}

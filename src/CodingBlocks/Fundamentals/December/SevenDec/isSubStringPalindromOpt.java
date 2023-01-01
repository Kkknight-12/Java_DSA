package CodingBlocks.Fundamentals.December.SevenDec;

public class isSubStringPalindromOpt {
    public static void main(String[] args) {
//        isSubOp("nitin");
        printIsSub("nittin");
    }

    static void isSubOp(String str, int L, int R) {
        while ( L >= 0 && R < str.length() ) {
            if ( str.charAt(L) == str.charAt(R) ) {
                System.out.println(str.substring(L, R + 1));
                L--;
                R++;
            } else {
                break;
            }
        }
    }

    static void printIsSub(String str) {
        for ( int i = 0; i <= str.length(); i++ ) {
            isSubOp(str, i, i); // odd substring length
            isSubOp(str, i, i + 1); // even substring length
        }
    }
}

package LakshayaSirquestions.Medium.String;

public class ASCII {
    public static void main(String[] args) {
        char[] strSmall = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for ( int i = 0; i < strSmall.length; i++ ) {
            System.out.println(( int ) strSmall[i]);
        }
        // 97 - 122

        System.out.println();

        char[] strBig = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        for ( int i = 0; i < strBig.length; i++ ) {
            System.out.println(( int ) strBig[i]);
        }
        // 65 - 90

        System.out.println();
        char capL = 'a' - 32;
        System.out.println(capL);
        char smallL = 'A' + 32;
        System.out.println(smallL);
    }

    /*
     * a -> 97
     * A -> 65
     * A - a = -32
     * a - A = 32
     *  */

    /*
     * so to convert capital to small we subtract 32
     * and to convert small to big we add 32   */
}

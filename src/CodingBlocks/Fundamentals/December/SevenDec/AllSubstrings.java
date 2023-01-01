package CodingBlocks.Fundamentals.December.SevenDec;

public class AllSubstrings {
    public static void main(String[] args) {
        String str = "the sky is blue";

        printAllSubString(str);
    }

    static void printAllSubString(String str) {
        int count = 0;
        // the  sky is blue
        //  ue
        for ( int s = 0; s < str.length(); s++ ) {
            // starting + 1 to end
            // the  sky is blue
            // e
            for ( int e = s + 1; e <= str.length(); e++ ) {
                System.out.println(str.substring(s, e));
            }
            count++;
            System.out.println();
        }
        System.out.println("count " + count);
    }
}

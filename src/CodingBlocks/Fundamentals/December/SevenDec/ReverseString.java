package CodingBlocks.Fundamentals.December.SevenDec;

public class ReverseString {
    public static void main(String[] args) {
        String str = "the sky is blue";

//        System.out.println(str.length() - 1); // 14
//        System.out.println(str.charAt(14)); // e

        // logic
        while ( true ) {
            int i = str.lastIndexOf(" ");
            String word = str.substring(i + 1);
            System.out.println(word); // blue
            if ( i == -1 ) {
                break;
            }
            str = str.substring(0, i);
//        System.out.println(str);
        }
    }
}

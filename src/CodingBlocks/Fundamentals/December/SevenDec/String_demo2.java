package CodingBlocks.Fundamentals.December.SevenDec;

/*
 * https://www.programiz.com/java-programming/library/string/substring
 * The substring() method extracts a substring from the string and returns it.
 *
 * The substring() method takes two parameters.
 * startIndex - the beginning index
 * endIndex (optional) - the ending index
 *
 * The substring begins with the character at the startIndex and extends
 * to the character at index endIndex - 1.
 * If the endIndex is not passed, the substring begins with the character at
 * the specified index and extends to the end of the string.
 * */
public class String_demo2 {
    public static void main(String[] args) {
        String str1 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str1.substring(0, 4)); // java

        System.out.println(str1.substring(0)); // java is fun
        System.out.println();


        // starting to length - 1
        for ( int s = 0; s < str1.length(); s++ ) {
            // starting + 1 to end
            for ( int e = s + 1; e <= str1.length(); e++ ) {
                System.out.println(str1.substring(s, e));
            }
            System.out.println();
        }


    }
}

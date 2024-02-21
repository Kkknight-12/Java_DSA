package Questions.Medium.String.Practice;

import java.util.List;

public class StringMethods {
    public static void main(String[] args) {

        // Character Array
        char[] charArr = "cbaeicde".toCharArray();

        // character array indexing
        System.out.println(charArr[0]); // c

        // convert character array to string
        // valueOf method form string
        System.out.println(String.valueOf(charArr)); // cbaeicde

        // save a char to string
        String temp1 = String.valueOf(charArr[0]);
        System.out.println(temp1); // c

        // convert character array to list
        System.out.println(List.of(charArr)); // [[C@5acf9800]
    }
}

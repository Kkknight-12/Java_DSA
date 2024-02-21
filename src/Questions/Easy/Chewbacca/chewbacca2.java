package Questions.Easy.Chewbacca;

import java.util.Scanner;

public class chewbacca2 {
    public static int changeDigit(char t) {
        // following some ASCII value logic
        // because of which we are adding 48.
        return '9' - t + 48;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // we store the user input with .next() method od scanner
//        String s = scanner.next();
        String s = "4545";

        // create a character array
        // and store input in it
//    char[] x = new char[20];
        char y;
        char[] x = s.toCharArray();
        System.out.println(x);

        for ( int i = 0; i < s.length(); i++ ) {
            // if i is first digit and it is 9
            if ( i == 0 && x[i] == '9' ) {
                // do nothing
                continue;
            }

            // type casting integer to character
            y = ( char ) changeDigit(x[i]);

            // if the value which we have received is smaller than previous value.
            // Then replace original value.
            if ( x[i] > y )
                x[i] = y;
        }

        System.out.println(x);
    }
}

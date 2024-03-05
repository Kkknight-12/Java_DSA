package Questions.String.Medium;

import java.util.Scanner;

public class StringsToggleCase {
    public static void main(String[] args) {

        // create a char array from a input string
        Scanner sc = new Scanner(System.in);

        char[] str = sc.next().toCharArray();

        for ( int i = 0; i < str.length; i++ ) {
            if ( str[i] >= 'A' && str[i] <= 'Z' ) {
                str[i] = ( char ) (str[i] + 'a' - 'A');
            } else if ( str[i] >= 'a' && str[i] <= 'z' ) {
                str[i] = ( char ) (str[i] + 'A' - 'a');
            }
        }

        System.out.println(str);
    }
}

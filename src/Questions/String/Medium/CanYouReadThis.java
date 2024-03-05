package Questions.String.Medium;


import java.util.Scanner;

/*
 * A - Z -> 65 - 90
 * a - z -> 97 - 122 */
public class CanYouReadThis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] charArr = "IAmACompetitiveProgrammer".toCharArray();
//        char[] charArr = sc.next().toCharArray();

        for ( int i = 0; i < charArr.length; i++ ) {

            String word = "";
            if ( charArr[i] >= 'A' && charArr[i] <= 'Z' ) {
                word += charArr[i];
                i++;

                while ( i < charArr.length && charArr[i] >= 'a' && charArr[i] <= 'z' ) {
                    word += charArr[i++];
                }
                System.out.println(word);
                word = "";
                i--;
            }
        }
    }
}

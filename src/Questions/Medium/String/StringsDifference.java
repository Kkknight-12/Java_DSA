package Questions.Medium.String;

import java.util.Scanner;

public class StringsDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        char[] str = sc.next().toCharArray();

        char[] str = "acb".toCharArray();

        for ( int i = 1; i < str.length; i++ ) {
            System.out.print(str[i - 1]);
            System.out.print(( int ) str[i] - ( int ) str[i - 1]);
        }
        System.out.print(str[str.length - 1]);
    }
}

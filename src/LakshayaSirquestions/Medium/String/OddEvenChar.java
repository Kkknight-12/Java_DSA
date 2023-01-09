package LakshayaSirquestions.Medium.String;

import java.util.Scanner;

public class OddEvenChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] str = sc.next().toCharArray();
//        char[] str = "abcg".toCharArray();

        for ( int i = 0; i < str.length; i++ ) {
            int tempV = str[i];
//            System.out.println(tempV);
            if ( i % 2 == 0 ) {
                str[i] = ( char ) (tempV + 1);
            } else {
                str[i] = ( char ) (tempV - 1);
            }
        }
        System.out.println(str);
    }
}

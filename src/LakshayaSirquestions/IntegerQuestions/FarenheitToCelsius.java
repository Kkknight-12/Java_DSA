package LakshayaSirquestions.IntegerQuestions;

import java.util.Scanner;

public class FarenheitToCelsius {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();
        int step = sc.nextInt();


        for ( int i = min; i <= max; i = i + step ) {
            int c = ( int ) (5 / 9.0 * (i - 32));
            System.out.println(i + " " + c);
        }
    }
}

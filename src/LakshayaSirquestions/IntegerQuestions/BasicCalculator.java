package LakshayaSirquestions.IntegerQuestions;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int cal = 0;

        while ( true ) {
            char ch = sc.next().charAt(0);
            if ( ch == '*' || ch == '+' || ch == '/' || ch == '-' || ch == '%' ) {

                int n1 = sc.nextInt();
                int n2 = sc.nextInt();

                if ( ch == '*' ) {
                    cal = n1 * n2;
                    System.out.println(cal);
                } else if ( ch == '/' ) {
                    cal = n1 / n2;
                    System.out.println(cal);
                } else if ( ch == '+' ) {
                    cal = n1 + n2;
                    System.out.println(cal);
                } else if ( ch == '-' ) {
                    cal = n1 - n2;
                    System.out.println(cal);
                } else if ( ch == '%' ) {
                    cal = n1 % n2;
                    System.out.println(cal);
                }

            } else if ( ch == 'X' || ch == 'x' ) {
                break;
            } else {
                System.out.println("Invalid operation. Try again.");
            }
        }
    }
}

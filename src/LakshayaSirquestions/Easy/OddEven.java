package LakshayaSirquestions.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
//    int Number = 12134;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] arr = new long[num];

        for ( int i = 0; i < arr.length; i++ ) {
            arr[i] = sc.nextLong();
        }

        long digit;

        for ( int i = 0; i < arr.length; i++ ) {
            long oddDigitSum = 0;
            long evenDigitSum = 0;
            while ( arr[i] > 0 ) {
                //finds the last digit of the given number
                digit = arr[i] % 10;
                //adds last digit to the variable sum
                if ( digit % 2 == 0 ) {
                    evenDigitSum = evenDigitSum + digit;
                } else {
                    oddDigitSum = oddDigitSum + digit;
                }
                //removes the last digit from the number
                arr[i] = arr[i] / 10;
            }// while loop ends

            if ( oddDigitSum % 3 == 0 || evenDigitSum % 4 == 0 ) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } // for loop ends

    }
}

package LakshayaSirquestions.Easy;

import java.util.Scanner;

public class BostonNumber {
    public static void main(String[] args) {

//    int N = 378;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if ( N > 1 && N < 2147483647 ) {
            isBostonNumber(N);
        } else {
            System.out.println(0);
        }
    }

    public static void isBostonNumber(int n) {
        int num = n;
        int factorsSum = 0;
        int numOfFactors = 0;
        int i;

        for ( i = 2; i <= n; i++ ) {
            while ( n % i == 0 ) {
                factorsSum = factorsSum + sumOfdigit(i);
                numOfFactors++;
                n /= i;
            } // while loop ends
        }

        if ( numOfFactors > 1 ) {
            int sum = sumOfdigit(num);

            if ( factorsSum == sum ) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }
    }

    public static int sumOfdigit(int n) {
        int digit, sum = 0;
        while ( n > 0 ) {
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        return sum;
    }

}

package Questions.Easy;

import java.util.Scanner;

public class BostonNumberBackup {
    public static void main(String[] args) {

//    int N = 378;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        isBostonNumber(N);
    }

    public static void isBostonNumber(int n) {
        int num = n;
        int factorsSum = 0;
        int i;
        for ( i = 2; i <= n; i++ ) {
            while ( n % i == 0 ) {
                factorsSum += i;
                n /= i;
            } // while loop ends
        }

        int sum = sumOfdigit(num);

        if ( factorsSum == sum ) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static int sumOfdigit(int n) {
        int digit, sum = 0;
        //
        while ( n > 0 ) {
            //finds the last digit of the given number
            digit = n % 10;
            //adds last digit to the variable sum
            sum = sum + digit;
            //removes the last digit from the number
            n = n / 10;
        }
        return sum;
    }

}

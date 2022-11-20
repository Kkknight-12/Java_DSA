package LakshayaSirquestions.Easy;

import java.util.Scanner;

/*  https://www.hackerrank.com/contests/mock-icpc-august/challenges/boston-numbers/problem
 *
 * https://www.hackerrank.com/contests/mock-icpc-august/challenges/boston-numbers/forum
 * */
public class BostonNumberHackerRank {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isBostonNumber(n);

    }

    public static void isBostonNumber(int n) {
        int i = 2;
        int psum = 0;
        int num = n;
        while ( i <= n ) {
            while ( n % i == 0 ) {
                psum = psum + sumofdigit(i);
                n = n / i;
            }
            i++;
        }

        int sum = sumofdigit(num);
        if ( sum == psum ) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    public static int sumofdigit(int n) {
        int sum = 0;
        while ( n > 0 ) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }
}

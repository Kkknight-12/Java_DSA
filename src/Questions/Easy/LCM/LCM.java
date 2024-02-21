package Questions.Easy.LCM;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//    int n1 = sc.nextInt();
//    int n2 = sc.nextInt();
//
//    int num1 = n1;
//    int num2 = n2;
//
//    while ( n1 % n2 != 0 ) {
//      int rem = n1 % n2;
//      n1 = n2;
//      n2 = rem;
//    }
//
//    int gcd = n2;
//    int lcm = (num1 * num2) / gcd;
//
//    System.out.println(lcm);

//      https://www.programiz.com/java-programming/examples/lcm
        CalculateLCMWithLoop();
        CalculateLCMWithGCD();
    }

    static void CalculateLCMWithLoop( ) {
        int a = 4;
        int b = 6;

        int lcm = a > b ? a : b;

        while ( true ) {
            if ( lcm % a == 0 && lcm % b == 0 ) {
                break;
            }
            lcm++;
        }
        System.out.println(lcm);
    }

    static void CalculateLCMWithGCD( ) {
        int a = 4;
        int b = 6;
        int hcf = 1;

        for ( int i = 1; i <= a && i <= b; i++ ) {
            if ( a % i == 0 && b % i == 0 ) {
                hcf = i;
            }
        }
        int lcm = (a * b) / hcf;
        System.out.println(lcm);
    }
}
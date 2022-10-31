package LakshayaSirquestions.Easy;

import java.util.Scanner;

public class BostonNumberBackup {
  public static void main(String[] args) {

//    int N = 378;
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int Number = N;
    int factorsSum = 0;
    int i;

    for ( i = 2; i <= N; i++ ) {
      while ( N % i == 0 ) {
        factorsSum += i;
        N /= i;
      } // while loop ends
    }

//    System.out.println("Sum of Factors " + factorsSum);

    int digit, sum = 0;
    //
    while ( Number > 0 ) {
      //finds the last digit of the given number
      digit = Number % 10;
      //adds last digit to the variable sum
      sum = sum + digit;
      //removes the last digit from the number
      Number = Number / 10;
    }

    //prints the result
    //    System.out.println("Sum of Digits: " + sum);


    if ( factorsSum == sum ) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }

  }
}

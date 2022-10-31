package LakshayaSirquestions.Easy;

import java.util.Scanner;

public class PrintPrime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    if ( num == 0 || num == 1 ) {
      System.out.println(0);
    } else {

      for ( int i = 2; i < num; i++ ) {
        int incrementer = 2;
        boolean isPrime = true;

        while ( incrementer < i ) {
          if ( i % incrementer == 0 ) {
            isPrime = false;
            break;
          }
          incrementer++;
        }
        if ( isPrime ) {
          System.out.println(i);
        }
      }
    }
  }
}

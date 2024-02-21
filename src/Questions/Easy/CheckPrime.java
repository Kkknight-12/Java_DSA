package Questions.Easy;

import java.util.Scanner;

public class CheckPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    boolean isPrime = true;

    for ( int i = 2; i < num / 2; i++ ) {
      if ( num % i == 0 ) {
        isPrime = false;
        System.out.println("Not Prime");
        break;
      }
    }
    if ( isPrime ) {
      System.out.println("Prime");
    }
  }
}

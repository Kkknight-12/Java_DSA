package LakshayaSirquestions.Easy;

import java.util.Scanner;

public class PrimeFactors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
//    String result = "";
    int i;

    for ( i = 2; i <= N; i++ ) {
      while ( N % i == 0 ) {
//        result += i;
        System.out.print(i + " ");
        N /= i;
      } // while loop ends
    }

//    System.out.print(result + " ");
  }
}

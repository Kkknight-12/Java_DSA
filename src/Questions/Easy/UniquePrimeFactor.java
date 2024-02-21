package Questions.Easy;

import java.util.HashMap;
import java.util.Scanner;

/* help -> https://www.geeksforgeeks.org/distinct-prime-factors-of-a-given-number-n/ */


public class UniquePrimeFactor {
  // Function to find distinct prime factor
// of a number N
  static void distinctPrimeFactors(int N) {
    if ( N < 2 ) {
      System.out.print(-1);
      return;
    }
    int i;
    HashMap<Integer, Boolean> visited = new HashMap<>();
    for ( i = 2; i * i <= N; i++ ) {
      while ( N % i == 0 ) {
        if ( !visited.containsKey(i) ) {
          System.out.print(i + " ");
          visited.put(i, true);
        }
        N /= i;
      } // while loop ends
    } // loop ends
    if ( N > 2 ) {
      System.out.print(N);
    }
  }

  // Driver Code
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

//    int N = 1386;
    int N = sc.nextInt();
    distinctPrimeFactors(N);
  }

}

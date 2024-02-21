package Questions.Easy;

import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int min = Math.min(num1, num2);
    int GCD = 0;

    for ( int i = 1; i <= min; i++ ) {
      if ( num1 % i == 0 && num2 % i == 0 ) {
        GCD = i;
      }
    }

    System.out.println(GCD);
  }
}

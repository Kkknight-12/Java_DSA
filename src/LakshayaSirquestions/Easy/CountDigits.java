package LakshayaSirquestions.Easy;

import java.util.Scanner;

public class CountDigits {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int digit = sc.nextInt();

    CountDigitOccurence(num, digit);
  }

  static void CountDigitOccurence(int num, int digit) {
    int count = 0;

    while ( num != 0 ) {
      int j = num % 10;

      if ( j == digit ) {
        count++;
      }

      num = num / 10;
    }

    System.out.println(count);
  }

}

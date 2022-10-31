package LakshayaSirquestions.Easy;

import java.util.Scanner;

public class InverserNumberSolution {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int inverted = 0;
    int position = 1;

    while ( n > 0 ) {
      int digit = n % 10;
      n = n / 10;
      double multi = position * Math.pow(10, digit - 1);
      inverted += position * Math.pow(10, digit - 1);
      position++;
    }
    System.out.println(inverted);
  }
}

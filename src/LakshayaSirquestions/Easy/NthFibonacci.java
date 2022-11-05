package LakshayaSirquestions.Easy;

import java.util.Scanner;

public class NthFibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count = 0;

    int num1 = 0;
    int num2 = 1;
    int nthfibo = 0;

    while ( count < num ) {
      nthfibo = num1 + num2;
      num1 = num2;
      num2 = nthfibo;
      count++;
    }

    System.out.println(num1);
  }
}

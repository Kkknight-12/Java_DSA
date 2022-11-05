package LakshayaSirquestions.Easy;

import java.util.Scanner;

public class SimpleInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0;
    while ( true ) {
      int inp = sc.nextInt();
      sum += inp;

      if ( sum < 0 ) {
        break;
      } else {
        System.out.println(inp);
      }
    }
  }
}

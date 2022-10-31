package LakshayaSirquestions.Easy;

import java.util.Scanner;

public class table2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int tableDigit = sc.nextInt();
    int count = 1;
    int limit = sc.nextInt();

    while ( count <= limit ) {
      int result = tableDigit * count;
      System.out.println(result);
      count++;
    }
  }
}

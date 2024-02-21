package Questions.Easy;

import java.util.Scanner;

public class print1toN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = 1;
    int limit = sc.nextInt();

    while ( num <= limit ) {
      System.out.println(num);
      num++;
    }
  }
}

package Questions.Easy;

import java.util.Scanner;

public class table {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int tableDigit = sc.nextInt();
    int count = 1;
    int limit = sc.nextInt();
    int result = 0;


    while ( true ) {
      result = tableDigit * count;

      if ( limit < result ) {
        break;
      }
      System.out.println(result);
      count++;
    }
  }
}

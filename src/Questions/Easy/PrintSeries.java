package Questions.Easy;

import java.util.Scanner;

public class PrintSeries {
  public static void main(String[] args) {
//    int n1 = 10;
//    int n2 = 4;

    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int count = 1;
    int i = 1;

    while ( count <= n1 ) {
      int num = (3 * i) + 2;
      if ( num % n2 != 0 ) {
        System.out.println(num);
        count++;
      }
      i++;
    }
  }
}

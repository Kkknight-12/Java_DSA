package LakshayaSirquestions.Easy;

import java.util.Scanner;

public class SimpleInputBackUp {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

//    int[] arr = {1, 2, 88, -100, 49};
    int[] arr = new int[n];

    for ( int i = 0; i < n; i++ ) {
      arr[i] = sc.nextInt();
    }

    int sum = 0;
    int count = 0;

    while ( count < arr.length ) {
//      int temp = sum;
      sum += arr[count];

      if ( sum > 0 ) {
        System.out.println(arr[count]);
      } else {
        break;
      }
      count++;
    }

  }
}

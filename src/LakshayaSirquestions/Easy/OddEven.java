package LakshayaSirquestions.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
//    int Number = 12134;
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] arr = new int[num];

    for ( int i = 0; i < arr.length; i++ ) {
      arr[i] = sc.nextInt();
    }

    int digit;

    for ( int i = 0; i < arr.length; i++ ) {
      int sum = 0;
      while ( arr[i] > 0 ) {
        //finds the last digit of the given number
        digit = arr[i] % 10;
        //adds last digit to the variable sum
        sum = sum + digit;
        //removes the last digit from the number
        arr[i] = arr[i] / 10;
      }

      if ( sum % 2 == 0 ) {
        if ( sum % 4 == 0 ) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
      } else {
        if ( sum % 3 == 0 ) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
      }
      

    }

  }
}

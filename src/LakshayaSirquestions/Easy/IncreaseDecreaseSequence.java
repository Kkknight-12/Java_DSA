package LakshayaSirquestions.Easy;

import java.util.Scanner;

public class IncreaseDecreaseSequence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    boolean incOrder = true;
    boolean decOrder = true;

    // using dynamic array
    int[] arr = new int[N];

    // store user numbers
    for ( int i = 0; i < N; i++ ) {
      int digit = sc.nextInt();
      arr[i] = digit;
    }

    int length = arr.length - 1;

    for ( int i = 0; i < length; i++ ) {
      //
      if ( !(arr[i] < arr[i + 1]) ) {
        incOrder = false;
      }
    }

    for ( int i = 0; i < length; i++ ) {
      //
      if ( !(arr[i + 1] > arr[i]) ) {
        decOrder = false;
      }
    }

    if ( incOrder || decOrder ) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }

  }
}

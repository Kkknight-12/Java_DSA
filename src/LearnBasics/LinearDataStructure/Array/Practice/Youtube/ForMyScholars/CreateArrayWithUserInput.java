package LearnBasics.LinearDataStructure.Array.Practice.Youtube.ForMyScholars;

import java.util.Scanner;

public class CreateArrayWithUserInput {
  public static void main(String[] args) {

    int n;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter no of elements in array ");
    n = s.nextInt();

    int a[] = new int[n];
    System.out.print("Enter Values ");
    for ( int i = 0; i < n; i++ ) {
      a[i] = s.nextInt();
    }

    System.out.println("Elements are:");
    for ( int i = 0; i < n; i++ ) {
      System.out.println(a[i]);

    }
  }
}

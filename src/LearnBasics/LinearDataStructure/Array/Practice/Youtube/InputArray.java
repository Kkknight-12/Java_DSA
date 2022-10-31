package LearnBasics.LinearDataStructure.Array.Practice.Youtube;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements you want to store: ");
//reading the number of elements from the that we want to enter
    n = sc.nextInt();
//creates an array in the memory of length 10
    int[] array = new int[n];
    System.out.println("Enter the elements of the array: ");
    for ( int i = 0; i < n; i++ ) {
      //reading array elements from the user
      array[i] = sc.nextInt();
    }
    System.out.println("Array elements are: ");


    // accessing array
    // using for loop
    for ( int i = 0; i < n; i++ ) {
      System.out.println(array[i]);
    }

    // Arrays.toString
    System.out.println((Arrays.toString(array)));
  }

}

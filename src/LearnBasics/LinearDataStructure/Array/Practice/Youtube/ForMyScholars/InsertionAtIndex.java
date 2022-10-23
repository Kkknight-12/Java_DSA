package LearnBasics.LinearDataStructure.Array.Practice.Youtube.ForMyScholars;

import java.util.Scanner;

public class InsertionAtIndex {
  public static void main(String[] args) {

    // initializing integer value
    int originalArraySize, newElementIndex, newElement;

    // using scanner to take user input
    Scanner s = new Scanner(System.in);
    System.out.print("Enter no of elements in array ");
    originalArraySize = s.nextInt();

    // original, and new Array length
    int[] originalArray = new int[originalArraySize];
    int[] newArray = new int[originalArraySize + 1];

    // user input for Original Array
    System.out.print("Enter Values ");
    for ( int i = 0; i < originalArraySize; i++ ) {
      originalArray[i] = s.nextInt();
    }

    // position of new element to be inserted
    System.out.print("Enter index of new value to be inserted ");
    newElementIndex = s.nextInt();

    // value of new element to be inserted
    System.out.print("Enter new value to be inserted ");
    newElement = s.nextInt();

    // loop through new array and fill in position
    for ( int i = 0; i < originalArraySize + 1; i++ ) {
      if ( i < newElementIndex ) {
        newArray[i] = originalArray[i];
      } else if ( i == newElementIndex ) {
        newArray[i] = newElement;
      } else {
        newArray[i] = originalArray[i - 1];
      }
    }

    System.out.println("Elements are:");
    for ( int i = 0; i < originalArraySize + 1; i++ ) {
      System.out.print(newArray[i] + " ");
    }
  }
}

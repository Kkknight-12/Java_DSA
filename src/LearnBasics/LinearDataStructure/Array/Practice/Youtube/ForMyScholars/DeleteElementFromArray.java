package LearnBasics.LinearDataStructure.Array.Practice.Youtube.ForMyScholars;

import java.util.Scanner;

public class DeleteElementFromArray {
  public static void main(String[] args) {

    // initializing integer value
    int originalArraySize, newElementIndex, newElement;

    // using scanner to take user input
    Scanner s = new Scanner(System.in);
    System.out.print("Enter no of elements in array ");
    originalArraySize = s.nextInt();

    // original, and new Array length
    // new array length will be original Array length - 1, as we are
    // deleting 1 element
    int[] originalArray = new int[originalArraySize];
    int[] newArray = new int[originalArraySize - 1];

    // user input for Original Array
    System.out.print("Enter Values ");
    for ( int i = 0; i < originalArraySize; i++ ) {
      originalArray[i] = s.nextInt();
    }

    // position of new element to be deleted
    System.out.print("Enter index of value to be deleted ");
    newElementIndex = s.nextInt();

    // loop through new array and fill in position
    for ( int i = 0; i < originalArraySize; i++ ) {
      if ( i < newElementIndex ) {
        newArray[i] = originalArray[i];
      } else if ( i == newElementIndex ) {
//        we do nothing here we will just skip the index where we wanted to
//        delete the element
//        newArray[i] = newElement;
        continue;
      } else {
        newArray[i - 1] = originalArray[i];
      }
    }

    System.out.println("Elements are:");
    for ( int i = 0; i < originalArraySize - 1; i++ ) {
      System.out.print(newArray[i] + " ");
    }
  }
}

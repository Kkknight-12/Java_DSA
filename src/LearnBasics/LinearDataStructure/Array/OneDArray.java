package LearnBasics.LinearDataStructure.Array;
import java.util.Arrays;

public class OneDArray {
    public static void main( String args[] ) {

        // DECLARATION Syntax
        // int myArray[];

        // INITIALIZING
        // Initialization Syntax
        // myArray = new int [4];

        // INITIALIZING, DECLARATION using Array Literal
        // datatype[] arrayName = {Comma Separated list of values};
        // int[] myArray = {10,20,30,40};

        // Initialization and Declaration in one step
        int[] myArray = new int [4];

        // Accessing elements in an array
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

        System.out.println("-----------------");

        // Updating value of element at index 3
        myArray[3] = 900;

        // Accessing elements in the updated array
        System.out.println("Updated Array:");
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);

        }

        System.out.println(Arrays.toString(myArray));

    }
}

/*
* How are arrays stored in memory?
*
* In Java, arrays are dynamically allocated. Arrays are stored in the memory using a reference pointer,
* which points to the first element. For example, if we create an array of size 3 and name it myArray,
* then the variable will point to the start of the array.
*
* drawback of using array
*
* only drawback of using arrays is that we have to specify the size of the array during the time of
* instantiation. That means the size remains fixed and can not be extended. If we want to add more elements,
*  we will have to create a new array, copy all the items from the old array to the new one, and then
* insert the new element.
* */
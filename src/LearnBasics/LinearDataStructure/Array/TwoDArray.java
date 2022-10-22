package LearnBasics.LinearDataStructure.Array;

/* Two Dimensional Array is an array of references that holds references to other arrays.
* These arrays are preferably used if you want to put together data items in a table or
* matrix-like structure. Matrices are widely used in the field of Game Development, where
* you are required to store and update the location of the player at each second.
*
*
* If we take a look at the structure of the Two Dimensional Array, we get the idea that a
* Two Dimensional Array is basically an array of One Dimensional Array; in other words, every
* element points to the first element of a different One Dimensional Array.
*
* It is important to note that in 2D arrays, all values must have the same data type.
* This means that you can’t store an array of integers next to an array of strings and vice versa.
* For example, if one array is declared of type int, then its pointer can’t point to the string type array.
* Each element must be of the same data type.
 */

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        // INITIALIZATION
        // declare variables ->  type int
        int rows = 3;
        int columns = 4;

        int [][] my2DArray;
        my2DArray = new int[rows][columns];

        System.out.println("You have successfully created a 2DArray");

        System.out.println("----------------");

        // ADDING ELEMENTS To 2D ARRAY
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++){
                my2DArray[i][j] = i + j;
                // print -> line will not change, next element will be printed next to last.
                System.out.print(my2DArray[i][j]);
            }
            // create a line break
            System.out.println();
        }

        System.out.println("----------------");

        // UPDATING ELEMENT of 2D ARRAY
        // updating "10" at Row 0 and Column 1
        System.out.println(my2DArray[0][0]);
        my2DArray[0][0] = 10;
        System.out.println(my2DArray[0][0]);

        // Arrays.deepToString -> Simple way to print an array in console
        // https://stackoverflow.com/questions/19648240/the-best-way-to-print-a-java-2d-array
        System.out.println(Arrays.deepToString(my2DArray));
    }
}

/*"new" keyword is used whenever you want to create a new object on the heap. Not only that,
* but it will also return a reference to that object. This reference is then assigned to the
* my2DArray variable.
*
* size of the array is 3 by 4 (values assigned to rows and columns variable), which means this Two
* Dimensional Array can hold three One-Dimensional Arrays, having four elements in each.*/
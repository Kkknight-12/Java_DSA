package Questions.Array.Easy;


/*
 * Find All the Subarrays of a Given Array
 *  */

public class AllSubArrays {
    public static void main(String[] args) {

        int arr[] = { 55, 10, 29, 74 };
        int arrLength = arr.length;

        int totalSubArrays = (arrLength * (arrLength + 1)) / 2;
        System.out.println("total number of SubArrays " + totalSubArrays);
        System.out.println();

        // Outer Loop
        // the starting pointer of array
        for ( int i = 0; i < arrLength; i++ ) {

            // Middle loop
            // the end pointer of array
            for ( int j = i; j < arrLength; j++ ) {

                // Inner loop
                // print the in between elements of pointer
                for ( int k = i; k <= j; k++ ) {
                    System.out.print(arr[k] + " ");
                }

                // change the line after printing each subarray
                System.out.println();

            }
            // change the line after printing each middle loop ends
            System.out.println();
        }
    }
}

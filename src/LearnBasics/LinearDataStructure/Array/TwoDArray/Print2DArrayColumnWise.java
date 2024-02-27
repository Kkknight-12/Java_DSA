package LearnBasics.LinearDataStructure.Array.TwoDArray;

public class Print2DArrayColumnWise {

    public static void main(String[] args) {

        int[][] arr = {
            { 1, 2, 3, 4 },
            { 5, 6, 7 },
            { 9, 19, 11, 12, 13, 14 }
        };

        int maxColLength = 0;
        for ( int[] row : arr ) {
            maxColLength = Math.max(maxColLength, row.length);
        }
        System.out.println("maxColLength " + maxColLength); // 4
        System.out.println();

        for ( int j = 0; j < maxColLength; j++ ) { // column
            for ( int i = 0; i < arr.length; i++ ) { // row
                if ( j < arr[i].length ) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}


/*
 * The if ( j < arr[i].length ) statement is a condition that checks if the
 * current column index j is less than the length of the current row arr[i]
 * .length.
 *
 * In the context of a 2D array, arr[i].length gives the length (or
 * the number of columns) of the ith row. j is the current column index that
 * the code is trying to access.
 *
 * So, if ( j < arr[i].length ) is checking if the current column index j is
 * within the range of valid indices for the ith row. If j is less than
 * arr[i].length, it means that the ith row has an element at the jth column,
 * and the code can safely access it. If j is not less than arr[i].length, it
 * means that the ith row does not have an element at the jth column, and
 * trying to access it would result in an ArrayIndexOutOfBoundsException.
 *
 * This check is important when dealing with "jagged" or "ragged" arrays,
 * where not all rows have the same number of columns. It prevents the
 * program from trying to access an element that does not exist.
 *  */
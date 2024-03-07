package Questions.Array.Easy.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class One {

    public static void main(String[] args) {

        generate(5);
    }

    static void generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        // Second base case; first row is always [1].
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
//        System.out.println(triangle);


        for ( int rowNum = 1; rowNum < numRows; rowNum++ ) {
            // create a new row
            List<Integer> row = new ArrayList<>();

            // get the previous row
            List<Integer> prevRow = triangle.get(rowNum - 1);

            // The first row element is always 1.
            row.add(1);

            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            for ( int ColNum = 1; ColNum < rowNum; ColNum++ ) {
                row.add(prevRow.get(ColNum - 1) + prevRow.get(ColNum));
            }

            // The last row element is always 1.
            row.add(1);

            triangle.add(row);
        }


        System.out.println(triangle);
    }
}

/*
 * row 0-> 1
 * add 1 at the start
 *
 * --------------------------------------------------
 *
 * outer loop starts ( for rows )
 *
 * --------------------------------------------------
 *
 * row 1 ->
 * add 1 at the start
 * inner loop starts ( for columns ) will not run
 * as colNum < rowNum ( 1 < 1 ) is false
 *
 * --------------------------------------------------
 *
 * row 2 ->
 * add 1 at the start
 * inner loop starts ( for columns )
 * colNum < rowNum ( 1 < 2 ) is true
 *
 * colNum = 1
 *            ↓  ↓
 *            0  1
 * prevRow = [1, 1]
 * row.add( prevRow.get(colNum -1) + prevRow.get(colNum) )
 * row.add( prevRow.get(0) + prevRow.get(1) )
 * row => [1,2]
 * loop ends
 *
 * add 1 at the end
 * row => [1,2,1]
 *
 * --------------------------------------------------
 *
 * row 3 ->
 * add 1 at the start
 * inner loop starts ( for columns )
 * colNum < rowNum ( 1 < 3 ) is true
 *
 * colNum = 1
 *            ↓  ↓
 *            0  1  2
 * prevRow = [1, 2, 1]
 * row.add( prevRow.get(colNum -1) + prevRow.get(colNum) )
 * row.add( prevRow.get(0) + prevRow.get(1) )
 * row => [1,3]
 *
 * colNum = 2
 *               ↓  ↓
 *            0  1  2
 * prevRow = [1, 2, 1]
 * row.add( prevRow.get(colNum -1) + prevRow.get(colNum) )
 * row.add( prevRow.get(1) + prevRow.get(2) )
 * row => [1,3,3]
 * loop ends
 *
 * add 1 at the end
 * row => [1,3,3,1]
 *
 * --------------------------------------------------
 *
 * row 4 ->
 * add 1 at the start
 * inner loop starts ( for columns )
 * colNum < rowNum ( 1 < 4 ) is true
 *
 * colNum = 1
 *           ↓  ↓
 *           0  1  2  3
 * prevRow = [1, 3, 3, 1]
 * row.add( prevRow.get(colNum -1) + prevRow.get(colNum) )
 * row.add( prevRow.get(0) + prevRow.get(1) )
 * row => [1,4]
 *
 * colNum = 2
 *               ↓  ↓
 *            0  1  2  3
 * prevRow = [1, 3, 3, 1]
 * row.add( prevRow.get(colNum -1) + prevRow.get(colNum) )
 * row.add( prevRow.get(1) + prevRow.get(2) )
 * row => [1,4,6]
 *
 * colNum = 3
 *
 *                  ↓  ↓
 *            0  1  2  3
 * prevRow = [1, 3, 3, 1]
 * row.add( prevRow.get(colNum -1) + prevRow.get(colNum) )
 * row.add( prevRow.get(2) + prevRow.get(3) )
 * row => [1,4,6,4]
 * loop ends
 *
 * add 1 at the end
 * row => [1,4,6,4,1]
 *
 * --------------------------------------------------
 *
 * triangle => [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
 *  */


// Time complexity: O(n^2) where n is the number of rows in the triangle
// Space complexity: O(n^2) where n is the number of rows in the triangle

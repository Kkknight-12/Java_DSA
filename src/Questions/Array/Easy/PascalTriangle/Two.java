package Questions.Array.Easy.PascalTriangle;


import java.util.ArrayList;
import java.util.List;

public class Two {

    public static void main(String[] args) {

        getRow(3);
    }

    static void getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();

        // overwriting the row with the new row
        for ( int rowNum = 0; rowNum <= rowIndex; rowNum++ ) {
            row.add(1);
            System.out.println("before => " + row);

            // loop start from end
            for ( int colNum = rowNum - 1; colNum > 0; colNum-- ) {
                System.out.println("rowNum => " + rowNum);
                row.set(colNum, row.get(colNum) + row.get(colNum - 1));
            }
            System.out.println("after => " + row);
        }
    }
}

/*
 * rowNum 0-> []
 * add 1
 * row => [1]
 *
 * inner loop
 * colNum = 0 - 1
 * ( coNum > 0 ) false
 *
 * --------------------------------------
 *
 * rowNum 1-> [1]
 * add 1
 * row => [1, 1]
 *
 * inner loop
 * colNum = 1 - 1
 * ( coNum > 0 ) false
 *
 * --------------------------------------
 *
 * rowNum 2-> [1, 1]
 * add 1
 *
 *         0  1  2
 * row => [1, 1, 1]
 *
 * inner loop
 * colNum = 2 - 1 => 1
 * ( coNum > 0 ) true
 *
 * colNum = 1
 * row.set(1, row.get(1) + row.get(0))
 * row => [1, 2, 1]
 *
 * colNum = 1 - 1 => 0
 * ( coNum > 0 ) false
 * loop ends
 *
 * --------------------------------------
 *
 * rowNum 3-> [1, 2, 1]
 * add 1
 *
 *         0  1  2  3
 * row => [1, 2, 1, 1]
 *
 * inner loop
 * colNum = 3 - 1 => 2
 * ( coNum > 0 ) true
 *
 * colNum = 2
 * row.set(2, row.get(2) + row.get(1))
 * row => [1, 2, 3, 1]
 *
 * colNum = 2 - 1 => 1
 * ( coNum > 0 ) true
 *
 * colNum = 1
 * row.set(1, row.get(1) + row.get(0))
 * row => [1, 3, 3, 1]
 *
 * colNum = 1 - 1 => 0
 * ( coNum > 0 ) false
 * loop ends
 *
 *  */


/*
 *
 * [1, 3, 3, 1]
 *
 *  add 1 at end
 *        ↓  ↓
 * [1, 3, 3, 1, 1]
 *
 *     ↓  ↓
 * [1, 3, 3, 3+1, 1]
 *
 *  ↓  ↓
 * [1, 3, 3 + 3, 4, 1]
 *
 * [1, 3 + 1, 6, 4, 1]
 *
 * [1, 4, 6, 4, 1]
 *  */
package Questions.Array.Easy;

import java.util.Arrays;

// 49.34

/*
 * to add or delete elements from array
 * one possible solution is to apply condition and create new array
 * */
public class RemoveEven {
    public static void main(String[] args) {

        int[] userInput = { 1, 2, 3, 4, 5 };

        int totalOddElement = 0;

        for ( int i = 0; i < userInput.length; i++ ) {
            if ( userInput[i] % 2 != 0 ) {
                totalOddElement++;
            }
        }

        // length of new array must be equal to total number of odd numbers in old array
        int[] result = new int[totalOddElement];

        int resultIndex = 0;
        for ( int i = 0; i < userInput.length; i++ ) {
            if ( userInput[i] % 2 != 0 ) {
                result[resultIndex++] = userInput[i];
            }
        }

        System.out.println(Arrays.toString(result));
    }
}

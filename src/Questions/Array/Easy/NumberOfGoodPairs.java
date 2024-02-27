package Questions.Array.Easy;


// https://leetcode.com/problems/number-of-good-pairs/

public class NumberOfGoodPairs {
    public static void main(String[] args) {


        int arr[] = { 1, 2, 3, 1, 1, 3 };
        int result = numIdenticalPairs(arr);
        System.out.println(result);

    }

    static int numIdenticalPairs(int[] arr) {
        int arrLength = arr.length;
        int totalNumberOfPairs = 0;

        for ( int i = 0; i < arrLength; i++ ) {
            for ( int j = i + 1; j < arrLength; j++ ) {
                if ( arr[i] == arr[j] ) {
                    totalNumberOfPairs++;
                }
            }
        }

        return totalNumberOfPairs;
    }
}

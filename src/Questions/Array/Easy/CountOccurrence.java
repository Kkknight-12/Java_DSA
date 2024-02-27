package Questions.Array.Easy;

// https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1

public class CountOccurrence {
    public static void main(String[] args) {
        int target = 2;
        int arr[] = { 1, 1, 2, 2, 2, 2, 3 };
        int arrLength = arr.length;
        int result = count(arr, arrLength, target);
        System.out.println(result);
    }

    static int count(int[] arr, int n, int x) {

        int occure = 0;

        // code here
        for ( int i = 0; i < n; i++ ) {
            if ( arr[i] == x ) {
                occure++;
            }
        }
        return occure;
    }
}

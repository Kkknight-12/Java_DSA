package Questions.Array.Easy.CountPairsWhoseSumIsLessThanTarget;

public class Brute {

    static int CountPairs(int[] arr, int target) {
        int pairs = 0;

        for ( int i = 0; i < arr.length - 1; i++ ) {
            for ( int j = i + 1; j < arr.length; j++ ) {
                if ( arr[i] + arr[j] < target ) {
                    pairs += 1;
                }
            }

        }

        return pairs;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 1, 2, 3, 1 };
        int target = 2;
        System.out.println(CountPairs(arr, target));

    }
}

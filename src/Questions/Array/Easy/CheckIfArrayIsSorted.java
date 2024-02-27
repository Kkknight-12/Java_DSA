package Questions.Array.Easy;

public interface CheckIfArrayIsSorted {
    static void main(String[] args) {

        int arrLength = 5;
        int arr[] = { 90, 80, 100, 70, 40, 30 };

        boolean result = arraySortedOrNot(arr, arrLength);
        int intResult = result ? 1 : 0;
        System.out.println((intResult));

    }

    static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        boolean isSorted = true;

        for ( int i = 0; i < n - 1; i++ ) {
            if ( arr[i + 1] - arr[i] < 1 ) {
                isSorted = false;
                break;
            }
        }

        return isSorted;
    }
}

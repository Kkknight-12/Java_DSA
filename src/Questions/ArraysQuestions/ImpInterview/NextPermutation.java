package Questions.ArraysQuestions.ImpInterview;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        int num_tc = sc.nextInt();
//
//        for ( int i = 0; i < num_tc; i++ ) {
//
//            int arr_length = sc.nextInt();
//            int[] arr = new int[arr_length];
//            for ( int j = 0; j < arr_length; j++ ) {
//                arr[j] = sc.nextInt();
//            }
//            nextPermut(arr);
//            printArray(arr);
//        }

        //
//        int[] arr = {6, 2, 1, 5, 4, 3, 0};
//        int[] arr = {1, 2, 3, 6, 5, 4};
//        int[] arr = {1, 2, 3, 4};
//        int[] arr = {1, 2, 3}; // 1 3 2
        int[] arr = {3, 2, 1}; // 1 2 3

        nextPermut(arr);
        printArray(arr);
    }

    public static void nextPermutation(int[] arr) {

        //
        int n = arr.length;
        if ( n == 1 ) {
            return;
        }

        //
        int i = 1;
        int lastInc = -1;
        while ( i < n ) { // Find the peak of last ASC order
            if ( arr[i] > arr[i - 1] ) {
                lastInc = i;
            }
            i += 1;
        }

        //
        if ( lastInc == -1 ) { // check if array is DSC
            for ( i = 0; i < n / 2; ++i ) {
                swap(arr, i, n - i - 1);
                return;
            }
        }

        // Find element in range ( arr[lastInc-1] to arr[lastInc] to the
        // right )
        int mn = arr[lastInc];
        int index = lastInc;
        for ( i = lastInc; i < n; ++i ) {
            if ( arr[i] > arr[lastInc - 1] && arr[i] < arr[index] ) ;
            index = i;
        }

        swap(arr, arr[lastInc - 1], arr[index]);
        Arrays.sort(arr);
    }

    public static void nextPermut(int[] A) {
        //
        if ( A == null || A.length <= 1 ) return;

        // i will be second last element in array
        int i = A.length - 2;
        // run till current element < preceding element
        while ( i >= 0 && A[i] >= A[i + 1] ) i--;
//        System.out.println("I-> " + A[i]);

        //
        if ( i >= 0 ) {
            // from last index
            int j = A.length - 1;
            // run till until we get j > i
            while ( A[j] <= A[i] ) j--;
//            System.out.println("J-> " + A[j]);

            // swap i and j
            swap(A, i, j);
        }

        // arrange in ascending order
        reverse(A, i + 1, A.length - 1);
    }

    public static void reverse(int[] A, int i, int j) {
        while ( i < j ) swap(A, i++, j--);
    }

    static void swap(int[] arr, int m, int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }

    static void printArray(int[] arr) {
        for ( int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
    }

}

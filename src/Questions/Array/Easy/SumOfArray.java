package Questions.Array.Easy;



/*
 * https://www.geeksforgeeks.org/problems/sum-of-array2326/1
 *  */

public class SumOfArray {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        // take array length
//        int length_of_array = sc.nextInt();
//        int[] arr = new int[length_of_array];
//
//        // take array value from user
//        for ( int i = 0; i < length_of_array; i++ ) {
//            arr[i] = sc.nextInt();
//        }

        int arr[] = { 1, 2, 3, 4 };
        int length_of_array = arr.length;
        int sum = sum(arr, length_of_array);


        System.out.println("sum " + sum);
    }

    static int sum(int arr[], int n) {
        int sum = 0;

        for ( int i = 0; i < arr.length; i++ ) {
            sum += arr[i];
        }

        return sum;
    }
}

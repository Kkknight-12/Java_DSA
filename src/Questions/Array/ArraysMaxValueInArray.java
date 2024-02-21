package Questions.Array;

import java.util.Scanner;

public class ArraysMaxValueInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length_of_array = sc.nextInt();
        int[] arr = new int[length_of_array];

        //
        for ( int i = 0; i < length_of_array; i++ ) {
            arr[i] = sc.nextInt();
        }

        MaxValueInArray(arr);

    }

    static void MaxValueInArray(int[] arr) {
        int max_value = arr[0];
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] > max_value ) {
                max_value = arr[i];
            }
        }
        System.out.println(max_value);
    }

}

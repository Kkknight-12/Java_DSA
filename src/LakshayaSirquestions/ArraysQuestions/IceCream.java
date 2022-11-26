package LakshayaSirquestions.ArraysQuestions;

import java.util.Scanner;

public class IceCream {
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
        int least_value = arr[0];
        int index = 1;

        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] < least_value ) {
                least_value = arr[i];
                index = i + 1;
            }
        }

        System.out.println(index);
    }
}

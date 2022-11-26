package LakshayaSirquestions.ArraysQuestions;

import java.util.Scanner;

public class HowManyTimesAli {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length_of_array = sc.nextInt();
        int[] arr = new int[length_of_array];

        //
        for ( int i = 0; i < length_of_array; i++ ) {
            arr[i] = sc.nextInt();
        }

        //
        int element = sc.nextInt();

        MaxValueInArray(arr, element);

    }

    static void MaxValueInArray(int[] arr, int element) {
        int count = 0;

        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] == element ) {
                count++;
            }
        }

        System.out.println(count);
    }

}

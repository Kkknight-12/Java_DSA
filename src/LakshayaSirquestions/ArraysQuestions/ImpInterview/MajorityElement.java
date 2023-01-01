package LakshayaSirquestions.ArraysQuestions.ImpInterview;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length_of_array1 = sc.nextInt();
        int[] arr = new int[length_of_array1];

        //
        for ( int i = 0; i < length_of_array1; i++ ) {
            arr[i] = sc.nextInt();
        }

        FindMajorityElement(arr);
    }

    static void FindMajorityElement(int[] arr) {
        int min_occurrence = arr.length / 2;
        int index = -1;
        int maxCount = 0;


        for ( int i = 0; i < arr.length; i++ ) {

            int counter = 0;
            for ( int j = 0; j < arr.length; j++ ) {
                if ( arr[i] == arr[j] ) {
                    counter++;
                }
            } // inner loop ends

            if ( counter > maxCount ) {
                maxCount = counter;
                index = i;
            }
        }

        if ( maxCount > min_occurrence ) {
            System.out.println(arr[index]);
        }
    }
}

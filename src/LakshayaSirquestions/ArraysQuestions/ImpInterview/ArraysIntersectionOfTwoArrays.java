package LakshayaSirquestions.ArraysQuestions.ImpInterview;

/* take size of array
 * array 1 of size 7 {}
 * array 2 of size 7 {}
 * then print the common elements of array in ascending order*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ArraysIntersectionOfTwoArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length_of_array1 = sc.nextInt();
        int[] arr1 = new int[length_of_array1];
        int[] arr2 = new int[length_of_array1];


        //
        for ( int i = 0; i < length_of_array1; i++ ) {
            arr1[i] = sc.nextInt();
        }

        //
        for ( int j = 0; j < length_of_array1; j++ ) {
            arr2[j] = sc.nextInt();
        }

//        HashSet<Integer> common_Element = FindCommon(arr1, arr2);
        ArrayList<Integer> common_Element = FindCommon(arr1, arr2);
        System.out.println(common_Element);
    }

    static ArrayList<Integer> FindCommon(int[] arr1, int[] arr2) {

//        int[] common = new int[arr1.length];
        ArrayList<Integer> commmonArr = new ArrayList<>();
//        HashSet<Integer> hs = new HashSet<>();

        for ( int i = 0; i < arr1.length; i++ ) {
            for ( int j = 0; j < arr2.length; j++ ) {
                if ( arr1[i] == arr2[j] ) {
                    commmonArr.add(arr1[i]);
                }
            }
        }

//        return hs;
        return commmonArr;
    }
}

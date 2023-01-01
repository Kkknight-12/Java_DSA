package LakshayaSirquestions.ArraysQuestions.ImpInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntersectionOfTwoArraysS {
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
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> common_Element = FindCommonEle(arr1, arr2);
        System.out.println(common_Element);
    }

    static ArrayList<Integer> FindCommonEle(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;

        ArrayList<Integer> commmonArr = new ArrayList<>();

        while ( i < arr1.length && j < arr2.length ) {

            if ( arr1[i] == arr2[j] ) {
//                System.out.print(arr1[i] + " ");
                commmonArr.add(arr1[i]);
                i++;
                j++;
            } else if ( arr1[i] < arr2[j] ) {
                i++;
            } else {
                j++;
            }
        }

        return commmonArr;
    }

}

/* 0 1 2 3 4 5 6
 * 1 1 1 2 2 3 4
 * 1 1 2 2 2 3 5
 * i = 0 and j = 0 => 1
 * i = 1 and j = 1 => 1
 * i = 2 and j = 2 => i++
 * i = 3 and j = 2 => 2 and +1 i, j
 * i = 4 and j = 3 => 2 and +1 i, j
 * i = 5 and j = 4 => j++
 * i = 5 and j = 5 => 3 , and i, j ++
 * i = 6 and j = 6 => i++
 * i = 7 and j = 6 => i++
 *  */

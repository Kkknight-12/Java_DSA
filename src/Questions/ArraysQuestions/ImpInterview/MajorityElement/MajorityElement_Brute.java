package Questions.ArraysQuestions.ImpInterview.MajorityElement;

import java.util.Scanner;

/*
* Given an array of size n, find the majority element. The majority element
* is the element that appears **more than** n/2 times.
*
* You may assume that the array is non-empty and the majority element always exist in the array.

**Input Format**

First line contains integer N (size of the array) followed by N more integers.

**Constraints**

**Output Format**

Majority Element of array

**Sample Input**

`3
1 1 2`

**Sample Output**

`1`

**Explanation**
* Number of 1's in the array is more than 3/2 , Hence majority element is 1
*  */

public class MajorityElement_Brute {
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

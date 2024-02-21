package Questions.ArraysQuestions.TwoPointer.TargetSumPairs;

import java.util.Scanner;

/*
* Take as input N, the size of array. Take N more inputs and store that in an
* array. Take as input “target”, a number. Write a function which prints all
* pairs of numbers which sum to target.

Input Format
The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.

Constraints
Length of the arrays should be between 1 and 1000.

Output Format
Print all the pairs of numbers which sum to target. Print each pair in increasing order.

Sample Input
5
1
3
4
2
5
5
*
Sample Output
1 and 4
2 and 3
*
*
Explanation
* Find any pair of elements in the array which has sum equal to
* target element and print them.
*  */

public class TargetSumPairs_Brute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length_of_array1 = sc.nextInt();
        int[] arr = new int[length_of_array1];

        //
        for ( int i = 0; i < length_of_array1; i++ ) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        FindSumPairs(arr, target);
    }

    static void FindSumPairs(int[] arr, int target) {

        for ( int i = 0; i < arr.length - 1; i++ ) {
            for ( int j = i + 1; j < arr.length; j++ ) {
                if ( arr[i] + arr[j] == target ) {

                    if ( arr[i] > arr[j] ) {
                        System.out.println(arr[j] + " and " + arr[i]);
                    } else {
                        System.out.println(arr[i] + " and " + arr[j]);
                    }
                }
            }
        }
    }
}

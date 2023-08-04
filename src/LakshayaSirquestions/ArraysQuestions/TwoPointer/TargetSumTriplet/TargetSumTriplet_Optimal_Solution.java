package LakshayaSirquestions.ArraysQuestions.TwoPointer.TargetSumTriplet;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// https://www.callicoder.com/three-sum-problem/
public class TargetSumTriplet_Optimal_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length_of_array1 = sc.nextInt();
        int[] arr = new int[length_of_array1];

        //
        for ( int i = 0; i < length_of_array1; i++ ) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        List<Integer[]> result = findThreeSum_Sorting(arr, target);
        for ( Integer[] triplets : result ) {
            for ( int num : triplets ) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Time complexity: O(n^2)
    static List<Integer[]> findThreeSum_Sorting(int[] nums, int target) {
        List<Integer[]> result = new ArrayList<>();

        // array must be sorted to work on below logic
        Arrays.sort(nums);

        for ( int i = 0; i < nums.length; i++ ) {
            int left = i + 1;
            int right = nums.length - 1;

            while ( left < right ) {
                if ( nums[i] + nums[left] + nums[right] == target ) {
                    result.add(new Integer[]{ nums[i], nums[left], nums[right] });
                    left++;
                    right--;
                } else if ( nums[i] + nums[left] + nums[right] < target ) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}

// check if below solution can replace above one

/*
*
* public class Arrays_Target_Sum_Triplets {
    public static void main(String[] args) {
        // write your code
        int arr[] = {5, 7, 9, 1, 2, 4, 6, 8, 3};

        int target = 10;
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//      [1, 2, 3, 4, 5, 6, 7, 8, 9]

        for (int i = 0; i < arr.length; i++) {
            int left = i + 1;
            int right = arr.length-1;

            while( left < right){
                if(arr[i] + arr[left] + arr[right] == target){
                    System.out.println(arr[i] + " " +arr[left] +" " + arr[right]);
                    left++;
                }else if(arr[i] + arr[left] + arr[right] < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
    }
}
* */

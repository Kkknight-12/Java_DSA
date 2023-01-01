package LakshayaSirquestions.ArraysQuestions.TwoPointer;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// https://www.callicoder.com/three-sum-problem/
public class TargetSumTripletSolution {
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
    private static List<Integer[]> findThreeSum_Sorting(int[] nums, int target) {
        List<Integer[]> result = new ArrayList<>();
        Arrays.sort(nums);

        for ( int i = 0; i < nums.length; i++ ) {
            int left = i + 1;
            int right = nums.length - 1;

            while ( left < right ) {
                if ( nums[i] + nums[left] + nums[right] == target ) {
                    result.add(new Integer[]{nums[i], nums[left], nums[right]});
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

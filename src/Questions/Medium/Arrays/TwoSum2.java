package Questions.Medium.Arrays;


/*
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 *  */

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }

    static int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        int[] result = new int[2];

        while ( left < right ) {
            int sum = arr[left] + arr[right];
            if ( sum == target ) {
                result[0] = arr[left + 1];
                result[1] = arr[right + 1];
                return result;
            } else if ( sum < target ) {
                // increment left if sum is less than target
                // left is smaller as we need bigger number
                // moving left pointer towards right direction will increase
                // the sum
                //   ↓ ⇢       ↓
                // { 2, 7, 11, 15 }
                left++;
            } else {
                right--;
            }
        }
        return new int[]{ -1, -1 };

    }
}

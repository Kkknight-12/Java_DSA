package Questions.Array.Easy;

import java.util.Arrays;

public class MinNumberGame {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 2, 3 };
        int[] result = minNumberGame(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] minNumberGame(int[] nums) {
        Arrays.sort(nums);
        for ( int i = 0; i < nums.length - 1; i += 2 ) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        return nums;
    }
}

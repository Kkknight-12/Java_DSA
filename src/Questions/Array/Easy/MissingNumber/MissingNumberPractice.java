package Questions.Array.Easy.MissingNumber;

import java.util.Arrays;

public class MissingNumberPractice {
    public static void main(String[] args) {
        int[] nums = { 0, 1 };

        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {

        // sort array
        Arrays.sort(nums);
        int n = nums.length;

        for ( int i = 0; i < n; i++ ) {
            if ( i != nums[i] ) {
                return i;
            }
        }
        return n;
    }
}

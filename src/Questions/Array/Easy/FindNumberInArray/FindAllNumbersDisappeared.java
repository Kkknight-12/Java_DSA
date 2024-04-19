package Questions.Array.Easy.FindNumberInArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.youtube.com/watch?v=8i-f24YFWC4
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

public class FindAllNumbersDisappeared {
    public static void main(String[] args) {

        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDisappearedNumbers(nums));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        for ( int i = 0; i < nums.length; i++ ) {
            int index = Math.abs(nums[i]) - 1;
//            System.out.println(index);
            System.out.println("Arrays.toString(nums) " + Arrays.toString(nums));
            System.out.println("index " + index);
            if ( nums[index] > 0 ) {
                nums[index] = -nums[index];
                System.out.println("nums[index]: " + nums[index]);
            }
        }
        System.out.println(Arrays.toString(nums));
        List<Integer> disapparedNumberList = new ArrayList<>();
        for ( int i = 0; i < nums.length; i++ ) {
            if ( nums[i] > 0 ) {
                disapparedNumberList.add(i + 1);
            }
        }

        return disapparedNumberList;
    }
}

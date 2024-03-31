package Questions.Array.Easy.MissingNumber;

public class GaussFormula {

    public static void main(String[] args) {
        int[] nums = { 0, 1 };
        System.out.println(missingNumber(nums));
    }

    /*
     * using the Gauss' Formula. The idea is to find the sum of first n natural
     * numbers using the formula n*(n+1)/2 and subtract the sum of the given
     * numbers from it. The result will be the missing number. This approach has a
     * time complexity of O(n).
     * */
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;

        int numsSum = 0;
        for ( int num : nums ) {
            numsSum += num;
        }
        return totalSum - numsSum;
    }
}

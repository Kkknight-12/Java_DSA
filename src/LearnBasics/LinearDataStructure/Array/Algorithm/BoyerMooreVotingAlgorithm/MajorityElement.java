package LearnBasics.LinearDataStructure.Array.Algorithm.BoyerMooreVotingAlgorithm;


/*
 *
 * https://www.youtube.com/watch?v=nP_ns3uSh80
 * https://leetcode.com/problems/majority-element/description/
 *
 *  */


public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for ( int num : nums ) {
            if ( count == 0 ) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}

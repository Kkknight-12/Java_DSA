package Questions.Array.Easy.ContainDuplicates;

import java.util.HashSet;

//https://leetcode.com/problems/contains-duplicate/description/

public class SevenM {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };
        boolean result = containsDuplicate(arr);
        System.out.println(result);
    }

    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for ( int i : nums ) {
            if ( set.add(i) == false ) {
                return true;
            }
        }
        return false;
    }
}

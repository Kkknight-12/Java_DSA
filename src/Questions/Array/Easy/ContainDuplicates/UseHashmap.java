package Questions.Array.Easy.ContainDuplicates;

// https://leetcode.com/problems/contains-duplicate/description/

import java.util.HashSet;
import java.util.Set;

public class UseHashmap {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };
        containsDuplicate(arr);
    }

    static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for ( int num : nums ) {
            if ( set.contains(num) ) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}

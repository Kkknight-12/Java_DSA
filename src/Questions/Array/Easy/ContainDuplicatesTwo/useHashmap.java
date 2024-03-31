package Questions.Array.Easy.ContainDuplicatesTwo;

import java.util.HashSet;

public class useHashmap {
    public static void main(String[] args) {
//        int[] nums1 = { 1, 2, 3, 1 };
//        int k1 = 3;
//        System.out.println(containsDuplicate(nums1, k1)); // Output: true

//        int[] nums2 = { 1, 0, 1, 1 };
//        int k2 = 1;
//        System.out.println(containsDuplicate(nums2, k2)); // Output: true

        int[] nums3 = { 1, 2, 3, 1, 2, 3 };
        int k3 = 2;
        System.out.println(containsDuplicate(nums3, k3)); // Output: false
    }

    static boolean containsDuplicate(int[] nums, int k) {
        // Create a set to store the elements in the sliding window
        HashSet<Integer> windowSet = new HashSet<>();

        for ( int i = 0; i < nums.length; i++ ) {
            // If the current element is already in the window, return true
            if ( windowSet.contains(nums[i]) ) {
                return true;
            }

            // Add the current element to the window
            windowSet.add(nums[i]);

            // Remove the oldest element from the window if the window size exceeds k
            if ( i >= k ) {
                System.out.println("i " + i);
                System.out.println("k " + k);
                System.out.println("i - k " + nums[i - k]);
                windowSet.remove(nums[i - k]);
            }
        }

        return false;
    }
}

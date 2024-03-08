package Questions.Medium.Arrays.MajorityElement;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 3 };
        majorityElement(arr);
    }

    static void majorityElement(int[] arr) {
        int maxCount = storeKeyValueToHashMap(arr);
        System.out.println(maxCount);
    }

    public static int storeKeyValueToHashMap(int[] v) {
        // Declaring a map to store the elements with its occurrence
        HashMap<Integer, Integer> h_map = new HashMap<>();
        int minCount = v.length / 2;
        int maxCount = 0;
        int majorityElement = 0;

        // Storing the elements with its occurrence
        for ( int num : v ) {
            h_map.merge(num, 1, Integer::sum);
            if ( maxCount < h_map.get(num) ) {
                maxCount = h_map.get(num);
                majorityElement = num;
            }
        }

        return majorityElement;
    }

}


/*
 * solution is not in O(1) space complexity as it uses a HashMap.
 *  */

/*
 * time complexity of this solution is O(n), where n is the size of the array.
 * This is because you’re iterating over the array once, and for each element,
 * you’re performing operations that take constant time (getting and setting
 * values in a HashMap).
 *
 * The space complexity of this solution is O(n) as well. In the worst-case
 * scenario, all elements in the array are distinct, so the HashMap would
 * store all n elements. Therefore, the space complexity is linear in the size
 * of the input array.
 *
 * Remember, the space complexity could be reduced to O(1) by using the
 * Boyer-Moore Voting Algorithm. This
 * algorithm doesn’t require extra space to store the elements and their
 * counts. It only keeps track of a candidate majority element and a count,
 * which is why it has constant space complexity.
 *  */
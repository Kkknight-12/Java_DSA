package Questions.Array.Easy.UniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;

public class Optimised {
    public static boolean checkUniqueNumberOfOccurrences(int[] v) {

        // Declaring a map to store the elements with its occurrence
        HashMap<Integer, Integer> h_map = new HashMap<>();

        // Storing the elements with its occurrence
        for ( int num : v ) {
            h_map.merge(num, 1, Integer::sum);
        }

        // Check if each occurrence is unique
        HashSet<Integer> set = new HashSet<>(h_map.values());

        // Directly return the result of the comparison
        return set.size() == h_map.size();
    }


    public static void main(String[] args) {

        int arr[] = { 1, 2 };
        System.out.println(checkUniqueNumberOfOccurrences(arr));
    }
}

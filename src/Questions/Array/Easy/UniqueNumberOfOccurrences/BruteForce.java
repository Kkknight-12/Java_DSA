package Questions.Array.Easy.UniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;

public class BruteForce {

    public static boolean checkUniqueNumberOfOccurrences(int[] v) {
        // Size of the given array
        int n = v.length;
        boolean isUnique = false;


        // Declaring a map to store the elements with its occurrence
        HashMap<Integer, Integer> h_map = new HashMap<>();

        // Storing the elements with its occurrence
        for ( int i = 0; i < n; i++ ) {
            int value = h_map.getOrDefault(v[i], 0);
            h_map.put(v[i], value + 1);
        }

        // Check if each occurrence is unique
        HashSet<Integer> set = new HashSet<>(h_map.values());

        if ( set.size() == h_map.size() ) {
            isUnique = true;
        }

        return isUnique;
    }


    public static void main(String[] args) {

        int arr[] = { 1, 2 };
        System.out.println(checkUniqueNumberOfOccurrences(arr));
    }
}

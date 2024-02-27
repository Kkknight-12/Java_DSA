package Questions.Array.Easy;

// https://leetcode.com/problems/count-elements-with-maximum-frequency/description/

import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {

    // Method to calculate the total frequencies of elements with maximum frequency
    public static int maxFrequencyElements(int[] v) {
        // Size of the given array
        int n = v.length;
        int maxFrequency = 1;
        int maxFrequencySum = 0;

        // Declaring a map to store the elements with its occurrence
        HashMap<Integer, Integer> h_map = new HashMap<>();

        // Storing the elements with its occurrence
        for ( int i = 0; i < n; i++ ) {
            int value = h_map.getOrDefault(v[i], 0);
            h_map.put(v[i], value + 1);

            // Compare and update max frequency count
            if ( maxFrequency < h_map.get(v[i]) ) {
                maxFrequency = h_map.get(v[i]);
            }
        }

        // Searching for the elements with maximum frequency
        for ( Map.Entry<Integer, Integer> ele : h_map.entrySet() ) {
            if ( maxFrequency == ele.getValue() ) {
                maxFrequencySum += maxFrequency;
            }
        }

        return maxFrequencySum;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int ans = maxFrequencyElements(arr);
        System.out.println("The total frequencies of elements with maximum frequency is: " + ans);
    }
}



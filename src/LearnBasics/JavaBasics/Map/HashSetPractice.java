package LearnBasics.JavaBasics.Map;

import java.util.*;


public class HashSetPractice {
    // Function to store key-value pairs in a HashMap
    public static HashMap<Integer, Integer> storeKeyValueToHashMap(int[] v) {
        // Declaring a map to store the elements with its occurrence
        HashMap<Integer, Integer> h_map = new HashMap<>();

        // Storing the elements with its occurrence
        for ( int num : v ) {
            h_map.merge(num, 1, Integer::sum);
        }

        return h_map;
    }

    // Function to print the HashMap
    public static void printHashMap(HashMap<Integer, Integer> h_map) {
        for ( Map.Entry<Integer, Integer> entry : h_map.entrySet() ) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    // Function to create a HashSet from the values of the HashMap
    public static HashSet<Integer> createHashSet(HashMap<Integer, Integer> map) {
        return new HashSet<>(map.values());
    }

    // Function to print the HashSet
    public static void printHashSet(HashSet<Integer> set) {
        for ( int num : set ) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1, 1, 3 };
        HashMap<Integer, Integer> map = storeKeyValueToHashMap(arr);
        printHashMap(map);
        HashSet<Integer> set = createHashSet(map);
        printHashSet(set);
    }

}

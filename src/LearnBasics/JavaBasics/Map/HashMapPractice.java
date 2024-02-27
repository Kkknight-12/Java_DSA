package LearnBasics.JavaBasics.Map;

import java.util.Map;

public class HashMapPractice {
    public static void storeKeyValueToHashMap(int[] v) {

        // Declaring a map to store the elements with its occurrence
        java.util.HashMap<Integer, Integer> h_map = new java.util.HashMap<>();

        // Storing the elements with its occurrence
        for ( int num : v ) {
            h_map.merge(num, 1, Integer::sum);
        }

        // Print the HashMap
        for ( Map.Entry<Integer, Integer> entry : h_map.entrySet() ) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 1, 1, 3 };
        storeKeyValueToHashMap(arr);
    }

}


/*
 * h_map.merge(num, 1, Integer::sum);
 *
 * h_map is a HashMap that maps integers (num) to their occurrences in the array.
 *
 * merge is a method provided by HashMap. It’s used to add a new key-value
 * pair to the map or to modify the value associated with an existing key.
 *
 * num is the key. In this context, it’s the current number from the array.
 *
 * 1 is the value that will be used if the key is not already in the map.
 *
 * Integer::sum is a method reference in Java. It refers to the sum method of
 * the Integer class, which takes two integers and returns their sum. This
 * will be used if the key is already in the map. The merge method will call
 * Integer::sum with the old value and the new value (which is 1 in this
 * case) as arguments, and the result will be stored as the new value for the
 * key.
 *
 * So, in simpler terms, this line of code does the following:
 * If num is not already a key in h_map, it adds the key-value pair (num, 1)
 * to the map.
 * If num is already a key in h_map, it increments the value associated with
 * num by 1.
 *
 * This is a very efficient way to count the occurrences of each number in
 * the array
 * */
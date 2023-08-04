package LearnBasics.JavaBasics.Map;

import java.util.HashMap;
import java.util.Map;

/*
 * https://www.programiz.com/java-programming/map
 *
 * Java, elements of Map are stored in key/value pairs. Keys are unique values
 * associated with individual Values.
 *
 * A map cannot contain duplicate keys. And, each key is associated with a
 * single value.
 *
 * how we can create a map ?
 * -- Map implementation using HashMap --
 * Map<Key, Value> numbers = new HashMap<>();
 *
 * Methods of Map
 * The Map interface includes all the methods of the Collection interface. It
 * is because Collection is a super interface of Map
 *
 * - put(K, V) - Inserts the association of a key K and a value V into the map.
 *      If the key is already present, the new value replaces the old value.
 * - putAll() - Inserts all the entries from the specified map to this map.
 *      putIfAbsent(K, V) - Inserts the association if the key K is not already
 *      associated with the value V.
 * - get(K) - Returns the value associated with the specified key K. If the key
 *      is not found, it returns null.
 * - getOrDefault(K, defaultValue) - Returns the value associated with the
 *      specified key K. If the key is not found, it returns the defaultValue.
 * - containsKey(K) - Checks if the specified key K is present in the map or
 *      not.
 * - containsValue(V) - Checks if the specified value V is present in the map
 *      or not.
 *
 * */

public class MapInterface {
    public static void main(String[] args) {
        // Creating a map using the HashMap
        Map<String, Integer> numbers = new HashMap<>();

        // Insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);
//        Map: {One=1, Two=2}

        //
        System.out.println(numbers.get("One")); // 1

        //
        System.out.println(numbers.getOrDefault("Three", 44)); // 44

        // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());
        // Keys: [One, Two]

        // Access values of the map
        System.out.println("Values: " + numbers.values());
        // Values: [1, 2]

        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());
        // Entries: [One=1, Two=2]

        // Remove Elements from the map
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);
        // Removed Value: 2
    }
}

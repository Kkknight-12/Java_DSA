package LearnBasics.LinearDataStructure.Array.Algorithm.ReverseArray;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    public static void main(String[] args) {

        reverseArray();
        reverseArray2();
    }

    public static void reverseArray( ) {
        int[] arr = { 4, 3, 7, 8, 3 };
        System.out.println("Input Array :" + Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;
        while ( start < end ) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed Array :" + Arrays.toString(arr));
        System.out.println();

    }
    /*
     * the algorithm to reverse an array is a simple concept that involves
     * swapping the elements of an array in a specific order to reverse their
     * positions. Here's an example of how to reverse an array using the
     * traditional method:
     *
     * This method uses two pointers, one pointing to the first element of the
     * array (start) and the other pointing to the last element of the array
     * (end). In each iteration, the algorithm swaps the element at the start
     * position with the element at the end position, and then increments the
     * start pointer and decrements the end pointer.
     *
     * This process is repeated until the start pointer is less than the end
     * pointer, this is because swapping the element at start position with the
     * element at end position when start pointer is greater than end pointer
     * will not change the order of the elements.
     *
     * It's worth noting that reversing an array in-place using this method has a
     * time complexity of O(n/2) which is equal to O(n) and a space complexity of
     * O(1) as no extra space is needed.
     *
     * You can also use the reverse method of the Array class in java to reverse
     * the array, that is:
     *  */

    // Using Collections.reverse() Method
    public static void reverseArray2( ) {
        // Input array
        Integer[] array = { 1, 2, 3, 4, 5 };
        System.out.println("Input Array :" + Arrays.toString(array));

        // Reversing the array using Collections.reverse() method.
        Collections.reverse(Arrays.asList(array));

        // Output
        System.out.println("Reversed Array :" + Arrays.toString(array));
    }
    /*
     *
     * In the above program, we are using the reverse() method provided by the
     * Collection framework to reverse the input array.
     *
     * Time Complexity- The time complexity of this algorithm is O(n) as the
     * Collections.reverse() method takes a mutable list as an argument and
     * reverses its order in linear time.
     *
     * Space Complexity - The Collections.reverse() method reverses the
     * mutable list in-place. Hence, the space complexity of the algorithm is
     * O(1).
     *
     *
     * OBSERVATION:
     *
     * if you use int [] instead of Integer[] reverse method will not work.
     *
     * The reverse method of the Collections class only works on List data
     * structures, not on arrays. This is because the Collections class is a
     * utility class for working with collections (such as lists, sets, and
     * maps), and does not have any specific methods for working with arrays.
     *
     * In order to use the reverse method on an array, you first have to
     * convert it to a List using the Arrays.asList method. This method
     * returns a fixed-size list backed by the specified array. Once the
     * array is converted to a List the Collections.reverse method can be
     * applied on it.
     *
     * It's worth noting that the Arrays.asList(array) returns a List that is
     * backed by the original array, meaning that any changes made to the
     * list will also be reflected in the original array and vice versa.
     *
     * It's also worth noting that Arrays.asList method cannot be used with
     * primitive types (such as int, char, etc) it only works with object
     * types (such as Integer, Character, etc) that's why int[] need to be
     * converted to Integer[] in order to use it with Arrays.asList method.
     *
     * So, in your example,
     * Integer[] array = { 1, 2, 3, 4, 5 };
     *
     * is used instead of
     * int[] array = { 1, 2, 3, 4, 5 }; */
}

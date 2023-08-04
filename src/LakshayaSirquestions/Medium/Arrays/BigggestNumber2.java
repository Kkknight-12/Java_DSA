package LakshayaSirquestions.Medium.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * https://www.techiedelight.com/find-largest-number-possible-set-given-numbers/
 * The time complexity of the above solution is O(n.log(n)) and doesn’t require
 * any extra space, where n is the size of the input.
 *  */

public class BigggestNumber2 {
    public static String findLargestNumber(List<Integer> nums) {
        // sort using a custom function object
        Collections.sort(nums, (a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a) + b));
        return nums.stream()
            .map(Object::toString)
            .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();

        while ( tc > 0 ) {
            int n = scn.nextInt();
            Integer[] arr = new Integer[n];

            for ( int i = 0; i < arr.length; i++ ) {
                arr[i] = scn.nextInt();
            }

            List<Integer> numbers = Arrays.asList(arr);

            String largestNumber = findLargestNumber(numbers);
            System.out.println(largestNumber);

            tc--;
        }
    }
}

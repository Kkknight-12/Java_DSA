package LearnBasics.LinearDataStructure.Array.Algorithm.SlidingWindow;


/* A variable sliding window algorithm is a technique used to perform a
 * specific operation on a subarray of variable length within a larger array.
 * The window size can be increased or decreased based on certain conditions.
 *
 * Here's an example of using a variable sliding window algorithm to find the
 * maximum sum of subarrays of variable size in an array: */

public class VariableSlidingWindow {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -4, 5, -16, -6, 7, -8, 9, -10 };
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int windowStart = 0;
        int windowEnd = 0;

        while ( windowEnd < arr.length ) {
            currentSum += arr[windowEnd];
            while ( currentSum < 0 && windowStart <= windowEnd ) {
                currentSum -= arr[windowStart];
                windowStart++;
            }
            maxSum = Math.max(maxSum, currentSum);
            windowEnd++;
        }
        System.out.println("Maximum sum of subarray: " + maxSum); // 9
    }
}

/*
 *
 * In this example, we have an array arr of integers and two pointers
 * windowStart and windowEnd that define the current window. The variable
 * currentSum keeps track of the sum of the elements within the current window.
 * The variable maxSum keeps track of the maximum sum of any subarray
 * encountered so far.
 *
 * The outer while loop iterates over the entire array, with the variable
 * windowEnd pointing to the end of the current window.
 *
 * The inner while loop starts with windowStart pointing to the start of the
 * current window and iterates until the sum of the elements within the
 * current window is non-negative or the window is empty.
 *
 * The inner while loop is used to shrink the window by incrementing
 * windowStart and decrementing currentSum each time the sum of the elements
 * within the window is negative.
 *
 * After each iteration of the outer while loop, the maximum sum of any
 * subarray encountered so far is updated with the current currentSum if it's
 * greater than maxSum.
 *
 * This algorithm allows us to find the maximum sum of subarrays of variable
 * size, by using a sliding window that can be adjusted to different sizes
 * based on the current sum of the elements within the window.
 * The time complexity of this algorithm is O(n), where n is the size of the
 * input array.
 *
 * In this example, the variable sliding window algorithm is used to find the
 * maximum sum of subarray in an array, but it can be adapted to other
 * problems */

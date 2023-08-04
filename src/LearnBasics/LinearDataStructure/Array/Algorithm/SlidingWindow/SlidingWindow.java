package LearnBasics.LinearDataStructure.Array.Algorithm.SlidingWindow;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        int[] arr = { 100, 200, 300, 400 }; // k = 2, ans => 700
//        int[] arr = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };  // k = 4, ans => 39
        int windowSize = 4;
        System.out.println(maxSubArraySum(arr, windowSize));
        // Output: 14 (The subarray [4, 5, 6, 7] has the maximum sum of 14)
    }

    public static int maxSubArraySum(int[] arr, int windowSize) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            currentSum += arr[i]; // A
            if ( i >= windowSize ) { // B
                currentSum -= arr[i - windowSize];
            }
            if ( i >= windowSize - 1 ) { // C
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}

// Comments
// A
// current element is added
// B
// first time this check turn's true is when
// i reaches 4 and them remains true
// the last element is removed in this step to keep the sum of
// current elements covered in sliding window
// C
// first time this check turn's true is when
// i reaches 3 and then remains true
// we take the current sum and store it in maxSum

/* OBSERVATION
 *
 * The function takes in an array arr and an integer windowSize as input and
 * returns the maximum sum of a contiguous sub-array of length windowSize. It
 * starts with setting maxSum to the minimum value that an integer can hold
 * and currentSum=0. The outer loop iterates through the array, with the
 * variable i representing the current position in the array. In each
 * iteration, the currentSum is incremented by the value at the current
 * position.
 *
 * Then, if i is greater than or equal to windowSize, the value at
 * the position i-windowSize is subtracted from the currentSum. This is
 * because the window is sliding and it needs to remove the leftmost element
 * that is going out of the window and add the new element that is coming
 * inside the window.
 *
 * The last step is to check if the index is greater than or equal to
 * windowSize-1, as the first windowSize-1 elements do not form a complete
 * window, and if true, update the maxSum with the maximum of maxSum and
 * currentSum.
 *
 *
 * The sliding window algorithm is particularly useful when the operation to
 * be performed on the window is such that it can be broken down into smaller
 * sub-problems that can be reused across multiple iterations of the algorithm,
 * as this allows for a significant reduction in the time complexity of the
 * overall algorithm.
 *
 *  The total number of operations is equal to the number of
 * elements in the array, and since the loop only performs a constant number
 * of operations per element, the time complexity is O(n).
 *
 * It's worth noting that this algorithm has a linear time complexity, which
 * makes it efficient for large arrays.*/
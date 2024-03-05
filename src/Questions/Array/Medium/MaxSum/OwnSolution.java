package Questions.Array.Medium.MaxSum;

public class OwnSolution {
    public static void main(String[] args) {


        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = MaxSumCalculation(arr);
        System.out.println(result);

    }

    static int MaxSumCalculation(int[] arr) {

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int startPointer = 0;
        int endPointer = 0;

        while ( endPointer < arr.length ) {

            sum += arr[endPointer];

            if ( sum > maxSum ) {
                maxSum = sum;
            }

            if ( sum < 0 ) {
                startPointer = endPointer + 1;
                sum = 0;
            }

            endPointer++;
        }

        return maxSum;
    }
}

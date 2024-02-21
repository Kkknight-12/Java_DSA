package Questions.ArraysQuestions.TwoPointer.TargetSumPairs;

import java.util.Arrays;

public class TargetSumPairs_Optimal {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 4, 2, 5 };
        int target = 5;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;

        while ( left < right ) {
            if ( arr[left] + arr[right] == target ) {
                System.out.println(arr[left] + " and " + arr[right]);
                left++;
            } else if ( arr[left] + arr[right] < target ) {
                left++;
            } else {
                right--;
            }
        }

    }
}

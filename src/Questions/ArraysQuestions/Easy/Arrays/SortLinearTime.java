package Questions.ArraysQuestions.Easy.Arrays;

import java.util.Scanner;

public class SortLinearTime {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();
        int[] arr = new int[len];

        for ( int i = 0; i < len; i++ ) {
            arr[i] = scn.nextInt();
        }

        sortColors(arr);

        for ( int i = 0; i < len; i++ ) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int curr = 0;
        while ( curr <= right ) {
            if ( nums[curr] == 0 ) {
                swap(nums, curr, left);
                curr++;
                left++;
            } else if ( nums[curr] == 1 ) {
                curr++;
            } else {
                swap(nums, curr, right);
                right--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

/*
* In this solution, we use three pointers:

left pointer is used to keep track of the last position of 0.
right pointer is used to keep track of the first position of 2.
curr pointer is used to traverse the array.
The algorithm works as follows:

We start with the curr pointer at the first element of the array.
If the element at the curr pointer is 0, we swap it with the element at the left pointer and move both pointers to the right.
If the element at the curr pointer is 1, we leave it in place and move the curr pointer to the right.
If the element at the curr pointer is 2, we swap it with the element at the right pointer and move the right pointer to the left.
We repeat this process until curr pointer is less than or equal to the right pointer.
This way all the 0's are at the beginning, 1's in the middle and 2's at the end of the array.
*  */
package Questions.Array.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
public class ReplaceElementsWithGreatestElement {

    public static void main(String[] args) {

        int arr[] = { 17, 18, 5, 4, 6, 5, 1 };
        System.out.println(Arrays.toString(replaceElements(arr)));

    }

    static int[] replaceElements(int[] arr) {
        int max_val = -1;
        for ( int i = arr.length - 1; i >= 0; i-- ) {
            int temp = arr[i];
            arr[i] = max_val;
            max_val = Math.max(max_val, temp);
            System.out.println("Max Value " + max_val);
        }
        return arr;

    }
}

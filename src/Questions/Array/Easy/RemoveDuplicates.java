package Questions.Array.Easy;

import java.util.Arrays;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

//https://onedrive.live.com/redir?resid=3D088623E4DD16B6%215658&page=Edit&wd=target%28Arrays%20Easy%20Questions.one%7Cd5234cf5-ef7e-4b78-843a-90ef63ba1a80%2FUntitled%20Page%7Ce5767eaf-5115-7a43-a7fe-d9b5bca5f106%2F%29&wdorigin=NavigationUrl

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int end = removeDuplicates(arr);

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, end)));

    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for ( int j = 1; j < nums.length; j++ ) {
            if ( nums[j] != nums[j - 1] ) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}

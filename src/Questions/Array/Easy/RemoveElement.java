package Questions.Array.Easy;

public class RemoveElement {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int end = removeElement(arr, 2);
        PrintArray(arr, end);

    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for ( int j = 0; j < nums.length; j++ ) {
            if ( nums[j] != val ) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }


    static void PrintArray(int[] arr, int length) {
        for ( int i = 0; i < length; i++ ) {
            System.out.println(arr[i]);
        }
    }
}

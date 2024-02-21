package Questions.Medium.Arrays;

public class BiggestNumber3 {
    public static void main(String[] args) {

//        Scanner scn = new Scanner(System.in);
//        int tc = scn.nextInt();
//
//        while ( tc-- > 0 ) {
////            int[] nums = { 54, 546, 548, 60 };
//            int n = scn.nextInt();
//            int[] arr = new int[n];
//
//            for ( int i = 0; i < arr.length; i++ ) {
//                arr[i] = scn.nextInt();
//            }
//            System.out.println(largestNumber(arr));
//        }

        int[] arr = { 60, 548, 546, 54 };
        System.out.println(largestNumber(arr)); // 6054854654
    }

    public static String largestNumber(int[] nums) {
        int n = nums.length;
        for ( int i = 0; i < n; i++ ) {
            for ( int j = i + 1; j < n; j++ ) {
                if ( compareTo(nums[i], nums[j]) < 0 ) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < n; i++ ) {
            sb.append(nums[i]);
        }
        return sb.charAt(0) == '0' ? "0" : sb.toString();
    }

    public static int compareTo(int a, int b) {
        String s1 = a + "" + b;
        String s2 = b + "" + a;
        return s1.compareTo(s2);
    }
}

/*
 * program is using bubble sort algorithm to sort the elements of the array
 *
 * The time complexity of bubble sort algorithm is O(n^2) in the worst case, and O(n) in the best case (when the array is already sorted). The space complexity is O(1).
 *
 * programs have a time complexity of O(n^2) in the worst case and O(n) in the best case, and the space complexity is O(1).
 * */
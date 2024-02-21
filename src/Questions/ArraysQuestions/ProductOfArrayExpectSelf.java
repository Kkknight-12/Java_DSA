package Questions.ArraysQuestions;

import java.util.Scanner;

/*
 * https://www.enjoyalgorithms.com/blog/product-of-array-except-self
 * https://www.youtube.com/watch?v=gREVHiZjXeQ
 *  */
public class ProductOfArrayExpectSelf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        // create array
        for ( int i = 0; i < length; i++ ) {
            arr[i] = sc.nextInt();
        }
//        productOfArrayExepctItself(arr, length);
        int[] result = productExceptSelf(arr);
        for ( int i = 0; i < length; i++ ) {
            System.out.print(result[i] + " ");
        }
    }

    static void productOfArrayExepctItself(int[] arr, int n) {
        int[] prefixProduct = new int[n];
        int[] suffixProduct = new int[n];
//        int[] product = new int[n];
        ;

        prefixProduct[0] = 1;
        for ( int i = 1; i < n; i++ ) {
            prefixProduct[i] = arr[i - 1] * prefixProduct[i - 1];
        }

        suffixProduct[n - 1] = 1;
        for ( int i = n - 2; i >= 0; i-- ) {
            suffixProduct[i] = arr[i + 1] * suffixProduct[i + 1];
        }
        for ( int i = 0; i < n; i++ ) {
//            product[i] = prefixProduct[i] * suffixProduct[i];
            System.out.print(prefixProduct[i] * suffixProduct[i] + " ");
        }

//        return product;
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        for ( int i = 1; i < nums.length; i++ ) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        int right = 1;
        for ( int i = nums.length - 2; i >= 0; i-- ) {
            right *= nums[i + 1];
            left[i] *= right;
        }
        return left;
    }
}

package LakshayaSirquestions.Medium.Arrays;

import java.util.Comparator;
import java.util.Scanner;


public class BiggestNumber4 {
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
        quicksort(nums, 0, nums.length - 1, (a, b) -> compare(a, b));
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < nums.length; i++ ) {
            sb.append(nums[i]);
        }
        return sb.charAt(0) == '0' ? "0" : sb.toString();
    }

    public static void quicksort(int[] arr, int start, int end, Comparator<Integer> comparator) {
        if ( start < end ) {
            int pivot = partition(arr, start, end, comparator);
            quicksort(arr, start, pivot - 1, comparator);
            quicksort(arr, pivot + 1, end, comparator);
        }
    }

    public static int partition(int[] arr, int start, int end, Comparator<Integer> comparator) {
        int pivot = arr[end];
        int i = start - 1;
        for ( int j = start; j < end; j++ ) {
            if ( comparator.compare(arr[j], pivot) < 0 ) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }

    public static int compare(int a, int b) {
        String s1 = a + "" + b;
        String s2 = b + "" + a;
        long num1 = Long.parseLong(s1);
        long num2 = Long.parseLong(s2);
        return (num1 > num2) ? -1 : 1;
    }
}

/*
 * The quicksort algorithm has an average time complexity of O(n log n)
 * and worst-case time complexity of O(n^2) with space complexity of O(log n)
 *
 * The program sorts the elements of the array by comparing the concatenated
 * values of each pair of elements, and then concatenates the elements of the
 * sorted array to get the largest possible number.
 *
 *
 * In the code above, Comparator<Integer> comparator is a functional
 * interface in Java that defines a single method called compare. It is used
 *  to compare two objects of the same type and determine their relative order.
 *
 * The compare method takes two arguments, a and b, and returns an integer
 * value indicating the relative order of the two objects. If the returned
 * value is less than 0, it means that a is considered less than b. If the
 * returned value is greater than 0, it means that a is considered greater
 * than b. If the returned value is equal to 0, it means that a is
 * considered equal to b.
 *
 * In the code above, comparator is being passed as an argument to the
 * quicksort and partition methods. The quicksort method uses the comparator
 * to determine the relative order of the elements in the array and sort
 * them accordingly.
 * The partition method also uses the comparator to compare the elements in
 * the array and partition them around a pivot element.
 *
 * It allows for a more flexible way of sorting an array of elements, as it
 * allows to define the sorting criteria at runtime, rather than having the
 * sorting criteria hard-coded into the sorting algorithm. This enables the
 * sorting of elements based on different criteria, depending on the use
 * case.
 * */
package Questions.Recurssion;

import java.util.Arrays;

public class Inverse_Array_Recussion {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int length_of_array = sc.nextInt();
//        int[] arr = new int[length_of_array];
//
//        //
//        for ( int i = 0; i < length_of_array; i++ ) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = { 0, 2, 4, 1, 3 };
        inverseArray(arr, 0);
//        PrintArray(arr);
    }

    static void inverseArray(int[] arr, int index) {
        if ( index == arr.length ) {
            return;
        }

        int value = arr[index];
        arr[index] = index;
        System.out.println("before " + Arrays.toString(arr));
        System.out.println();
        inverseArray(arr, index + 1);
        //
        arr[value] = index;
        System.out.println("value " + value);
//        System.out.println("after " + Arrays.toString(arr));
        System.out.println();
    }

    static void PrintArray(int[] arr) {
        for ( int ele : arr ) {
            System.out.print(ele + " ");
        }
    }
}



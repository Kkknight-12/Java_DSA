package LearnBasics.JavaBasics.Arrays;

import java.util.Arrays;

public class Array_Basics {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr));


        int[] arr_copy = arr;
        System.out.println(Arrays.toString(arr_copy));

        //
        arr_copy[0] = 3;
        arr_copy[1] = 33;
        arr_copy[2] = 333;
        System.out.println(Arrays.toString(arr_copy));
    }
}

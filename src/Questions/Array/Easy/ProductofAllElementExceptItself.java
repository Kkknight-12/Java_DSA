package Questions.Array.Easy;

import java.util.Arrays;

public class ProductofAllElementExceptItself {
    public static void main(String[] args) {

//    int[] arr = {1, 2, 3, 4};
        int[] arr = { -1, 2, -3, 4, -5 };

        int[] sumArray = new int[arr.length];
        for ( int i = 0; i < arr.length; i++ ) {
            int product = 1;
            for ( int j = 0; j < arr.length; j++ ) {
                if ( arr[i] == arr[j] ) {
                    continue;
                } else {
                    product *= arr[j];
                }
            }
            sumArray[i] = product;
        }

        System.out.println(Arrays.toString(sumArray));

    }
}

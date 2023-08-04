package CodingBlocks.Fundamentals.December.TwelveDec;

import java.util.ArrayList;

public class SumOfTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = { 9, 9, 9, 9 };
        int[] arr2 = { 1 };

        System.out.println(PrintSumOfTwoArrays(arr1, arr2));
    }

    public static ArrayList<Integer> PrintSumOfTwoArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> Al = new ArrayList<>();
        int i1 = arr1.length - 1;
        int i2 = arr2.length - 1;
        int carry = 0;


        // run the loop till both of the arrays have elements.
        while ( i1 >= 0 || i2 >= 0 ) {

            int sum = carry;

            if ( i1 >= 0 ) {
                sum = sum + arr1[i1];
            }

            if ( i2 >= 0 ) {
                sum = sum + arr2[i2];
            }

            carry = sum / 10;
            int digit = sum % 10;

            Al.add(0, digit);

            i1--;
            i2--;
        }
        // check if there is a carry left
        if ( carry > 0 ) {
            Al.add(0, carry);
        }
        return Al;
    }


}

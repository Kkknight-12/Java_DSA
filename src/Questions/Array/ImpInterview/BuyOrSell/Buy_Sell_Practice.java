package Questions.Array.ImpInterview.BuyOrSell;

import java.util.Scanner;

public class Buy_Sell_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        int length_of_array1 = sc.nextInt();
//        int[] arr = new int[length_of_array1];
//
//        //
//        for ( int i = 0; i < length_of_array1; i++ ) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = { 10, 2, 9, 3, 8, 4 };
        int result = MaxProfit(arr);
        System.out.println(result);
    }

    static int MaxProfit(int[] arr) {

        if ( arr.length == 0 ) {
            return 0; // No profit can be made if the array is empty
        }


        int sell = 0;
        int left = 0;
        int right = arr.length - 1;

        while ( left < right ) {
            if ( sell < (arr[right] - arr[left]) ) {
                sell = arr[right] - arr[left];
            }
            left++;
            right--;
        }

        return sell;
    }
}

/*
 * Array with alternating high and low values:
 * Consider an array where elements are alternating between high and low
 * values (e.g., [10, 2, 9, 3, 8, 4]). The solution will give wrong answer as
 * because the two pointers (left and right) will meet at some
 * point without considering all possible buying and selling days
 *  */
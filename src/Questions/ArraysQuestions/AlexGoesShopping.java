package Questions.ArraysQuestions;

import java.util.Scanner;

public class AlexGoesShopping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length_of_array1 = sc.nextInt();
        int[] arr1 = new int[length_of_array1];

        //
        for ( int i = 0; i < length_of_array1; i++ ) {
            arr1[i] = sc.nextInt();
        }

        //
        int length_of_array2 = sc.nextInt();
        int[] arr2 = new int[length_of_array2];
        int[] arr3 = new int[length_of_array2];

        //
        for ( int i = 0; i < length_of_array2; i++ ) {
            arr2[i] = sc.nextInt();
            arr3[i] = sc.nextInt();
        }

        //
        for ( int i = 0; i < arr2.length; i++ ) {
            Shopping(arr1, arr2[i], arr3[i]);
        }

    }

    static void Shopping(int[] items, int money, int items_kind) {

        int count = 0;
        for ( int i = 0; i < items.length; i++ ) {
            if ( money % items[i] == 0 ) {
                count++;
            }
        }

        if ( count >= items_kind ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

/*
 * money % items[i] == 0
 * this logic is there as
 * she can only purchase one type of item
 * can all money must be exhausted after item purchase*/

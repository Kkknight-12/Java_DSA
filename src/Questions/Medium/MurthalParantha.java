package Questions.Medium;

import java.util.Scanner;

/*
https://copyassignment.com/roti-prata-spoj-problem-solution/
*/
public class MurthalParantha {
    public static void main(String[] args) {

//        int parathas = 10;
//        int cooks = 4;
//        int[] cookRanks = {1, 2, 3, 4};
        Scanner sc = new Scanner(System.in);
        int parathas = sc.nextInt();
        int cooks = sc.nextInt();

        // using dynamic array
        int[] cookRanks = new int[cooks];

        // store user numbers
        for ( int i = 0; i < cooks; i++ ) {
            cookRanks[i] = sc.nextInt();
        }

        System.out.println((parathaSpoj(cookRanks, parathas)));
    }

    static boolean isvalid(int[] arr, int P, int mid) {
        int time = 0;
        int cp = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            time = arr[i];
            int j = 2;
            while ( time <= mid ) {
                cp++;
                time = time + (arr[i] * j);
                j++;
            }
            if ( cp >= P )
                return true;
        }

        return false;
    }

    static int parathaSpoj(int[] arr, int paratha) {

        int ans = -1;
        int low = 0, high = Integer.MAX_VALUE;

        while ( low <= high ) {

            int mid = low + (high - low) / 2;

            if ( isvalid(arr, paratha, mid) ) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}

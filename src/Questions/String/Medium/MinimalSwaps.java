package Questions.String.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MinimalSwaps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] arr = new int[len];
        for ( int i = 0; i < len; i++ ) {
            arr[i] = sc.nextInt();
        }
//        int[] arr = {4, 3, 1, 2};

        int result = minimumSwaps(arr, arr.length);
        System.out.println(result);
    }

    public static int minimumSwaps(int[] a, int n) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        int[] copy = new int[n];
        for ( int i = 0; i < n; i++ ) {
            copy[i] = a[i];
        }

        Arrays.sort(copy);
        for ( int i = 0; i < n; i++ ) {
            m.put(copy[i], i + 1);
        }
//        System.out.println(m);
        // {1=1, 2=2, 3=3, 4=4}
//        System.out.println(m.get(a[1]));

        int moves = 0;
        for ( int i = 0; i < n; i++ ) {
            if ( (i + 1) != ( int ) m.get(a[i]) ) {
                int temp = a[i];
                int pos = m.get(a[i]) - 1;
                a[i] = a[pos];
                a[pos] = temp;
                moves++;
//                System.out.println(Arrays.toString(a));
                i--;
            }
        }
        return moves;
    }
}

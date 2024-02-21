package Questions.Array.ImpInterview;

import java.util.HashMap;
import java.util.Scanner;

public class DivisibleSubArraysSol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length_of_array1 = sc.nextInt();
        int[] arr = new int[length_of_array1];

        //
        for ( int i = 0; i < length_of_array1; i++ ) {
            arr[i] = sc.nextInt();
        }

//        subarraysSum(arr, arr.length);
        int result = subCount(arr, 5);
        System.out.println(result);
    }

    /* 6
    4 5 0 -2 -3 1 */
    static int subCount(int[] A, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // value = number of times value came
        // {0=2, 2=1, 4=4}

        // key, count
        map.put(0, 1);

        int runningSum = 0;
        int count = 0;
        for ( int i = 0; i < A.length; i++ ) {
            runningSum += A[i]; // 4, 9, 9, 7, 4, 5
            int remainder = runningSum % K; //4, 4, 4, 2, 4, 0

            if ( remainder < 0 ) remainder += K;
            if ( map.containsKey(remainder) ) {

                count += map.get(remainder); // 1 3 6 7 7
            }
            // get the value and increment it by 1;
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}

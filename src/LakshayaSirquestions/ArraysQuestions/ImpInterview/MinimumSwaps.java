package LakshayaSirquestions.ArraysQuestions.ImpInterview;

import java.util.*;

public class MinimumSwaps {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        minSwaps(arr);
//        int result = minimumSwaps(arr);
//        System.out.println(result);
    }

    static void minSwaps(int[] arr) {
//        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();

        for ( int i = 0; i < arr.length; i++ ) {
            map.put(i, arr[i]);
        }

        for ( Map.Entry<Integer, Integer> i : map.entrySet() ) {
            System.out.println("Key = " + i.getKey() +
                ", Value = " + i.getValue());
        }

        System.out.println();
        // sort
        Object[] a = map.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
            public int compare(Object o2, Object o1) {
                return (( Map.Entry<Integer, Integer> ) o2).getValue()
                    .compareTo((( Map.Entry<Integer, Integer> ) o1).getValue());
            }
        });

        // print
        for ( Object e : a ) {
            System.out.println((( Map.Entry<Integer, Integer> ) e).getKey() + " : "
                + (( Map.Entry<Integer, Integer> ) e).getValue());
        }

        for ( Object e : a ) {
            map2.put((( Map.Entry<Integer, Integer> ) e).getKey(),
                (( Map.Entry<Integer, Integer> ) e).getValue());
        }

    }

//    public static int minimumSwaps(int[] a) {
//        HashMap<Integer, Integer> m = new HashMap<Integer,
//            Integer>();
//
//        int[] copy = new int[a.length];
//        for ( int i = 0; i < a.length; i++ ) {
//            copy[i] = a[i];
//        }
//        Arrays.sort(copy);
//        for ( int i = 0; i < a.length; i++ ) {
//            m.put(copy[i], i + 1);
//        }
//        System.out.println("M" + m);
//        int moves = 0;
//        for ( int i = 0; i < a.length; i++ ) {
//            if ( (i + 1) != ( int ) m.get(a[i]) ) {
//                int temp = a[i];
//                int pos = m.get(a[i]) - 1;
//                a[i] = a[pos];
//                a[pos] = temp;
//                moves++;
//            }
//        }
//        return moves;
//    }
}

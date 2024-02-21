package Questions.Array.ImpInterview;

import java.util.*;

public class MinimumSwaps {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[sc.nextInt()];
//        for ( int i = 0; i < arr.length; i++ ) {
//            arr[i] = sc.nextInt();
//        }
//        int[] arr = { 3, 1, 2, 4 };
//        int[] arr = { 4, 3, 1, 2 };
        int[] arr = { 2, 8, 5, 4 };
//        minSwaps(arr);
//        int result = minimumSwaps(arr);
//        System.out.println(result);

        System.out.println(minSwaps2(arr));
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

    public static int minSwaps2(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        System.out.println("O Array " + Arrays.toString(arr));
        System.out.println("S Array " + Arrays.toString(sortedArr));

        int n = arr.length;
        int swapCount = 0;

        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for ( int i = 0; i < n; i++ ) numsMap.put(arr[i], i);
        System.out.println(numsMap);


        for ( int i = 0; i < n; i++ ) {
            if ( arr[i] != sortedArr[i] ) {
                // take the element from sorted array
                // which is on the iterator position
                int targetNum = sortedArr[i];

                // take its old position ( original A ) from map
                int targetNumIndex = numsMap.get(targetNum);
//                System.out.println("targetNum " + targetNum); // 4
//                System.out.println("targetNumIndex " + targetNumIndex); // 3

//                System.out.println("check " + (arr[targetNumIndex] ==
//                targetNum)); // true

                // now in map we take element which is at current index in
                // Sorted Array and change its value to current iterator
                // we also take element which is at the current iterator in
                // Original Array and change its value in map to old position
                // ( Original Array ) of element which is at the current
                // iterator position in Sorted Array
                numsMap.put(arr[targetNumIndex], i);
                numsMap.put(arr[i], targetNumIndex);

                int temp = arr[i];
                arr[i] = arr[targetNumIndex];
                arr[targetNumIndex] = temp;
                System.out.println(numsMap);

                swapCount++;
            }
        }

        return swapCount;
    }

}

/*
 * minSwaps2:
 * 1. Create a copy of the original array, sort it and store it in sortedArr.
 *
 * 2. Create a HashMap, numsMap, to store the index of each element in the
 * original array.
 *
 * 3. Iterate through the original array and for each element, check if it is in
 * the correct position (i.e. equal to its corresponding element in the
 * sortedArr).
 *
 * 4. If the element is not in the correct position, find the index of the
 * correct element in the original array using the numsMap.
 *
 * 5. Swap the current element and the correct element in the original array.
 *
 * 6. Update the numsMap to reflect the new positions of the elements.
 *
 * 7. Increase the swapCount by 1.
 *
 * 8. Repeat steps 3-7 for all elements in the original array.
 *
 * 9. Return the swapCount as the minimum number of swaps required to sort the
 * original array.
 *
 * The time complexity of this algorithm is O(nlogn) as it sorts the array
 * first which takes O(nlogn) time and then it iterates the array and
 * performs a constant time operation for every element, which takes O(n) time.
 *  */
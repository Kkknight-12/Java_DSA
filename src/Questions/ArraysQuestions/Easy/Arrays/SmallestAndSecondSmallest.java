package Questions.ArraysQuestions.Easy.Arrays;

// https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1
/*
 * Given an array of integers, your task is to find the smallest and second
 * smallest element in the array. If smallest and second smallest do not
 * exist, print -1.
 * */

public class SmallestAndSecondSmallest {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int lengthOfArray = sc.nextInt();
//
//        int arr[] = new int[lengthOfArray];
//
//        for ( int i = 0; i < lengthOfArray; i++ ) {
//            arr[i] = sc.nextInt();
//        }

        int arr[] = { 2, 4, 3, 5, 6 };
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for ( int ele : arr ) {
            if ( ele < smallest ) {
                secondSmallest = smallest;
                smallest = ele;
            } else if ( ele > smallest && ele < secondSmallest ) {
//                 else if ( ele != smallest && ele < secondSmallest ) {
                secondSmallest = ele;
            }
        }
        if ( smallest == Integer.MAX_VALUE ) {
            System.out.println("Smallest does not exist");
        } else {
            System.out.println("Smallest " + smallest);
        }
        if ( secondSmallest == Integer.MAX_VALUE ) {
            System.out.println("Second smallest does not exist");
        } else {
            System.out.println("Second smallest " + secondSmallest);
        }
    }
}

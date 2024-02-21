package Questions.ArraysQuestions.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_of_testcases = sc.nextInt();

        //
        for ( int i = 0; i < num_of_testcases; i++ ) {
            int num_of_roses = sc.nextInt();
            int[] rose_array = new int[num_of_roses];

            for ( int j = 0; j < num_of_roses; j++ ) {
                rose_array[j] = sc.nextInt();
            }

            int target = sc.nextInt();
            Arrays.sort(rose_array);
            FindRosePairs(rose_array, target);
            System.out.print("");
        }

    }

    static void FindRosePairs(int[] rose_array, int target) {
        int min_difference = Integer.MAX_VALUE;
        int part_1 = 0;
        int part_2 = 0;

        for ( int i = 0; i < rose_array.length - 1; i++ ) {
            for ( int j = i + 1; j < rose_array.length; j++ ) {
                if ( rose_array[i] + rose_array[j] == target ) {

                    if ( rose_array[j] - rose_array[i] < min_difference ) {
                        min_difference = rose_array[j] - rose_array[i];
                        if ( part_1 < part_2 ) {
                            part_1 = rose_array[i];
                            part_2 = rose_array[j];
                        } else {
                            part_1 = rose_array[j];
                            part_2 = rose_array[i];
                        }

                    }
                }
            }
        }
        System.out.println("Deepak should buy roses whose prices " +
            "are " + part_1 + " and " + part_2 + ".");
    }

}

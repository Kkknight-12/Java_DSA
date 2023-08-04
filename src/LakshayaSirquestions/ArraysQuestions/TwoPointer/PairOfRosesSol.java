package LakshayaSirquestions.ArraysQuestions.TwoPointer;

public class PairOfRosesSol {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);

//        int num_of_testcases = sc.nextInt();

        //
//        for ( int i = 0; i < num_of_testcases; i++ ) {
//            int num_of_roses = sc.nextInt();
//            int[] rose_array = new int[num_of_roses];
//
//            for ( int j = 0; j < num_of_roses; j++ ) {
//                rose_array[j] = sc.nextInt();
//            }
//
//            int target = sc.nextInt();
//            Arrays.sort(rose_array);
//            FindRosePairs(rose_array, target);
        FindRosePairs();
        System.out.print("");
//        }
    }

    private static void FindRosePairs( ) {
        int[] nums = { 10, 2, 6, 8, 4 };
        int target = 10;
        int part_1 = 0;
        int part_2 = 0;

        for ( int i = 0; i < nums.length; i++ ) {
            int left = i;
            int right = nums.length - 1;

            while ( left < right ) {
                if ( nums[left] + nums[right] == target ) {
                    part_1 = nums[left];
                    part_2 = nums[right];
                    System.out.println("Left " + nums[left] + " right " + nums[right]);
                    left++;
                    right--;
                } else if ( nums[left] + nums[right] < target ) {
                    System.out.println("Left " + nums[left] + " right " + nums[right]);

                    left++;
                } else {
                    System.out.println("Left " + nums[left] + " right " + nums[right]);

                    right--;
                }
            }
        }
        System.out.println("Deepak should buy roses whose prices " +
            "are " + part_1 + " and " + part_2 + ".");

    }

}

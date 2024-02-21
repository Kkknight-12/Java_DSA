package Questions.Array.ImpInterview.MajorityElement;

public class MajorityElement_Moore_Voting_Algo {
    public static int findMajorityElement(int[] nums) {
        // Initialize variables to track the current candidate and its count
        int candidate = 0;
        int count = 0;

        // Iterate through the array
        for ( int num : nums ) {
            // If the count is 0, set the current element as the candidate
            if ( count == 0 ) {
                candidate = num;
            }

            // If the current element is the candidate, increase the count
            if ( num == candidate ) {
                count++;
            }
            // If the current element is not the candidate, decrease the count
            else {
                count--;
            }
        }

        // At the end of the loop, the candidate will be the majority element
        return candidate;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        // Input
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }

//        int[] arr = { 1, 1, 2};
        int[] arr = { 7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5 };
//        int[] arr = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 1, 1, 1, 1};
//        {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5}

        // Finding the majority element
        int majorityElement = findMajorityElement(arr);

        // Output
        System.out.println(majorityElement);
    }
}

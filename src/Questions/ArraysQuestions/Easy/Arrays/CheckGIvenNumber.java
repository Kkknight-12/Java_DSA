package Questions.ArraysQuestions.Easy.Arrays;

public class CheckGIvenNumber {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 14;

        for ( int i : arr ) {
            if ( i == target ) {
                System.out.println("Found " + i + " in Array");
                return;
            }
        }
        System.out.println("Target don't exist in array");
    }
}

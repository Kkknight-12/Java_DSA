package LakshayaSirquestions.ArraysQuestions.ImpInterview;

public class CalCulateSum2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        printCalSum(arr, 2);
    }

    static void printCalSum(int[] arr, int k) {
        int sum = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            sum += arr[i];
        }
        sum = sum * 2 * k;

        System.out.println("SSS " + sum);
    }
}

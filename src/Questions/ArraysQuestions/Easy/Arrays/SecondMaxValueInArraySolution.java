package Questions.ArraysQuestions.Easy.Arrays;

public class SecondMaxValueInArraySolution {
    public static void main(String[] args) {

//    int[] arr = {2, 54, 2, 3, 5, 3, 5};
        int[] arr = { -2, -33, -10, -456 };

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        // iterate over array
        for ( int i = 0; i < arr.length; i++ ) {
            // find max
            if ( arr[i] > max )
                // assign max variable value
                max = arr[i];
                // if another max value is found and that is not max
            else if ( arr[i] > secondmax && arr[i] != max ) {
                // assign it to variable secondmax
                secondmax = arr[i];
            }
        }//end of for-loop


        System.out.println("result " + secondmax);
    }
}

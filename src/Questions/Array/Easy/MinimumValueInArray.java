package Questions.Array.Easy;

public class MinimumValueInArray {
    public static void main(String[] args) {
//    int[] arr = {9, 2, 3, 6};
        int[] arr = { 4, 2, 1, 5, 0 };

        int min = arr[0];

        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] < min ) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}

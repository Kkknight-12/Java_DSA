package CodingBlocks.Fundamentals.Novermber.SixteenNov;

public class enhanced_loop_3 {
    public static void main(String[] args) {
        int arr2[] = new int[5];
        for ( int i = 0; i < arr2.length; i++ ) {
            arr2[i] = 3 * (i + 1);
        }

        /* enhanced loop | read only loop */
        // for each loop
        // runs index from 0 to array.length - 1
        for ( int ele : arr2 ) {
            System.out.print(ele + " ");
        }
        /* making any changes inside such loop will not be reflected in array */
    }
}

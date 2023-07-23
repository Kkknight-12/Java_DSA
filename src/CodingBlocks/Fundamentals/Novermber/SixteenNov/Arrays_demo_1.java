package CodingBlocks.Fundamentals.Novermber.SixteenNov;

public class Arrays_demo_1 {
    public static void main(String[] args) {

        int[] arr = new int[5];

        // we get address
        System.out.println(arr); // [I@5acf9800
        System.out.println(arr.length); // 5

        // indexing
        /* when we try to access the value at index we have assigned we get
        zero */
        System.out.println(arr[0]); // 0
        System.out.println(arr[1]); // 0
        System.out.println(arr[2]); // 0
        System.out.println(arr[3]); // 0
        System.out.println(arr[4]); // 0

        //
        // if we try to access an index which is actually not present
        // we get error of array out of bound
        /* Index 5 out of bounds for length 5 */
//        System.out.println(arr[5]);

        System.out.println("");

//        assign value with help of loop
        int assign_value = 2;
        for ( int i = 0; i < arr.length; i++ ) {
            arr[i] = assign_value;
            assign_value = assign_value + 2;
            System.out.println(arr[i]);
        }
        System.out.println("");
        System.out.println(arr[0]);
    }
}

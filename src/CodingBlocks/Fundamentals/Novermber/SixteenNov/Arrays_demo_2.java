package CodingBlocks.Fundamentals.Novermber.SixteenNov;

public class Arrays_demo_2 {
    public static void main(String[] args) {
        int arr2[] = new int[10];
        System.out.println(arr2);

        System.out.println("");

//        assign value
        for ( int i = 0; i < arr2.length; i++ ) {
            arr2[i] = 3 * (i + 1);
        }

        // print value
        for ( int i = 0; i < arr2.length; i++ ) {
            System.out.print(arr2[i] + " ");
        }
    }
}

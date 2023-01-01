package CodingBlocks.Fundamentals.Novermber.SixteenNov;

public class Arrays_demo_6 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {22, 23, 44, 55};

        System.out.println(a1[0] + ":" + a2[0]); // 1 : 22

        /*  since this time we are sending the whole array, and
         * then we are mentioning the address -> a[indexing] or b[indexing]
         * to do the swapping the elements inside the array get changed */
        swap_in(a1, a2, 0);
        System.out.println(a1[0] + ":" + a2[0]); // 22 : 1
    }

    public static void swap_in(int a[], int b[], int c) {
        int d = a[c];
        a[c] = b[c];
        b[c] = d;
    }
}

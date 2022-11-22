package CodingBlocks.Fundamentals.SixteenNov;

public class Arrays_demo_5 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {22, 23, 44, 55};

        System.out.println(a1[0] + ":" + a2[0]); // 1 : 22

        /*  in the swap function we are sending the value so the values are
        swapped inside the swap function but after the function is popped from
        stack the address whose value was taken to swap remain same as no
        change was don't to address */
        swap(a1[0], a2[0]);
        System.out.println(a1[0] + ":" + a2[0]); // 1 : 22

        // same applies to array swaping logic
        /*  a dn b are local variable in swap_arr function
         * so when the function is popped from stack, changes made don't
         * affect real array*/
        System.out.println(a1 + " : " + a2); // [I@8efb846 : [I@2a84aee7
        swap_arr(a1, a2);
        System.out.println(a1 + " : " + a2); // [I@8efb846 : [I@2a84aee7
    }

    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }

    public static void swap_arr(int[] a, int[] b) {
        int[] d = a;
        a = b;
        b = d;
        // swapping array working inside swap function only
//        System.out.println("inside swap array function" + a + " : " + b);
        // [I@2a84aee7 : [I@8efb846
    }
}

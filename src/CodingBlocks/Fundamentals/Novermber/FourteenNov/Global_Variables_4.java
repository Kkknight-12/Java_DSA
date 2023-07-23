package CodingBlocks.Fundamentals.Novermber.FourteenNov;

public class Global_Variables_4 {

    // space to global variable is allotted in heap
    // first memory is allocated to static global variable

    // global variable
    static int var = 100;

    // then memory is allocated to main method
    public static void main(String[] args) {
        fun(20);
    }

    public static void fun(int a) {
        // local variable
        int val = 20;
        System.out.println(val); // 20

        System.out.println(Global_Variables_4.var); // 100
    }


}

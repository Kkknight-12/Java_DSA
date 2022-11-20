package CodingBlocks.Fundamentals.TwelveNov;

public class Global_Variables {

    // space to global variable is allotted in heap
    // first memory is allocated to static global variable
    static int var = 100;

    // then memory is allocated to main method
    public static void main(String[] args) {
        fun(20);
    }

    public static void fun(int a) {
        int val = 20;
        // local variable
        System.out.println(val); // 20
        // global variable
        System.out.println(Global_Variables.var); // 100
    }


}

package CodingBlocks.Fundamentals.TwelveNov;

public class Function_demo {
    public static void main(String[] args) {
        fn();

        int result = add(1, 2);
        System.out.println("add result " + result);

        add3(1, 2, "Theen-Soo");
    }

    /*  for now we will write all methods with public static
     * void -> return nothing
     * in parenthesis ( arguments : data type, .....) */
    public static void fn() {
        System.out.println("fn called"); // fn called
    }

    // return type of add is int
    public static int add(int a, int b) {
//        System.out.println(a + b); // 3
        return a + b;
    }

    public static void add3(int a, int b, String str) {
        System.out.println(a + b + str); // 33
    }
}

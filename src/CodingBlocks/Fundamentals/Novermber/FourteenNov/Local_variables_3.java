package CodingBlocks.Fundamentals.Novermber.FourteenNov;

public class Local_variables_3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 20;
        System.out.println(a + " : " + b);
        swap(a, b);
        System.out.println(a + " : " + b);
    }

    static void swap(int a, int b) {
        int temp_c = a;
        a = b;
        b = temp_c;
        System.out.println(a + " : " + b);

    }
}

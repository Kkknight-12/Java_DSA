package CodingBlocks.Fundamentals.Novermber.FourteenNov;

public class String_demo_1 {
    public static void main(String[] args) {

        /*
         * in java equation is evaluated from left to right
         *  String + anything give string
         *  */

        System.out.println("Hello" + 10); // Hello10
        System.out.println("Hello" + 10 + 10); // Hello1010
        System.out.println(10 + "Hello" + 10 + 20); // 10Hello1020
        System.out.println(20 + 20 + "Hello" + 10 + 20); // 40Hello1020
        System.out.println(20 + 10 + "Hello" + (10 + 20)); // 30Hello30
    }
}

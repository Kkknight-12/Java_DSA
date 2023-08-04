package LearnBasics.JavaBasics.Loops;

public class PostAndPreIncrement {
    public static void main(String[] args) {


//        Using post-increment in an assignment statement:
        int x = 5;
        int y = x++;
        // y is assigned the value of x (5), and then x is incremented by 1 (x becomes 6)
        // - first the value of x is assigned, so, the value of y is 5
        // - and then the x is incremented

        int xTwo = 5;
        System.out.println(xTwo++);
        // prints 5, and then xTwo is incremented by 1
        // (xTwo becomes 6)

        /* first the operation is performed and the increment is done */

        int count1 = 0;
        int temp1 = 0;
        for ( int i = 0; i < 10; i++ ) {
            temp1 = count1++;
        }
        System.out.println(temp1); // 9

        // ---------------------------------------------------------------------

        // Using pre-increment in an assignment statement:
        int a = 5;
        int b = ++a;
        // a is incremented by 1 (a becomes 6),
        // and then b is assigned the value of a (6)

        int aTwo = 5;
        System.out.println(++aTwo);
        // aTwo is incremented by 1 (aTwo becomes 6),
        // and then it is printed

        /* first the increment is done and then the operation is performed  */

        System.out.println();
        int count2 = 0;
        int temp2 = 0;
        for ( int i = 0; i < 10; ++i ) {
            temp2 = ++count2;
        }
        System.out.println(temp2); // 10
    }
}

package LakshayaSirquestions.Easy;

public class PowerOlogn {
    public static void main(String args[]) {
        // Your Code Here
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int n = sc.nextInt();
//        int result = power(x, n);
        int result = powerBitmasking(2, 3);
        int result2 = powerRecursion(2, 3);
        System.out.println(result);
        System.out.println(result2);
    }

    public static int powerBitmasking(int x, int n) {
        int result = 1;
        while ( n > 0 ) {
            if ( (n & 1) == 1 ) {
                result *= x;
            }
            x *= x;
            n >>= 1;
        }
        return result;
    }
    /*
     * This code is an implementation of the bitmasking approach to calculate
     * x raised to the power of n.
     *
     * The function takes in two parameters, x and n, where x is the base and
     * n is the exponent.
     *
     * The first line initializes a variable "result" with a value of 1. This
     * is because any number raised to the power of 0 is 1.
     *
     * The while loop runs as long as n is greater than 0.
     *
     * The if statement checks whether the least significant bit of n is 1. If
     * it is, it multiplies the result with x. This is because, if a bit is 1,
     * it means that the corresponding power of 2 is included in the final
     * result.
     *
     * Next, x is multiplied by itself. This is because, when we calculate x
     * raised to the power of n, we need to multiply x with itself n times.
     *
     * Finally, the n is right-shifted by 1 bit. This is equivalent to
     * dividing n by 2. This is done to check for the next bit in the next
     * iteration of the loop.
     *
     * Finally, the function returns the result which is x raised to the power
     * of n.
     *
     * This approach has a time complexity of O(log n) as we are dividing the
     * problem into half in each iteration.
     * */

    public static int powerRecursion(int x, int n) {
        if ( n == 0 ) {
            return 1;
        }
        int temp = powerRecursion(x, n / 2);
        if ( n % 2 == 0 ) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }
    /*
     * The recursion breaks down the problem of finding x^n into smaller
     * subproblems of finding x^(n/2). This is done by calling the function
     * itself with the new exponent being n/2 until the base case of n = 0 is
     * reached, at which point the function returns 1. The function then
     * combines the results of these sub problems by squaring the returned
     * value of the recursive call when n is even, and multiplying it with x
     * when n is odd. This way, the function is able to calculate x^n in O
     * (log n) time as the number of recursive calls is halved in each call.
     *  */
}


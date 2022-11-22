package CodingBlocks.Fundamentals.FourteenNov;

/*
* armstrong number → number whose sum of digit ^ number of digit is same number itself

Example →

- 153, number of digits will be 3.
    - So 1 ^ 3 + 5 ^ 3 + 3 ^ 3 =
    - 1 + 125 + 27
    - 153
- 407
    - 4 ^ 3 _ + 0 ^ 3 + 7 ^ 3
    - 64 + 343
    - 407
*/
public class Armstrong_Number {
    public static void main(String[] args) {
        int n = 10000;
//        int num_of_digits = num_digit(n);
        printArm(n);
    }

    public static void printArm(int n) {
        for ( int num = 1; num < n; num++ ) {
            if ( isArmstrong(num) ) {
                System.out.println(num);
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int num_of_digits = num_digit(num);
        int sum = 0;
        int backup_num = num;

        // num will be zero at end of while loop
        // so we store the num in variable
        // to compare it with sum
        while ( num != 0 ) {
            int last_digit = num % 10; // store last digit of num in variable
            sum = sum + ( int ) Math.pow(last_digit, num_of_digits);
            num = num / 10; // remove last digit from number
        }

        return sum == backup_num;
    }

    public static int num_digit(int num) {
        int num_of_digits = 0;
        while ( num > 0 ) {
            num = num / 10;
            num_of_digits++;
        }
        return num_of_digits;
    }
}

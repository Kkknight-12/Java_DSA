package CodingBlocks.Fundamentals.Novermber.ElevenNov;

public class Rot_4 {
    public static void main(String[] args) {
        int num = 12345;
        int rotation = 3;

//        System.out.println(12345 % 10); // 5
//        System.out.println(12345 / 10); // 1234

        int numofdigits = 0;
        // at last of while  loop num will be zero so to store the last value
        // we take backup of num
        int back_up = num;

        // while loop will count the number of digits
        while ( num > 0 ) {
            num = num / 10;
            numofdigits++;
        }
        num = back_up;
//        System.out.println("num " + num);
//        System.out.println("numofdigits " + numofdigits);

        for ( int i = 0; i < rotation; i++ ) {
            int digit = num % 10; // take last digit => 5
            int remain = num / 10; // remove last digit => 1234

            int mult = ( int ) Math.pow(10, numofdigits - 1); // 10 * 4 => 10000
            num = digit * mult + remain;
            // 5 * 10000 + 1234 => 50000 + 1234 => 51234
            System.out.println(num);

            /*  51234
                45123
                34512
                */
        }
    }
}

/*
* public static void main(String[] args) {

        int number = 12345;
        int rotation = 5;
        //  % 10 - to get last digit -> 5 ->     1234 | 5
        // /10 - to get first part of digit -> 1234 ->   1234 | 5

        for ( int i = 0; i < rotation; i++ ) {
            // remove last digit;
            int lastDigit = number % 10;

            // remove first part;
            int remainingPart = number / 10;
            number = remainingPart;

//            System.out.println("last " + lastDigit);
//            System.out.println("rem " + remainingPart);

            number = (10000 * lastDigit) + remainingPart;
            System.out.println(number);
        }
    }
* */

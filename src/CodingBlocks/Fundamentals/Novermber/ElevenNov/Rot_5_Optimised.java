package CodingBlocks.Fundamentals.Novermber.ElevenNov;

public class Rot_5_Optimised {
    public static void main(String[] args) {

        int number = 12345;
        int rotation = 3;
        //  % 10 - to get last digit -> 5 ->     1234 | 5
        // /10 - to get first part of digit -> 1234 ->   1234 | 5

        // Math.pow(10, _ ) -> will give the 10^_
        int divisor = ( int ) Math.pow(10, rotation);
        int lastDigit = number % divisor; // 345
        int firstPart = number / divisor; // 12

        // count the number of digits in the fist part
        int temp = number;
        int number_of_digits = 0;
        while ( temp > 0 ) {
            temp = temp / 10;
            number_of_digits++;
        }

        int result =
            (lastDigit * ( int ) Math.pow(10, number_of_digits - rotation)) + firstPart;

        System.out.println(result);
    }
}

/*
*  static void main(String[] args) {
        int rot = 30000002;
        int num = 12345;

        int nod = 0;
        int temp = num;

        while ( num > 0 ) {
            num = num / 10;
            nod++;
        }
        num = temp;
        rot = rot % nod;
        System.out.println("rotation " + rot);

        int divisor = ( int ) Math.pow(10, rot);
        int p1 = num / divisor; // first part
        int p2 = num % divisor; // last part

        System.out.println(p1 + " " + p2);

        int mult = ( int ) Math.pow(10, nod - rot);
        System.out.println(mult * p2 + p1);
    }
    **/
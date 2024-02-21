package Questions.Easy;

/*
 * Take the following as input.
 * A number
 * Assume that for a number of n digits, the value of each digit is from 1 to
 * n and is unique. E.g. 32145 is a valid input number.
 *
 * Write a function that returns its inverse, where inverse is defined as follows
 *
 * Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in
 * 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in
 * 12543, “2” is at 4th place.
 *
 * Print the value returned.
 *
 * Input Format
 * Integer
 *
 * Constraints
 * 0 < N < 1000000000
 *
 * Output Format
 * Integer
 *
 * Sample Input
 * 32145
 *
 * Sample Output
 * 12543
 *
 * Explanation
 * Assume that for a number of n digits, the value of each digit is from 1 to
 * n and is unique. E.g. 32145 is a valid input number. Inverse of 32145 is
 * 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th
 * place; in 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.
 *  */

public class InverserNumber {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
        int n = 32145;

        int invertedNumber = 0;
        int position = 1;

        while ( n > 0 ) {
            int digit = n % 10; // last number
            n = n / 10;
//            double multi = Math.pow(10, digit - 1);
            invertedNumber += position * Math.pow(10, digit - 1);
            System.out.println("invertedNumber " + invertedNumber);
//            System.out.println("position " + position);
            position++;
        }
        System.out.println(invertedNumber);
    }
}

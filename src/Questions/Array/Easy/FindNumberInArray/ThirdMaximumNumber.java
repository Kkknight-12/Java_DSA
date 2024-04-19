package Questions.Array.Easy.FindNumberInArray;

public class ThirdMaximumNumber {
    public static void main(String[] args) {


        int nums[] = { 2, 2, 3, 1 };
        long largestNumber = Long.MIN_VALUE;
        long secondLargestNumber = Long.MIN_VALUE;
        long thirdLargestNumber = Long.MIN_VALUE;

        for ( int num : nums ) {
            if ( num > largestNumber ) {
                thirdLargestNumber = secondLargestNumber;
                secondLargestNumber = largestNumber;
                largestNumber = num;
            } else if ( num > secondLargestNumber && num < largestNumber ) {
                thirdLargestNumber = secondLargestNumber;
                secondLargestNumber = num;
            } else if ( num > thirdLargestNumber && num < secondLargestNumber ) {
                thirdLargestNumber = num;
            }
        }

        if ( thirdLargestNumber > Long.MIN_VALUE ) {
            System.out.println("Third largest number is: " + thirdLargestNumber);
        } else if ( secondLargestNumber > Long.MIN_VALUE ) {
            System.out.println("Third largest number does not exist. Maximum number is: " + largestNumber);
        } else {
            System.out.println("Third and second largest numbers do not exist. Maximum number is: " + largestNumber);
        }

    }
}

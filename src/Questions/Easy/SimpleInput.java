package Questions.Easy;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while ( true ) {
            int inp = sc.nextInt();
            sum += inp;

            if ( sum < 0 ) {
                break;
            } else {
                System.out.println(inp);
            }
        }
    }

    static void AnotherSolution( ) {
        int[] arr = { 1, 2, 88, -100, 49 };
        int sum = 0;

        for ( int i = 0; i < arr.length; i++ ) {
            sum += arr[i];
//            System.out.println(sum);
            if ( sum > 0 ) {
                System.out.println(arr[i]);
            } else break;
        }
    }

    static void OneMoreSolution( ) {
        Scanner scanner = new Scanner(System.in);
        int cumulativeSum = 0;

        while ( scanner.hasNextInt() ) {
            int num = scanner.nextInt();
            cumulativeSum += num;

            if ( cumulativeSum >= 0 ) {
                System.out.println(num);
            } else {
                break;
            }
        }
        scanner.close();
    }
}

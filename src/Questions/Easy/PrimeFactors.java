package Questions.Easy;

public class PrimeFactors {
    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int N = sc.nextInt();
        int N = 12;
        int i;

        for ( i = 2; i <= N; i++ ) {
            while ( N % i == 0 ) {
//                System.out.print(i + " ");
                N /= i;
                System.out.println(N);
            } // while loop ends
        }

//    System.out.print(result + " ");
    }
}

//    divisor |  quotient
// 12 /  2  => 6
// 6  /  2  => 3
// 3  /  3  => 1

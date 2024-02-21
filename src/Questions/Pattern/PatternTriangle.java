package Questions.Pattern;


/*
      1
    2 3 2
  3 4 5 4 3
4 5 6 7 6 5 4
*/
public class PatternTriangle {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        int num = 4;
        printTriangle(num);
        TrianglePattern(num);
    }

    // old solution
    static void printTriangle(int k) {
        for ( int i = 1; i <= k; i++ ) {
            for ( int j = i; j < k; j++ ) {
                System.out.print("--");
            }
            for ( int j = i; j < ((i * 2) - 1); j++ ) {
                System.out.print(j + " ");
            }
            for ( int j = ((i * 2) - 1); j >= i; j-- ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // practice solution
    static void TrianglePattern(int n) {
        for ( int i = 0; i < n; i++ ) {

            // space
            for ( int j = i + 1; j < n; j++ ) {
                System.out.print("  ");
            }

            // print
            // for (int j = i; j <= 2 * i - 1; j++) {
            for ( int j = i + 1; j <= ((i + 1) * 2) - 1; j++ ) {
                System.out.print(j + " ");
            }

            // mirror part
            for ( int j = ((i + 1) * 2) - 2; j >= i + 1; j-- ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}

package Questions.Pattern;

public class PatternMountain {
    public static void main(String[] args) {
        int n = 5;
        Pattern(n);
    }

    static void Pattern(int n) {
        for ( int row = 1; row <= n; row++ ) {
            for ( int col = 1; col <= row; col++ ) {
                System.out.print(col + " ");
            }

            // Print spaces
            for ( int space = 1; space <= (2 * (n - row)) - 1; space++ ) {
                System.out.print("  ");
            }

            for ( int col = row; col >= 1; col-- ) {
                if ( col != n ) {
                    System.out.print(col + " ");
                }
            }
            System.out.println();
        }
    }
}

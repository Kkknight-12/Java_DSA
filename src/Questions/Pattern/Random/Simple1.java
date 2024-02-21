package Questions.Pattern.Random;

/*
*
1
12
123
1234
12345 */
public class Simple1 {
    public static void main(String[] args) {


        for ( int col = 1; col <= 5; col++ ) {
            for ( int row = 1; row <= col; row++ ) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}

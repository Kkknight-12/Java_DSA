package LakshayaSirquestions.Pattern.Random;

/*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1 */
public class Simple2 {
    public static void main(String[] args) {

        for ( int col = 1; col <= 5; col++ ) {
            int count = 5;
            for ( int row = 1; row <= col; row++ ) {
                System.out.print(count-- + " ");
//                count--;
            }
            System.out.println();
        }
    }
}

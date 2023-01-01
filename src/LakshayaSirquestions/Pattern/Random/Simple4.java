package LakshayaSirquestions.Pattern.Random;

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1 */
public class Simple4 {
    public static void main(String[] args) {

        for ( int c = 5; c >= 1; c-- ) {
            for ( int r = 1; r <= c; r++ ) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}

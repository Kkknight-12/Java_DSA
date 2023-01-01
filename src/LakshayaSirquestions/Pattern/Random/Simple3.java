package LakshayaSirquestions.Pattern.Random;

/*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1 */
public class Simple3 {
    public static void main(String[] args) {

        for ( int c = 5; c >= 1; c-- ) {
            for ( int r = 5; r >= c; r-- ) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}

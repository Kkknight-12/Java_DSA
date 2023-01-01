package LakshayaSirquestions.Pattern.Random;

/*
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
*/
public class Simple6 {
    public static void main(String[] args) {

        for ( int i = 0; i <= 5; i++ ) {
            for ( int j = i; j <= 5; j++ ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

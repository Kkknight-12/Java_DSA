package LearnBasics.JavaBasics.Loops.For.DifferentWayWriteFor;

public class Loop1 {
    public static void main(String[] args) {

        int[] arr = { 60, 548, 546, 54, 99 };

        for ( int i = 0; i < arr.length - 1; i++ ) {
            System.out.print("j ");
            for ( int j = 0; j < arr.length - i - 1; j++ ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

/*
 * j 0 1 2 3
 * j 0 1 2
 * j 0 1
 * j 0
 */
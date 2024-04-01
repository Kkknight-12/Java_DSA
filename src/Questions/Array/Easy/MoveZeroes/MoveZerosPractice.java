package Questions.Array.Easy.MoveZeroes;

public class MoveZerosPractice {
    public static void main(String[] args) {

        int[] X = { 0, 1, 0, 3, 12 };

        moveZeroEnd(X, X.length);

        for ( int i = 0; i < X.length; i++ ) {
            System.out.print(X[i] + " ");
        }
    }

    static void moveZeroEnd(int X[], int n) {
        int j = 0;
        for ( int i = 0; i < n; i++ ) {
            if ( X[i] != 0 ) {
                swap(X, j, i);
                j++;
            }
        }
    }

    static void swap(int[] arr, int j, int i) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }
}

/*
 *        j
 *        i
 *        0 1 2 3  4
 * arr = [0,1,0,3,12]
 *
 * if( arr[i] !=0 ) => false
 *
 * i++
 * -----------------------------
 *
 *        j
 *          i
 *        0 1 2 3  4
 * arr = [0,1,0,3,12]
 *
 * if( arr[i] !=0 ) => true
 * swap => arr = [1,0,0,3,12]
 *
 * j++
 * i++
 * -----------------------------
 *
 *          j
 *            i
 *        0 1 2 3  4
 * arr = [1,0,0,3,12]
 * if( arr[i] !=0 ) => false
 *
 * i++
 * -----------------------------
 *
 *          j
 *              i
 *        0 1 2 3  4
 * arr = [1,0,0,3,12]
 * if( arr[i] !=0 ) => true
 * swap => [1,3,0,0,12]
 *
 * i++
 * j++
 *-----------------------------
 *
 *            j
 *                 i
 *        0 1 2 3  4
 * arr = [1,3,0,0,12]
 * if( arr[i] !=0 ) => true
 * swap => [1,3,12,0,0]
 * j++
 * loop ends
 *
 *  j
 *  i
 * {4, 8, 6, 0, 2, 0, 1, 15, 12, 0};
 *  */
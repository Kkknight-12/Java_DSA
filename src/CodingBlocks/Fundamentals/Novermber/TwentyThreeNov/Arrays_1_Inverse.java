package CodingBlocks.Fundamentals.Novermber.TwentyThreeNov;

/*
 * arr   -> 2, 4, 3, 1, 0
 * index -> 0, 1, 2, 3, 4
 *
 * Inverse
 * arr ->   4, 3, 0, 2, 1
 * index -> 0, 1, 2, 3, 4*/
public class Arrays_1_Inverse {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 1, 0};

        inverse(arr);
    }

    static int[] inverse(int[] arr) {

        for ( int i = 0; i < arr.length; i++ ) {
            int temp = arr[i];
//            arr[temp] = arr[]
//            arr[i] = arr[temp]
        }
        return arr;
    }
}

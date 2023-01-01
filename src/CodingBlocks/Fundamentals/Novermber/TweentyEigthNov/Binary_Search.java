package CodingBlocks.Fundamentals.Novermber.TweentyEigthNov;

public class Binary_Search {
    public static void main(String[] args) {

        int[] arr = {5, 6, 2, 11, 2, 12, 53, 22, 63, 7};

        System.out.println(Found(arr, 15));
    }

    public static boolean Found(int[] arr, int ele) {
        int s = 0;
        int e = arr.length - 1;

        while ( true ) {
            int mid = (s + e) / 2;

            if ( mid > e ) {
                mid = e - 1;
            } else if ( mid < s ) {
                mid = e + 1;
            }
        }
    }
}

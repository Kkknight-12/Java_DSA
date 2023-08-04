package CodingBlocks.Fundamentals.Novermber.TweentyEigthNov;

public class Binary_Search {
    public static void main(String[] args) {

        int[] arr = { 5, 7, 11, 12, 15, 20, 31, 33, 35, 40, 45, 55, 58, 66,
            71 };

        System.out.println(Found(arr, 15));
    }

    public static boolean Found(int[] arr, int ele) {
        int s = 0;
        int e = arr.length - 1;

        while ( s <= e ) {
            int mid = (s + e) / 2;
            System.out.println(arr[s] + " - " + arr[mid] + " - " + arr[e]);

            if ( arr[mid] > ele ) {
                e = mid - 1;
            } else if ( arr[mid] < ele ) {
                s = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }


}

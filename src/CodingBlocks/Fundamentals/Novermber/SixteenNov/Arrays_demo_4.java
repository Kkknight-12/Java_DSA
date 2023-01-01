package CodingBlocks.Fundamentals.Novermber.SixteenNov;

public class Arrays_demo_4 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = arr1;


        System.out.println(arr2 + " " + arr1); // [I@28a418fc [I@28a418fc
        System.out.println(arr2 == arr1); // true

        arr1[1] = 100432;

        System.out.println(arr1[1]); // 100432
        System.out.println(arr2[1]); // 100432
    }
}

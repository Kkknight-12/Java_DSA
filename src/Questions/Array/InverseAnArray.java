package Questions.Array;

public class InverseAnArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int length_of_array = sc.nextInt();
//        int[] arr = new int[length_of_array];
//
//        //
//        for ( int i = 0; i < length_of_array; i++ ) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = { 0, 2, 4, 1, 3 };
        InverseArray(arr);
        PrintArray(arr);
    }

    static void InverseArray(int[] arr) {
        int[] arr_copy = arr.clone();
        for ( int i = 0; i < arr.length; i++ ) {
            int value = arr_copy[i];
            arr[value] = i;
        }
    }

    static void PrintArray(int[] arr) {
        for ( int ele : arr ) {
            System.out.print(ele + " ");
        }
    }
}

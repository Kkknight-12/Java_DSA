package Questions.Array.Easy;

public class MergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 0, 0, 0 };
        int arr2[] = { 2, 5, 6, };

        merge(arr1, 3, arr2, 3);

    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointerOfArrayOne = m - 1;
        int pointerOfArrayTwo = n - 1;
        int pointer = m + n - 1;

        while ( (pointerOfArrayOne >= 0) && (pointerOfArrayTwo >= 0) ) {
            if ( nums1[pointerOfArrayOne] < nums2[pointerOfArrayTwo] ) {
                System.out.println("p1 < p2");
                nums1[pointer] = nums2[pointerOfArrayTwo];
                nums2[pointerOfArrayTwo] = 0;
                pointerOfArrayTwo--;
            } else {
                System.out.println("p1 >= p2");
                nums1[pointer] = nums1[pointerOfArrayOne];
                nums1[pointerOfArrayOne] = 0;
                pointerOfArrayOne--;
            }
            System.out.println("pointerOfArrayOne " + pointerOfArrayOne);
            System.out.println("pointerOfArrayTwo " + pointerOfArrayTwo);
            System.out.println("arr1 " + java.util.Arrays.toString(nums1));
            System.out.println("arr2 " + java.util.Arrays.toString(nums2));
            pointer--;
        }

        while ( pointerOfArrayTwo >= 0 ) {
            nums1[pointer] = nums2[pointerOfArrayTwo];
            pointerOfArrayTwo--;
            pointer--;
        }

    }
}

/*
 *            pointerOfArrayOne  pointer
 *                       ↓        ↓
 * int arr1[]  =  {1, 2, 3, 0, 0, 0};
 * int arr2[] =   {2, 5, 6};
 *                       ↑
 *            pointerOfArrayTwo
 *
 * -------------------------------------------
 *
 * pointerOfArrayTwo > pointerOfArrayOne, so we put element at
 * pointerOfArrayTwo at the position of pointer and decrement
 * pointerOfArrayTwo and pointer
 *
 *                       p1    p
 *                       ↓     ↓
 * int arr1[]  =  {1, 2, 3, 0, 0, 6};
 * int arr2[] =   {2, 5, 0};
 *                    ↑
 *                    p2
 *
 * -------------------------------------------
 *
 * pointerOfArrayTwo > pointerOfArrayOne, so we put element at
 * pointerOfArrayTwo at the position of pointer and decrement
 * pointerOfArrayTwo and pointer
 *
 *                       p1 p
 *                       ↓  ↓
 * int arr1[]  =  {1, 2, 3, 0, 5, 6};
 * int arr2[] =   {2, 0, 0};
 *                 ↑
 *                 p2
 *
 * -------------------------------------------
 *
 * pointerOfArrayOne > pointerOfArrayTwo, so we put element at
 * pointerOfArrayOne at the position of pointer and decrement
 * pointerOfArrayOne and pointer
 *
 *                    p1 p
 *                    ↓  ↓
 * int arr1[]  =  {1, 2, 0, 3, 5, 6};
 * int arr2[] =   {2, 0, 0};
 *                 ↑
 *                 p2
 *
 * -------------------------------------------
 *
 * pointerOfArrayOne == pointerOfArrayTwo, so else condition will execute.
 * We put element at pointerOfArrayOne at the position of pointer and decrement
 * pointer and pointerOfArrayOne
 *
 *                 p1 p
 *                 ↓  ↓
 * int arr1[]  =  {1, 0, 2, 3, 5, 6};
 * int arr2[] =   {2, 0, 0};
 *                 ↑
 *                 p2
 *
 * -------------------------------------------
 *
 * pointerOfArrayTwo > pointerOfArrayOne, so we put element at
 * pointerOfArrayTwo at the position of pointer and decrement
 * pointerOfArrayTwo and pointer
 *
 *                 p
 *                 ↓
 *                 p1
 *                 ↓
 * int arr1[]  =  {1, 2, 2, 3, 5, 6};
 * int arr2[] =   {0, 0, 0};
 *              ↑
 *              p2
 *
 * as pointerOfArrayTwo is less than 0, so first while loop will break
 *
 * -------------------------------------------
 *
 * Now we have to put the remaining elements of arr2 into arr1
 *  */


package LakshayaSirquestions.Pattern;


import java.util.Scanner;

/*
      1
    2 3 2
  3 4 5 4 3
4 5 6 7 6 5 4
*/
public class PatternTriangle {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        printTriangle(4);
    }

    static void printTriangle(int k) {
        for ( int i = 1; i <= k; i++ ) {
            for ( int j = i; j < k; j++ ) {
                System.out.print("  ");
            }
            for ( int j = i; j < ((i * 2) - 1); j++ ) {
                System.out.print(j + " ");
            }
            for ( int j = ((i * 2) - 1); j >= i; j-- ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

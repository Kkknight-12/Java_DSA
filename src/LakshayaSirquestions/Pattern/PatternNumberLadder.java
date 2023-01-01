package LakshayaSirquestions.Pattern;


import java.util.Scanner;

/*
1
2 3
4 5 6
7 8 9 10 */
public class PatternNumberLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrintNumberLadder(num);
    }

    static void PrintNumberLadder(int k) {
        int count = 1;
        for ( int i = 1; i <= k; i++ ) {
            for ( int j = 1; j <= i; j++ ) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}

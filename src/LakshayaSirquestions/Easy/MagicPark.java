package LakshayaSirquestions.Easy;

import java.util.Scanner;

public class MagicPark {
    public static void main(String[] args) {
        int n, s, k, m;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        k = sc.nextInt();
        m = sc.nextInt();

        char[][] a = new char[100][100];

        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < s; j++ ) {
                a[i][j] = sc.next().charAt(0);
            }
        }
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < s; j++ ) {
                if ( m < k ) {//you have to check for this statement in every iteration
                    System.out.println("No");
                    return;
                }
                if ( a[i][j] == '.' ) {
                    m = m - 2;
                } else if ( a[i][j] == '*' ) {
                    m = m + 5;
                } else if ( a[i][j] == '#' ) {
                    break;

                }
                if ( j == s - 1 ) {
                    m = m + 1;
                }
                m = m - 1;

            }
        }
        if ( m >= k ) {
            System.out.println("Yes");
            System.out.println(m);
        } else {
            System.out.println("No");
        }
    }
}

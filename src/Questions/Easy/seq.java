package Questions.Easy;

import java.util.Scanner;

public class seq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int val1 = sc.nextInt();
        boolean vali = false;

        for ( int i = 1; i < n; i++ ) {
            int val2 = sc.nextInt();
            if ( val2 == val1 ) System.out.println(false);
            if ( val2 / val1 < 1 && vali == true ) {
                System.out.println(false);
                return;
            }
            if ( val2 / val1 > 1 ) {
                vali = true;
            }
            val1 = val2;
        }
        System.out.println(true);
    }
}

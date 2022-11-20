package LakshayaSirquestions.Easy;

import java.util.Scanner;

public class ShoppingSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfSampleInp = sc.nextInt();

        while ( numOfSampleInp > 0 ) {
            int aayush_max = sc.nextInt();
            int harshit_max = sc.nextInt();

            int aayush_count = 0;
            int harshit_count = 0;
            for ( int i = 1; ; i++ ) {
                if ( i % 2 == 0 ) {
                    if ( harshit_count + i <= harshit_max ) {
                        harshit_count = harshit_count + i;
                    } else {
                        System.out.println("Aayush");
                        break;
                    }
                } else {
                    if ( aayush_count + i <= aayush_max ) {
                        aayush_count = aayush_count + i;
                    } else {
                        System.out.println("Harshit");
                        break;
                    }
                }
            }
            numOfSampleInp--;
        }
    }
}

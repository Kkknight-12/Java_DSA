package LakshayaSirquestions.Pattern;

/*
 -> n = 5
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        int totalRows = 5;
        int rowIncrementer = 1;

        // row
        while ( rowIncrementer < totalRows ) {

            //column
            int columnNumber = 0;
            while ( columnNumber < totalRows ) {
                System.out.print("* ");
                // increment column number
                columnNumber++;
            }

            // increment row count
            rowIncrementer++;

            // shift to next row
            System.out.println(" ");
        }

    }
}

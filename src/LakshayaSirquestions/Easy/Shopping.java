package LakshayaSirquestions.Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numOfSampleInp = sc.nextInt();
        int count = 0;

        ArrayList<Integer> ayusharr = new ArrayList<>();
        ArrayList<Integer> harsharr = new ArrayList<>();

        // take user input
        while ( count < numOfSampleInp ) {
            int ayushCartLimit = sc.nextInt();
            int HarshCartLimit = sc.nextInt();

            ayusharr.add(ayushCartLimit);
            harsharr.add(HarshCartLimit);

            count++;
        }

        // calculation on user input
        int incrementer = 0;
        while ( incrementer < numOfSampleInp ) {
            int ayushCartlimit = ayusharr.get(incrementer);
            int hasrshCartlimit = harsharr.get(incrementer);
            int something = 1000000;

            int ayushinc = 0;
            int ayushCart = 0;
            int hasrshCart = 1;

            while ( true ) {
                ayushCart = (ayushinc * 2) + 1;
                hasrshCart = ayushCart + 1;

                if ( ayushCart > ayushCartlimit ) {
                    System.out.println("Harshit");
                    break;
                }
                if ( hasrshCart > hasrshCartlimit ) {
                    System.out.println("Aayush");
                    break;
                }
                ayushinc++;
            }

            incrementer++;

        }


    }

}

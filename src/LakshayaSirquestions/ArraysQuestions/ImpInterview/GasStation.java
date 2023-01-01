package LakshayaSirquestions.ArraysQuestions.ImpInterview;

import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {5, 1, 2, 3, 4};
        int[] cost = {4, 4, 1, 5, 1};

        int starting_index = 0;

        for ( int i = 0; i < gas.length; i++ ) {
            if ( gas[i] - cost[i] + gas[i + 1] >= 0 ) {
                starting_index = i;
                break;
            }
        }

        int gas_pointer = starting_index + 1;
        int cost_pointer = starting_index;
        int tank = gas[starting_index];
        int counter = 0;

        while ( counter != cost.length - 1 && tank >= 0 ) {
            tank =
                tank - cost[(cost_pointer % cost.length)] + gas[(gas_pointer) % gas.length];

//            System.out.println("gas  " + gas[(gas_pointer + 1) % gas.length]);
//            System.out.println("cost  " + cost[(cost_pointer % cost.length)]);
//            System.out.println("tank " + tank);
            cost_pointer++;
            gas_pointer++;
            counter++;
        }

        if ( tank - cost[(cost_pointer % cost.length)] >= 0 ) {
            System.out.println(starting_index);
        } else {
            System.out.println(-1);
        }

    }
}

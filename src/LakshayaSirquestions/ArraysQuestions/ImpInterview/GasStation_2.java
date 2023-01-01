package LakshayaSirquestions.ArraysQuestions.ImpInterview;

public class GasStation_2 {
    public static void main(String[] args) {
        int[] gas = {5, 1, 2, 3, 4};
        int[] cost = {4, 4, 1, 5, 1};

        int result = canCompleteCircuit(gas, cost);
        System.out.println(result);
    }

    /*
     * first step:
     * check the total gas sum is greater than equal to total cost sum
     *
     * process further only when gas sum is greater than equal to cost sum
     *
     * second step:
     * as we have came to second step we are certain that there exist a
     * solution.
     * To check what is the starting point we have to iterate over the arrays (
     *  both ) and get the difference.
     * The difference of the gas and cost is accumulated. Only condition is
     * that the difference must be positive. If the difference is negative we
     * must reset the difference variable to zero.
     * All the position that gave us negative are ignored as they can't be
     * starting point.
     * as we are certain that now the solution must exist, any position whose
     * cumulative sum is positive must be the starting point.
     *
     * Example:
     * position      0, 1, 2, 3, 4
     * gas ->        5, 1, 2, 3, 4
     * cost =>       4, 4, 1, 5, 1
     * difference =  1,-3, 1,-2, 3
     *
     * sum of gas 15 and sum of cost is 15, so we are certain that there must
     * exist a solution.
     *
     * position =>
     * - starting at position 1 we have difference 1
     * so 1 -3 = -2 , so we can't take position 1 as starting point.
     *
     * we can also try position 2 but 1 - 2 = -1 which is also negative, so we
     * can't proceed further.
     *
     * last position which we can consider is position 4
     * difference is 3.
     *
     * As other position failed, and we are certain that there exist a solution
     * so, we can say that this is our starting position.
     *   */
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas = 0;
        int total_cost = 0;

        for ( int value : gas ) {
            total_gas += value;
        }
        for ( int value : cost ) {
            total_cost += value;
        }

        if ( total_cost > total_gas ) return -1;

        int fuel_rem = 0;
        int ans = 0;

        for ( int i = 0; i < gas.length; i++ ) {
            fuel_rem += gas[i] - cost[i];

            if ( fuel_rem < 0 ) {
                ans = i + 1;
                fuel_rem = 0;
            }
        }
        return ans;
    }
}

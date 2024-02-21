package Questions.Array;

public class temp {
    public static void main(String[] args) {

        int[] items = { 100, 200, 400, 100 };

        int[] money = { 100, 200, 500, 600, 800, 1200 };

        int[] num_of_items = { 2, 3, 4, 4, 4, 1 };

        for ( int i = 0; i < num_of_items.length; i++ ) {
            purchase(items, money[i], num_of_items[i]);
        }
    }

    static void purchase(int[] items, int money, int num_of_items) {
        int count = 0;

        for ( int i = 0; i < items.length; i++ ) {
            if ( money % items[i] == 0 ) {
                count++;
            }
        }
        if ( count >= num_of_items ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

package LearnBasics.JavaBasics.Loops.For;

public class ForLoopRules2 {
    public static void main(String[] args) {
        // Initialization
        int sum = 0;
        int i = 1;
        int j = 1;

        // Condition
        for ( ; i <= 10 && j <= 5; ) {
            // Code to be executed
            sum += i * j;

            // Increment/Decrement
            i++;
            j++;
        }
        System.out.println("The sum of the products is: " + sum); // 55
    }
}

/*
 * here is an example of using all the rules of for-loop in a Java program:
 * In this example, the initialization section initializes the variables sum,
 * i and j to 0, 1, and 1 respectively.
 *
 * The condition section checks if the value of i is less than or equal to 10
 * and j is less than or equal to 5. If the condition is true, the code
 * inside the loop is executed.
 *
 * The code inside the loop calculates the product of i and j and adds it to
 * the variable sum.
 *
 * The increment/decrement section increments the value of i and j by 1 after
 * each iteration. Therefore, the loop runs 10 times, the final value of sum
 * will be the sum of products of 1 to 5 with 1 to 10.
 *
 * In this example, all the rules of the for loop are used: Initialization,
 * condition, and increment/decrement.
 *
 * It demonstrates how the for loop can be used to iterate over a range of
 * values, and how the initialization, condition, and increment/decrement
 * sections can be used to control the behavior of the loop.
 * */
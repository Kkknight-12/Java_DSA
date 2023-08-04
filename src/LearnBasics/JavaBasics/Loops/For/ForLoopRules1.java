package LearnBasics.JavaBasics.Loops.For;

public class ForLoopRules1 {
    public static void main(String[] args) {

    }
}

/*
* for (initialization; condition; increment/decrement) {
    // code to be executed
}
* The rules to write a for loop in Java are:
*
* The initialization section is used to initialize one or more variables that
* will be used in the loop. This section is executed only once, before the
* loop starts.
*
* The condition section is a boolean expression that is evaluated before
* each iteration of the loop. If the expression is true, the loop continues;
* if it is false, the loop stops.
*
* The increment/decrement section is used to update one or more variables
* after each iteration of the loop. This section is executed after the code
* inside the loop.
*
* Here's an example of a for loop that counts from 0 to 9:
*
* for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
* In this example, the initialization section initializes the variable i to 0
* . The condition section checks if i is less than 10, and the increment
* section increments i by 1 after each iteration.
*
*
* --- for-each loop ------
* It is also possible to use for-each loop for arrays or collections in Java,
* the syntax is as follows:
* for (DataType variableName : arrayName) {
    // code to be executed
}
*
* int[] numbers = {1,2,3,4,5};
* for (int num: numbers) {
    System.out.println(num);
}
* This will print all the elements of the array.
*
* It's worth noting that these are the basic rules and there are more
* advanced usage like using multiple variables, nested loops, etc.
* */
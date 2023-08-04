package LearnBasics.JavaBasics.DataType.ObjectType;


/* Here is an example of a class which creates an object type:
 *  */
public class Number {

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(5);

        myNumber.add(3);

        System.out.println(myNumber.number); // 5 + 3
    }
}

class MyNumber {
    int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public void add(int value) {
        this.number += value;
    }
}

package LearnBasics.LinearDataStructure.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Basics {
    public static void main(String[] args) {
        // ArrayList is a part of java.util package
        // It is a class that provides us dynamic arrays in Java
        // It is a part of Java's collection framework
        // It provides us with resizable arrays
        // It is similar to arrays but with dynamic size


        // creating an ArrayList
        List<String> list = new ArrayList<String>();

        // adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Printing out the list
        System.out.println(list);

        // Accessing an item in the list
        String item = list.get(1);
        System.out.println(item);

        // Removing an item from the list
        list.remove(1);
        System.out.println(list);
    }
}

package LearnBasics.LinearDataStructure.LinkedList;
// Linked list implementation in Java

/*
 * A linked list is a data structure in Java that consists of a collection of
 * nodes, each containing a reference to the next node in the list. This
 * structure allows for dynamic memory allocation and efficient insertion and
 * deletion operations, as only the affected nodes need to be modified.
 *
 * In Java, a linked list is typically implemented as a class, with each node
 * represented as an object of that class. The class will have at least two
 * instance variables: a data variable to store the value of the node, and a
 * reference variable to point to the next node in the list. In addition, the
 * class will typically have methods to add, remove, and retrieve nodes, as
 * well as to traverse the list.
 *
 * Here is an example implementation of a simple linked list class in Java: */

class LinkedListBasics {
    // Creating a node
    Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListBasics linkedList = new LinkedListBasics();

        // Assign value values
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // Connect nodess
        linkedList.head.next = second;
        second.next = third;

        // printing node-value
        while ( linkedList.head != null ) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
    }
}
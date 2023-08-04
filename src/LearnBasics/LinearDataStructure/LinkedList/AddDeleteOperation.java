package LearnBasics.LinearDataStructure.LinkedList;

/*
 * This code defines a Java class called LinkedList, which will represent our
 * linked list data structure. The class has a private instance variable
 * called head of type Node, which will be used to keep track of the first
 * node in the list.
 *
 * The class also has a private inner class called Node, which represents a
 * single node in the linked list. Each node contains an integer value (data)
 * , as well as a reference to the next node in the list (next).
 *
 * The Node class also has a constructor that takes an integer argument data
 * and initializes the data instance variable with the value of the argument,
 * and sets the next reference to null.
 *
 * By making the Node class a private inner class of the LinkedList class, we
 * ensure that instances of the Node class can only be accessed within the
 * LinkedList class, and cannot be accessed directly from outside the class.
 *
 * Overall, this code provides the basic structure and implementation of a
 * linked list in Java, with each node containing an integer value and a
 * reference to the next node in the list. The head instance variable of the
 * LinkedList class will point to the first node in the list, and we can add,
 * remove, and traverse nodes using the appropriate methods.
 */

public class AddDeleteOperation {
    private Node head; // Declare a private instance variable of type Node called head

    // Define a private inner class called Node
    private class Node {
        int data; // Declare an instance variable of type int called data
        Node next; // Declare an instance variable of type Node called next

        // Define a constructor that takes an int argument called data
        public Node(int data) {
            this.data = data; // Set the data instance variable to the value of the argument
            this.next = null; // Set the next instance variable to null
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
//        System.out.println("newNode " + newNode.data);

        if ( head == null ) {
            head = newNode;
//            System.out.println("head data " + head.data); // 5
        } else {
            System.out.println("head data- " + head.data);
            Node current = head;
            while ( current.next != null ) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(int data) {
        if ( head == null ) {
            return;
        }
        if ( head.data == data ) {
            head = head.next;
            return;
        }
        Node current = head;
        while ( current.next != null && current.next.data != data ) {
            current = current.next;
        }
        if ( current.next != null ) {
            current.next = current.next.next;
        }
    }

    public boolean contains(int data) {
        Node current = head;
        while ( current != null ) {
            if ( current.data == data ) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printList( ) {
        Node current = head;
        while ( current != null ) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddDeleteOperation myList = new AddDeleteOperation();

        // Add some nodes to the list
        myList.add(5);
        myList.add(10);
        myList.add(15);

        // Print the contents of the list
        myList.printList(); // Output: 5 10 15

        // Check if a node with value 10 is in the list
        boolean contains10 = myList.contains(10);
        System.out.println("Contains 10: " + contains10); // Output: Contains 10: true

        // Remove a node from the list
        myList.remove(10);

        // Print the contents of the list again
        myList.printList(); // Output: 5 15
    }
}

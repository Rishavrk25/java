package LinkedList;

// Define the Node class
class Node {
    int data; // The value stored in the node
    Node next; // Reference to the next node

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null; // Initially, the next node is null
    }
}

// Define the LinkedList class
class LinkedList {
    private Node head; // Reference to the first node (head of the list)

    // Add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) { // If the list is empty
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) { // Traverse to the last node
                current = current.next;
            }
            current.next = newNode; // Add the new node at the end
        }
    }

    // Add a node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // New node points to the current head
        head = newNode; // Update head to the new node
    }

    // Remove a node by value
    public void remove(int data) {
        if (head == null) { // If the list is empty
            System.out.println("The list is empty.");
            return;
        }

        // If the head needs to be removed
        if (head.data == data) {
            head = head.next;
            return;
        }

        // Traverse the list to find the node to remove
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Element not found in the list.");
        } else {
            current.next = current.next.next; // Skip the node to remove it
        }
    }

    // Display the elements of the list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Check if the list contains a specific value
    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

public class CustomLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.add(10);
        list.add(20);
        list.add(30);

        // Display the list
        System.out.println("Linked List:");
        list.display();

        // Add an element at the beginning
        list.addFirst(5);
        System.out.println("After adding 5 at the beginning:");
        list.display();

        // Remove an element
        list.remove(20);
        System.out.println("After removing 20:");
        list.display();

        // Check if the list contains an element
        System.out.println("Contains 30? " + list.contains(30)); // true
        System.out.println("Contains 50? " + list.contains(50)); // false
    }
}


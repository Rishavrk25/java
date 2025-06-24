package Stacks;

import java.util.Stack;

public class stl {
    public static void main(String[] args) {
        // Create a Stack of integers
        Stack<Integer> stack = new Stack<>();

        // 1. Push elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack); // [10, 20, 30]

        // 2. Peek at the top element
        System.out.println("Top element (peek): " + stack.peek()); // 30

        // 3. Pop the top element
        int popped = stack.pop();
        System.out.println("Popped element: " + popped); // 30
        System.out.println("Stack after pop: " + stack); // [10, 20]

        // 4. Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty()); // false

        // 5. Get the size of the stack
        System.out.println("Stack size: " + stack.size()); // 2

        // 6. Search for an element (1-based position from top)
        int position = stack.search(10); // Position from the top
        System.out.println("Position of 10 from top: " + position); // 2 (if found), -1 (if not)

        // 7. Clear the stack
        stack.clear(); // clears all elements
        System.out.println("Stack after clear: " + stack); // []
    }
}

    



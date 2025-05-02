package Stacks;

import java.util.Stack;

public class stl {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack); // Output: [10, 20, 30]

        // Peeking the top element
        System.out.println("Top element: " + stack.peek()); // Output: 30
        

        // Popping an element
        System.out.println("Popped: " + stack.pop()); // Output: 30
        System.out.println("Stack after pop: " + stack); // Output: [10, 20]

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}


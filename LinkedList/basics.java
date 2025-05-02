package LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class basics {
    public static void main(String[] args) {
        // 1. Create a LinkedList
        LinkedList<String> animals = new LinkedList<>();

        // 2. Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        System.out.println(animals.get(0));

        // Add at specific positions
        animals.addFirst("Rabbit"); // Add at the beginning
        animals.addLast("Lion");   // Add at the end

        // Display the list
        System.out.println("Animals: " + animals); // [Rabbit, Dog, Cat, Elephant, Lion]

        // 3. Access elements
        System.out.println("First: " + animals.getFirst()); // Rabbit
        System.out.println("Last: " + animals.getLast());   // Lion
        System.out.println("Element at index 2: " + animals.get(2)); // Cat

        // 4. Update elements
        animals.set(1, "Fox"); // Replace element at index 1
        System.out.println("After update: " + animals); // [Rabbit, Fox, Cat, Elephant, Lion]

        // 5. Remove elements
        animals.remove("Cat");    // Remove by value
        animals.removeFirst();    // Remove the first element
        animals.removeLast();     // Remove the last element

        // Display the updated list
        System.out.println("Updated Animals: " + animals); // [Fox, Elephant]

        // 6. Check size and existence
        System.out.println("Size: " + animals.size()); // 2
        System.out.println("Contains Elephant? " + animals.contains("Elephant")); // true
        System.out.println("Contains Cat? " + animals.contains("Cat")); // false

        // 7. Iterate through the LinkedList
        System.out.println("Using for-each loop:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println("Using iterator:");
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 8. Clear the list
        animals.clear();
        System.out.println("Cleared List: " + animals); // []
    }
}

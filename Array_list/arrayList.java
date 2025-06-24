import java.util.ArrayList;
import java.util.Collections;
public class arrayList{
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add(1, "David"); // Adds "David" at index 1

        // Sort the ArrayList in ascending order
        Collections.sort(names);
        // Sort the ArrayList in descending order
        Collections.sort(names, Collections.reverseOrder());

        // Accessing elements
        System.out.println("First name: " + names.get(0)); // "Alice"

        // Updating elements
        names.set(1, "Eve"); // Replaces "David" with "Eve"

        // Removing elements
        names.remove(2); // Removes the element at index 2 ("Charlie")
        names.remove("Alice"); // Removes "Alice"

        // Checking the size
        System.out.println("Size of the list: " + names.size()); // 1

        // Checking if an element exists
        boolean hasBob = names.contains("Bob");
        System.out.println("Does the list contain 'Bob'? " + hasBob); // true

        // Iterating through the list
        System.out.println("Iterating through the list:");
        for (String name : names) {
            System.out.println(name);
        }

        // Clearing the list
        names.clear();

        // Checking if the list is empty
        boolean isEmpty = names.isEmpty();
        System.out.println("Is the list empty? " + isEmpty); // true

        // Other operations
        // Adding elements back to the list for further operations
        names.add("Anna");
        names.add("Bella");
        names.add("Cara");
        
        // Finding the index of an element
        int index = names.indexOf("Bella");
        System.out.println("Index of 'Bella': " + index); // 1

        // Converting to an array
        Object[] namesArray = names.toArray();
        System.out.println("Array version of the list:");
        for (Object name : namesArray) {
            System.out.println(name);
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(1);
        list.remove(list.indexOf(6));
        for(int ele : list){
            System.out.print(ele+" ");
        }        
    }
}

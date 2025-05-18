import java.util.*;

public class treeset {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // add(E e)
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20); // Duplicate, won't be added

        // Displaying elements (sorted)
        System.out.println("TreeSet: " + numbers);

        // contains(Object o)
        System.out.println("Contains 20? " + numbers.contains(20));
        System.out.println("Contains 25? " + numbers.contains(25));

        // remove(Object o)
        numbers.remove(10);
        System.out.println("After removing 10: " + numbers);

        // first(), last()
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        // higher(E e) - next greater element
        System.out.println("Element higher than 20: " + numbers.higher(20));

        // lower(E e) - previous smaller element
        System.out.println("Element lower than 30: " + numbers.lower(30));

        // ceiling(E e) - smallest ≥ e
        System.out.println("Ceiling of 25: " + numbers.ceiling(25));

        // floor(E e) - largest ≤ e
        System.out.println("Floor of 25: " + numbers.floor(25));

        // descendingSet()
        System.out.println("Descending order: " + numbers.descendingSet());

        // size()
        System.out.println("Size: " + numbers.size());

        // isEmpty()
        System.out.println("Is empty? " + numbers.isEmpty());

        // clear()
        numbers.clear();
        System.out.println("After clear(), is empty? " + numbers.isEmpty());
    }
}

package Arrays;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // Creating and initializing an array
        int numbers[] = {10, 20, 30, 40, 50};
        String names[] = new String[5]; // Array of size 5

        // Adding elements to the array
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";

        // Accessing elements in an array
        System.out.println("First element in numbers: " + numbers[0]); // 10
        System.out.println("Second element in names: " + names[1]);   // "Bob"

        // Updating elements in an array
        names[1] = "David"; // Updates the second element to "David"
        System.out.println("Updated second element in names: " + names[1]); // "David"

        // Iterating through an array
        System.out.println("Iterating through numbers array:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Iterating through names array:");
        for (String name : names) {
            if (name != null) { // To avoid null elements
                System.out.println(name);
            }
        }

        // Finding the size of an array
        System.out.println("Size of numbers array: " + numbers.length); // 5

        // Example of a multi-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Accessing elements in a 2D array:");
        System.out.println("Element at (0,0): " + matrix[0][0]); // 1
        System.out.println("Element at (2,1): " + matrix[2][1]); // 8

        // Iterating through a 2D array
        System.out.println("Iterating through 2D array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Copying an array
        int[] copiedNumbers = new int[numbers.length];
        System.arraycopy(numbers, 0, copiedNumbers, 0, numbers.length);
        System.out.println("Copied numbers array:");
        for (int num : copiedNumbers) {
            System.out.println(num);
        }

        // Array of size 20, initialized with default values (0)
        int [] brr = new int[20];    
        
        // Sorting
        int[] arr = {5, 2, 8, 1};
        Arrays.sort(arr); // arr becomes [1, 2, 5, 8]


    }
}

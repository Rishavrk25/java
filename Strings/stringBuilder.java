import java.util.Scanner;
public class stringBuilder {
    public static void main(String[] args) {
        // StringBuilder str=new StringBuilder("abc");
        // StringBuilder s=new StringBuilder(10);
        // StringBuilder s1=new StringBuilder();
        // System.out.printf("%s\n",str);
        // System.out.println(s);
        // System.out.println(s.length());
        // System.out.println(s.capacity());
        // System.out.println(s1.capacity());

        // ------------------input--------------------
        Scanner sc=new Scanner(System.in);
        String s2=sc.nextLine();
        char ch=sc.next().charAt(0);
        // StringBuilder sb=new StringBuilder(s2);
        // System.out.println(sb);

        // ----------------setCharAt()---------------
        // StringBuilder str=new StringBuilder("abc");
        // str.setCharAt(0,'A' );
        // System.out.println(str);

        // ---------------Basic methods-------------
        // Create a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append
        // sb.append(" World");
        // System.out.println(sb); // Hello World

        // // Insert
        // sb.insert(5, " Beautiful");
        // System.out.println(sb); // Hello Beautiful World

        // Replace
        // sb.replace(6, 15, "Java");
        // System.out.println(sb); // Hello Java World

        // Delete
        // sb.delete(1, 3);
        // System.out.println(sb); // Hello World

        // Delete character at index
        // sb.deleteCharAt(2);
        // System.out.println(sb); // HelloWorld

        // Reverse
        // sb.reverse();
        // System.out.println(sb); // dlroWolleH

        // Length and Capacity
        // System.out.println("Length: " + sb.length()); // 10
        // System.out.println("Capacity: " + sb.capacity()); // Initial + extra capacity

        // Ensure Capacity
        // sb.ensureCapacity(50);
        // System.out.println("New Capacity: " + sb.capacity()); // 50 or more

        // Set Length
        // sb.setLength(5);
        // System.out.println(sb); // dlroW (truncated)

        // Get Character at Index
        // char ch = sb.charAt(0);
        // System.out.println("Character at index 0: " + ch); // d

        // Set Character at Index
        // sb.setCharAt(0, 'H');
        // System.out.println(sb); // HlroW

        // // Substring
        // String sub = sb.substring(0, 3);
        // System.out.println("Substring: " + sub); // Hlr

        // // Convert to String
        // String result = sb.toString();
        // System.out.println("String: " + result); // HlroW
        
    }
}

// package Strings;
public class basics {
    public static void main(String[] args) {
        //String -> character array
        // char arr[]={'a','b','c'};
        // char brr[]=new char[5];

        // // 1. Length of a String
        // String str = "Hello, World!";
        // int length = str.length();
        // System.out.println("Length: " + length); // Output: 13

        // // 2. Access Characters
        // char ch = str.charAt(0);
        // System.out.println("First Character: " + ch); // Output: H

        // // 3. Substring
        // String substr = str.substring(7, 12); // Start inclusive, end exclusive
        // System.out.println("Substring: " + substr); // Output: World

        // // 4. Check Equality
        // String s1 = "Hello";
        // String s2 = "hello";
        // boolean isEqual = s1.equals(s2);
        // System.out.println("Equals: " + isEqual); // Output: false

        // // 5. Ignore Case in Equality
        // boolean isEqualIgnoreCase = s1.equalsIgnoreCase(s2);
        // System.out.println("Equals Ignore Case: " + isEqualIgnoreCase); // Output: true

        // // 6. Concatenate Strings
        // String s3 = s1 + " World";
        // String s4 = s1.concat(" World");
        // System.out.println("Concatenation: " + s3); // Output: Hello World
        // System.out.println("Concatenation using concat(): " + s4); // Output: Hello World

        // // 7. Replace Characters
        // String replaced = s1.replace('l', 'p');
        // System.out.println("Replaced: " + replaced); // Output: Heppo

        // // 8. Convert to Uppercase and Lowercase
        // System.out.println("Uppercase: " + s1.toUpperCase()); // Output: HELLO
        // System.out.println("Lowercase: " + s1.toLowerCase()); // Output: hello

        // // 9. Trim Whitespace
        // String strWithSpaces = "   Hello   ";
        // String trimmed = strWithSpaces.trim();
        // System.out.println("Trimmed: " + trimmed); // Output: Hello

        // // 10. Split Strings
        // String[] parts = "one,two,three".split(",");
        // for (String part : parts) {
        //     System.out.println("Split Part: " + part);
        // }

        // String s="Hello";
        // StringBuilder sb=new StringBuilder(s);
        // System.out.println(sb);
        // System.out.println(sb.getClass().getSimpleName());

        // // Output:
        // // Split Part: one
        // // Split Part: two
        // // Split Part: three

        // // 11. Check if String Contains a Substring
        // boolean contains = str.contains("World");
        // System.out.println("Contains 'World': " + contains); // Output: true

        // // 12. Check if String Starts or Ends with Something
        // boolean startsWith = str.startsWith("Hello");
        // boolean endsWith = str.endsWith("!");
        // System.out.println("Starts with 'Hello': " + startsWith); // Output: true
        // System.out.println("Ends with '!': " + endsWith); // Output: true

        // // 13. Convert to a Character Array
        // char[] chars = str.toCharArray();
        // for (char c : chars) {
        //     System.out.print(c + " ");
        // }
        // System.out.println(); // Output: H e l l o ,   W o r l d !

        // // 14. isDigit and isLetter
        // char testChar1 = '5';
        // char testChar2 = 'a';
        // System.out.println("Is Digit: " + Character.isDigit(testChar1)); // Output: true
        // System.out.println("Is Alpha: " + Character.isLetter(testChar2)); // Output: true

        // // 15. Compare Strings
        // String str1 = "Apple";
        // String str2 = "Banana";
        // int comparison = str1.compareTo(str2); // Lexicographical comparison
        // System.out.println("Comparison: " + comparison); // Output: Negative (str1 < str2)

        // // 16. Reverse a String (using StringBuilder)
        // StringBuilder sb = new StringBuilder(str);
        // String reversed = sb.reverse().toString();
        // System.out.println("Reversed: " + reversed); // Output: !dlroW ,olleH

        // // 17. isLetterOrDigit (Alphanumeric Check)
        // char testChar3 = '9';
        // char testChar4 = '@';
        // System.out.println("Is Letter or Digit (Alphanumeric): " + Character.isLetterOrDigit(testChar3)); // Output: true
        // System.out.println("Is Letter or Digit (Alphanumeric): " + Character.isLetterOrDigit(testChar4)); // Output: false

        // // 18. isWhitespace
        // char whitespace = ' ';
        // System.out.println("Is Whitespace: " + Character.isWhitespace(whitespace)); // Output: true

        // 19. indexOf
        // String str="Hello";
        // str.charAt(0)='R'; // error --> String is immutable
        // System.out.println(str.indexOf('H'));
        // System.out.println(str.lastIndexOf('l'));
        
        //20. converting int to string
        // int a=566;
        // String s=Integer.toString(a);
        // String s=a+"";
        // System.out.printf("%d",s.length());

        // 21. isUpperCase
        char ch='R';
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.toLowerCase(ch));


    } 
} 

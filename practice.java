import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

public class practice {
  public static void main(String[] args) throws IOException {
    // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // System.out.print("Enter a message: ");
    // String message = reader.readLine();
    // System.out.println("You entered: " + message);

    PrintWriter writer = new PrintWriter(System.out, true); // Corrected class name
    writer.println("Hello, Console!");
    writer.printf("Formatted number: %.2f%n", 123.456);
  }
}

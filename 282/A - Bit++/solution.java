import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of statements
        int n = scanner.nextInt();
        
        // Initialize the variable x
        int x = 0;
        
        // Loop through all statements
        for (int i = 0; i < n; i++) {
            String statement = scanner.next();
            
            // Check if the statement contains a '+'
            if (statement.contains("+")) {
                x++;
            } else {
                x--;
            }
        }
        
        // Print the final value
        System.out.println(x);
        
        // Close the scanner
        scanner.close();
    }
}
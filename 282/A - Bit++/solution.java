import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Check if there is an integer to read
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int x = 0;
            
            // Loop through all statements
            for (int i = 0; i < n; i++) {
                String statement = scanner.next();
                
                // The '+' or '-' will always be at the middle index (1)
                // for both X++ / ++X and X-- / --X
                if (statement.charAt(1) == '+') {
                    x++;
                } else {
                    x--;
                }
            }
            
            // Print the final result
            System.out.println(x);
        }
        
        scanner.close();
    }
}
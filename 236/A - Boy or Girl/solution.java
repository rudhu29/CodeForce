import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNext()) {
            String username = scanner.next();
            
            // Count the distinct characters in the username
            long distinctCount = username.chars().distinct().count();
            
            // Check if the number of distinct characters is even or odd
            if (distinctCount % 2 == 0) {
                System.out.println("CHAT WITH HER!");
            } else {
                System.out.println("IGNORE HIM!");
            }
        }
        
        scanner.close();
    }
}
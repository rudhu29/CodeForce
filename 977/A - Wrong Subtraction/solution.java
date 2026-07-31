import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read n and k
        // Since n is up to 10^9, a standard 32-bit int is perfectly sufficient
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Perform Tanya's algorithm k times
        for (int i = 0; i < k; i++) {
            if (n % 10 == 0) {
                // If the last digit is 0, divide by 10
                n /= 10;
            } else {
                // If the last digit is non-zero, subtract 1
                n -= 1;
            }
        }
        
        // Print the final result
        System.out.println(n);
        
        // Close the scanner
        scanner.close();
    }
}
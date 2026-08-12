import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the two integers M and N
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Calculate and print the maximum number of dominoes
        System.out.println((m * n) / 2);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
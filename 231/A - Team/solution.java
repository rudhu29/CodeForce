import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of problems
        int n = scanner.nextInt();
        int count = 0;
        
        // Process each problem
        for (int i = 0; i < n; i++) {
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();
            
            // If at least two friends are sure about the solution
            if (petya + vasya + tonya >= 2) {
                count++;
            }
        }
        
        // Print the total number of problems they will implement
        System.out.println(count);
        scanner.close();
    }
}
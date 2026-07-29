import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of stones
        int n = scanner.nextInt();
        // Read the string of colors
        String s = scanner.next();
        
        int removals = 0;
        
        // Loop through the string starting from the second stone
        for (int i = 1; i < n; i++) {
            // If the current stone matches the previous one, it must be removed
            if (s.charAt(i) == s.charAt(i - 1)) {
                removals++;
            }
        }
        
        // Output the total minimum removals
        System.out.println(removals);
        
        scanner.close();
    }
}
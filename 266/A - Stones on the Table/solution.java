import java.util.Scanner;
 
public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of stones
        int n = scanner.nextInt();
        
        // Read the string representing the stone colors
        String s = scanner.next();
        
        int removeCount = 0;
        
        // Iterate through the string and compare adjacent stones
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                removeCount++;
            }
        }
        
        // Print the result
        System.out.println(removeCount);
        
        scanner.close();
    }
}
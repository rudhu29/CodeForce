import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of friends
        int n = scanner.nextInt();
        
        int[] p = new int[n + 1];
        int[] giver = new int[n + 1];
        
        // Read the array where p[i] is the person who received a gift from friend i
        for (int i = 1; i <= n; i++) {
            p[i] = scanner.nextInt();
            // Friend i gave a gift to p[i], so the person who gave a gift to p[i] is i
            giver[p[i]] = i;
        }
        
        // Print the result for each friend from 1 to n
        for (int i = 1; i <= n; i++) {
            System.out.print(giver[i] + (i == n ? "" : " "));
        }
        System.out.println();
        
        scanner.close();
    }
}
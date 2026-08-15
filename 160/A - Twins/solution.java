import java.util.Arrays;
import java.util.Scanner;
 
public class Twins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            return;
        }
        
        int n = scanner.nextInt();
        int[] coins = new int[n];
        int totalSum = 0;
        
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
            totalSum += coins[i];
        }
        
        // Sort the coins in ascending order
        Arrays.sort(coins);
        
        int mySum = 0;
        int count = 0;
        
        // Pick from the largest coins (traverse from end to start)
        for (int i = n - 1; i >= 0; i--) {
            mySum += coins[i];
            count++;
            
            // Check if our sum is strictly greater than the remaining sum
            if (mySum > totalSum - mySum) {
                break;
            }
        }
        
        System.out.println(count);
        scanner.close();
    }
}
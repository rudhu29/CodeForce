import java.util.Scanner;
 
public class BalancedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
 
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = n / 2;
 
            // If k is odd, we cannot partition into equal sums
            if (k % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                StringBuilder sb = new StringBuilder();
                long sumEven = 0;
                long sumOdd = 0;
 
                // First n/2 elements: even numbers
                for (int i = 1; i <= k; i++) {
                    int val = 2 * i;
                    sb.append(val).append(" ");
                    sumEven += val;
                }
 
                // Next (n/2 - 1) elements: odd numbers
                for (int i = 1; i < k; i++) {
                    int val = 2 * i - 1;
                    sb.append(val).append(" ");
                    sumOdd += val;
                }
 
                // Last element to balance the sums
                long lastOdd = sumEven - sumOdd;
                sb.append(lastOdd);
 
                System.out.println(sb.toString());
            }
        }
        scanner.close();
    }
}
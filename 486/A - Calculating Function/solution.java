import java.util.Scanner;
 
public class CalculateFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read n as a long since n can be up to 10^15
        long n = scanner.nextLong();
        
        long result;
        if (n % 2 == 0) {
            result = n / 2;
        } else {
            result = -(n + 1) / 2;
        }
        
        System.out.println(result);
        
        scanner.close();
    }
}
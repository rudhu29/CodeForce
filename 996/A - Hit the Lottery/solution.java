import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long count = 0;
        
        long[] denominations = {100, 20, 10, 5, 1};
        for (long denom : denominations) {
            count += n / denom;
            n %= denom;
        }
        
        System.out.println(count);
    }
}
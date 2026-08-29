import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int nextPrime = n + 1;
        while (true) {
            boolean isPrime = true;
            for (int i = 2; i * i <= nextPrime; i++) {
                if (nextPrime % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                break;
            }
            nextPrime++;
        }
        
        if (m == nextPrime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
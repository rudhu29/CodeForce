import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int r = scanner.nextInt();
 
        for (int i = 1; i <= 10; i++) {
            int totalCost = i * k;
            if (totalCost % 10 == 0 || totalCost % 10 == r) {
                System.out.println(i);
                break;
            }
        }
 
        scanner.close();
    }
}
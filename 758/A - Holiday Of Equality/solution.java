import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        
        int n = scanner.nextInt();
        int[] a = new int[n];
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] > max) {
                max = a[i];
            }
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (max - a[i]);
        }
        
        System.out.println(sum);
        scanner.close();
    }
}
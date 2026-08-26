import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        int maxIndex = 0;
        int minIndex = 0;
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
            if (a[i] <= a[minIndex]) {
                minIndex = i;
            }
        }
        
        int result = maxIndex + (n - 1 - minIndex);
        if (maxIndex > minIndex) {
            result--;
        }
        
        System.out.println(result);
        scanner.close();
    }
}
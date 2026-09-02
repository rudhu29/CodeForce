import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        int min = 101;
        int maxIndex = 0;
        int minIndex = 0;
 
        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();
            if (height > max) {
                max = height;
                maxIndex = i;
            }
            if (height <= min) {
                min = height;
                minIndex = i;
            }
        }
 
        int result = maxIndex + (n - 1 - minIndex);
        if (maxIndex > minIndex) {
            result--;
        }
 
        System.out.println(result);
    }
}
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
 
        int maxWatered = 0;
 
        for (int i = 0; i < n; i++) {
            int count = 1;
            
            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] <= heights[j + 1]) {
                    count++;
                } else {
                    break;
                }
            }
            
            for (int j = i + 1; j < n; j++) {
                if (heights[j] <= heights[j - 1]) {
                    count++;
                } else {
                    break;
                }
            }
            
            if (count > maxWatered) {
                maxWatered = count;
            }
        }
 
        System.out.println(maxWatered);
    }
}
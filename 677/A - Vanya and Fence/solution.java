import java.util.Scanner;
 
public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of friends (n) and height of the fence (h)
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        
        int totalWidth = 0;
        
        // Process each friend's height
        for (int i = 0; i < n; i++) {
            int ai = scanner.nextInt();
            
            // If height exceeds fence height, width is 2; otherwise, width is 1
            if (ai > h) {
                totalWidth += 2;
            } else {
                totalWidth += 1;
            }
        }
        
        // Print the minimum possible valid width of the road
        System.out.println(totalWidth);
        
        scanner.close();
    }
}
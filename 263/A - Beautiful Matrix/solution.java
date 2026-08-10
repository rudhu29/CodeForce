import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int moves = 0;
        
        // Loop through the 5x5 matrix
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int val = scanner.nextInt();
                
                // When we find the '1', calculate its Manhattan distance to (3, 3)
                if (val == 1) {
                    moves = Math.abs(i - 3) + Math.abs(j - 3);
                }
            }
        }
        
        System.out.println(moves);
        scanner.close();
    }
}
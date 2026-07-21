import java.util.Scanner;
 
public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int implementedCount = 0;
        
        for (int i = 0; i < n; i++) {
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();
            
            // If at least two friends are sure about the solution (sum >= 2)
            if (petya + vasya + tonya >= 2) {
                implementedCount++;
            }
        }
        
        System.out.println(implementedCount);
        
        scanner.close();
    }
}
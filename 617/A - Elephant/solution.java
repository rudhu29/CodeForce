import java.util.Scanner;
 
public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        
        // Ceiling division of x / 5
        int minSteps = (x + 4) / 5;
        
        System.out.println(minSteps);
        
        scanner.close();
    }
}
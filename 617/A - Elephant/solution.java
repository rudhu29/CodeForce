import java.util.Scanner;
 
public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the coordinate of the friend's house
        int x = scanner.nextInt();
        
        // Calculate the minimum steps: equivalent to ceil(x / 5.0)
        int steps = (x + 4) / 5;
        
        // Print the result
        System.out.println(steps);
        
        scanner.close();
    }
}
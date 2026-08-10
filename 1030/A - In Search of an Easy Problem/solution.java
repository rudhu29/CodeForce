import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of people
        int n = scanner.nextInt();
        
        boolean isHard = false;
        
        // Read each person's opinion
        for (int i = 0; i < n; i++) {
            int response = scanner.nextInt();
            if (response == 1) {
                isHard = true;
            }
        }
        
        // Output the result based on the opinions
        if (isHard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
        
        scanner.close();
    }
}
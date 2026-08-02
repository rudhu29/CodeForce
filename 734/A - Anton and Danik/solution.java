import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of games
        int n = scanner.nextInt();
        
        // Read the string of game outcomes
        String s = scanner.next();
        
        int antonWins = 0;
        int danikWins = 0;
        
        // Count the wins for both Anton and Danik
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                antonWins++;
            } else if (s.charAt(i) == 'D') {
                danikWins++;
            }
        }
        
        // Compare the results and print the winner
        if (antonWins > danikWins) {
            System.out.println("Anton");
        } else if (danikWins > antonWins) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
        
        scanner.close();
    }
}
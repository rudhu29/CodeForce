import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of words
        if (!scanner.hasNextInt()) {
            return;
        }
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            int length = word.length();
            
            // Check if the word is strictly longer than 10 characters
            if (length > 10) {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(length - 1);
                int middleCount = length - 2;
                
                // Print the abbreviation
                System.out.println("" + firstChar + middleCount + lastChar);
            } else {
                // Print the original word if it's not too long
                System.out.println(word);
            }
        }
        
        scanner.close();
    }
}
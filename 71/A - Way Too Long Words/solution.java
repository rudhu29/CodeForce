import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of words
        int n = scanner.nextInt();
        
        // Loop through each word
        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            
            // Check if the word is strictly longer than 10 characters
            if (word.length() > 10) {
                // Get the first character
                char first = word.charAt(0);
                // Get the last character
                char last = word.charAt(word.length() - 1);
                // Calculate the number of characters between the first and last
                int middleCount = word.length() - 2;
                
                // Print the abbreviation
                System.out.println("" + first + middleCount + last);
            } else {
                // Print the word as it is
                System.out.println(word);
            }
        }
        
        scanner.close();
    }
}
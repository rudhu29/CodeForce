import java.util.Scanner;
 
public class StringTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string and convert it to lowercase immediately
        if (scanner.hasNext()) {
            String s = scanner.next().toLowerCase();
            
            // Use StringBuilder for efficient string concatenation inside a loop
            StringBuilder result = new StringBuilder();
            
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                
                // Check if the character is a consonant (not a vowel)
                if (c != 'a' && c != 'o' && c != 'y' && 
                    c != 'e' && c != 'u' && c != 'i') {
                    
                    // Append the dot and the consonant
                    result.append('.');
                    result.append(c);
                }
            }
            
            // Print the final resulting string
            System.out.println(result.toString());
        }
        
        scanner.close();
    }
}
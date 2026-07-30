import java.util.Scanner;
 
public class WordCorrection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input word
        if (scanner.hasNext()) {
            String s = scanner.next();
            
            int upperCount = 0;
            int lowerCount = 0;
            
            // Count uppercase and lowercase letters
            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    upperCount++;
                } else {
                    lowerCount++;
                }
            }
            
            // Apply Vasya's rules
            if (upperCount > lowerCount) {
                System.out.println(s.toUpperCase());
            } else {
                System.out.println(s.toLowerCase());
            }
        }
        
        scanner.close();
    }
}
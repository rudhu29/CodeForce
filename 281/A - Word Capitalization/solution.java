import java.util.Scanner;
 
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String word = scanner.next();
        
        // Capitalize the first letter and keep the rest unchanged
        String result = Character.toUpperCase(word.charAt(0)) + word.substring(1);
        
        System.out.println(result);
        
        scanner.close();
    }
}
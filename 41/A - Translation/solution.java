import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the two words
        String s = scanner.next();
        String t = scanner.next();
        
        // Reverse the first word using StringBuilder
        String reversedS = new StringBuilder(s).reverse().toString();
        
        // Check if the reversed string matches t
        if (reversedS.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
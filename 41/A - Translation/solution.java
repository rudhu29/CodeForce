import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.next();
        String t = scanner.next();
        
        // Reverse string s and check if it equals t
        String reversedS = new StringBuilder(s).reverse().toString();
        
        if (reversedS.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
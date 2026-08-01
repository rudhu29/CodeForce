import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number as a String to easily iterate through its digits
        if (scanner.hasNext()) {
            String n = scanner.next();
            int luckyCount = 0;
            
            // Count the occurrences of '4' and '7'
            for (int i = 0; i < n.length(); i++) {
                char digit = n.charAt(i);
                if (digit == '4' || digit == '7') {
                    luckyCount++;
                }
            }
            
            // Check if the count of lucky digits is a lucky number (4 or 7)
            if (luckyCount == 4 || luckyCount == 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
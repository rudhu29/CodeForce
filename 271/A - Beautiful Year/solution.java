import java.util.Scanner;
 
public class DistinctYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        
        while (true) {
            year++; // We need a year strictly larger than the given one
            if (hasDistinctDigits(year)) {
                System.out.println(year);
                break;
            }
        }
        
        scanner.close();
    }
    
    // Helper method to check if a 4-digit year has all unique digits
    private static boolean hasDistinctDigits(int year) {
        int a = year / 1000;         // Thousands digit
        int b = (year / 100) % 10;   // Hundreds digit
        int c = (year / 10) % 10;    // Tens digit
        int d = year % 10;           // Units digit
        
        // Compare every digit with each other
        return a != b && a != c && a != d &&
               b != c && b != d &&
               c != d;
    }
}
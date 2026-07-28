import java.util.Scanner;
 
public class BearAndBigBrother {
    public static int yearsToppingBrother(int a, int b) {
        int years = 0;
        
        while (a <= b) {
            a *= 3;
            b *= 2;
            years++;
        }
        
        return years;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading inputs a and b
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            System.out.println(yearsToppingBrother(a, b));
        }
        
        scanner.close();
    }
}
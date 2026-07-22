import java.util.Scanner;
 
public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int w = scanner.nextInt();
        
        // The watermelon can be divided into two even parts if and only if 
        // the weight is even and greater than 2.
        if (w > 2 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
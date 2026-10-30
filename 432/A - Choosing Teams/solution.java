import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int eligibleCount = 0;
        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            if (y <= 5 - k) {
                eligibleCount++;
            }
        }
        
        System.out.println(eligibleCount / 3);
        sc.close();
    }
}
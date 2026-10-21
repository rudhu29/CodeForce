import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.close();
 
        int max = Math.max(y, w);
        int favorable = 6 - max + 1;
        int denominator = 6;
 
        if (favorable == 0) {
            System.out.println("0/1");
        } else if (favorable == 6) {
            System.out.println("1/1");
        } else {
            int gcd = gcd(favorable, denominator);
            System.out.println((favorable / gcd) + "/" + (denominator / gcd));
        }
    }
 
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
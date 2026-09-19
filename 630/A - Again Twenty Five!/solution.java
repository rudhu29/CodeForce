import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextBigInteger()) {
            scanner.nextBigInteger();
        }
        System.out.println(25);
    }
}
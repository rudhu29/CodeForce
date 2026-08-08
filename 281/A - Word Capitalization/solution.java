import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String word = scanner.next();
            // Capitalize the first letter and concatenate the rest of the string
            String result = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            System.out.println(result);
        }
        scanner.close();
    }
}
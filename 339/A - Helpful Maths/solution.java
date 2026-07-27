import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) {
            return;
        }
        String s = scanner.nextLine().trim();
        if (s.isEmpty()) {
            return;
        }
        
        // Split the string by '+' to extract individual numbers
        String[] parts = s.split("\\+");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        
        // Sort the numbers in non-decreasing order
        Arrays.sort(numbers);
        
        // Build the resulting string back with '+'
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
            if (i < numbers.length - 1) {
                sb.append("+");
            }
        }
        
        System.out.println(sb.toString());
    }
}
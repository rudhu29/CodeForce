import java.util.Arrays;
import java.util.Scanner;
 
public class HelpMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String s = scanner.nextLine();
        
        // Split the string by '+' to extract the individual numbers
        String[] numbers = s.split("\\+");
        
        // Sort the array of numbers in ascending order
        Arrays.sort(numbers);
        
        // Join the sorted numbers back together with '+'
        String result = String.join("+", numbers);
        
        // Print the rearranged sum
        System.out.println(result);
        
        scanner.close();
    }
}
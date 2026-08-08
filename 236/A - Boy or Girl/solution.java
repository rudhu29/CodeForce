import java.util.Scanner;
import java.util.HashSet;
 
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine().trim();
        scanner.close();
        
        // HashSet to store unique characters
        HashSet<Character> distinctChars = new HashSet<>();
        
        // Loop through the string and add each character to the HashSet
        for (char c : username.toCharArray()) {
            distinctChars.add(c);
        }
        
        // Check if the number of unique characters is even or odd
        if (distinctChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
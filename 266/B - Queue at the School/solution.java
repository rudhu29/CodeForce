import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        // Create a scanner to read the input
        Scanner scanner = new Scanner(System.in);
        
        // Read n (number of children) and t (time in seconds)
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        
        // Read the initial arrangement of the queue
        String s = scanner.next();
        
        // Convert the string to a character array so we can easily swap elements
        char[] queue = s.toCharArray();
        
        // Simulate the queue changes for 't' seconds
        for (int time = 0; time < t; time++) {
            // Loop through the queue
            for (int i = 0; i < n - 1; i++) {
                // If a Boy is standing in front of a Girl, swap them
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    queue[i] = 'G';
                    queue[i + 1] = 'B';
                    
                    // Skip the next person because this Boy just moved back one spot,
                    // and we don't want to move him again in the exact same second.
                    i++;
                }
            }
        }
        
        // Print the final arrangement after t seconds
        System.out.println(new String(queue));
        
        scanner.close();
    }
}
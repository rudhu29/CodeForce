import java.util.Scanner;
 
public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read n (number of children) and t (time in seconds)
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        
        // Read the initial arrangement string
        String s = scanner.next();
        char[] queue = s.toCharArray();
        
        // Simulate the process for t seconds
        for (int time = 0; time < t; time++) {
            for (int i = 0; i < n - 1; i++) {
                // If there is a boy at position i and a girl at position i + 1, swap them
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    char temp = queue[i];
                    queue[i] = queue[i + 1];
                    queue[i + 1] = temp;
                    // Skip the next position to avoid double-moving the same boy in the same second
                    i++; 
                }
            }
        }
        
        // Print the final arrangement
        System.out.println(new String(queue));
        
        scanner.close();
    }
}
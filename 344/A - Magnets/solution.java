import java.util.Scanner;
 
public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of magnets
        int n = scanner.nextInt();
        
        // Read the first magnet
        String prevMagnet = scanner.next();
        int groupCount = 1; // At least one group exists if n >= 1
        
        // Loop through the remaining magnets
        for (int i = 1; i < n; i++) {
            String currentMagnet = scanner.next();
            
            // If the current magnet is different from the previous one, it's a new group
            if (!currentMagnet.equals(prevMagnet)) {
                groupCount++;
            }
            
            // Update the previous magnet for the next iteration
            prevMagnet = currentMagnet;
        }
        
        scanner.close();
        
        // Output the total number of groups
        System.out.println(groupCount);
    }
}
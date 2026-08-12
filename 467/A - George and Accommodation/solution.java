import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of rooms
        int n = scanner.nextInt();
        int availableRooms = 0;
        
        // Loop through each room
        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt(); // People currently in the room
            int q = scanner.nextInt(); // Total capacity of the room
            
            // Check if there is room for both George and Alex (at least 2 spaces)
            if (q - p >= 2) {
                availableRooms++;
            }
        }
        
        // Print the total count of valid rooms
        System.out.println(availableRooms);
        
        scanner.close();
    }
}
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int currentPassengers = 0;
        int maxCapacity = 0;
        
        for (int i = 0; i < n; i++) {
            int exiting = scanner.nextInt();
            int entering = scanner.nextInt();
            
            // Passengers leave first, then new passengers enter
            currentPassengers = currentPassengers - exiting + entering;
            
            // Track the maximum number of passengers in the tram at any time
            if (currentPassengers > maxCapacity) {
                maxCapacity = currentPassengers;
            }
        }
        
        System.out.println(maxCapacity);
        scanner.close();
    }
}
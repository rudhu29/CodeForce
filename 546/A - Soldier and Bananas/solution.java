import java.util.Scanner;
 
public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Use long to prevent potential overflow, 
        // although int suffices for the given constraints.
        long k = sc.nextLong();
        long n = sc.nextLong();
        long w = sc.nextLong();
        
        // Calculate total cost using the sum formula: k * (w * (w + 1) / 2)
        long totalCost = k * (w * (w + 1) / 2);
        
        // Calculate the amount to borrow
        long borrow = totalCost - n;
        
        // If borrow is negative, he doesn't need to borrow any money
        if (borrow < 0) {
            System.out.println(0);
        } else {
            System.out.println(borrow);
        }
        
        sc.close();
    }
}
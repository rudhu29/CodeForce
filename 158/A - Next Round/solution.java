import java.util.Scanner;
 
public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Read the scores
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        
        // The score of the k-th place finisher (using 0-based indexing: k - 1)
        int kthScore = scores[k - 1];
        int count = 0;
        
        // Count participants who meet the criteria
        for (int i = 0; i < n; i++) {
            if (scores[i] >= kthScore && scores[i] > 0) {
                count++;
            }
        }
        
        // Output the result
        System.out.println(count);
        
        scanner.close();
    }
}
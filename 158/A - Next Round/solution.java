import java.util.Scanner;
 
public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        
        // The score of the k-th place finisher (1-indexed, so index is k-1)
        int kthScore = scores[k - 1];
        int advancedCount = 0;
        
        for (int i = 0; i < n; i++) {
            // Must have a score >= k-th place score AND score > 0
            if (scores[i] >= kthScore && scores[i] > 0) {
                advancedCount++;
            }
        }
        
        System.out.println(advancedCount);
        
        scanner.close();
    }
}
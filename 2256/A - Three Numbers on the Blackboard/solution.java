import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        String line = reader.readLine();
        if (line == null || line.trim().isEmpty()) return;
        
        int t = Integer.parseInt(line.trim());
        while (t-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            long[] arr = new long[3];
            arr[0] = Long.parseLong(tokenizer.nextToken());
            arr[1] = Long.parseLong(tokenizer.nextToken());
            arr[2] = Long.parseLong(tokenizer.nextToken());
            
            Arrays.sort(arr);
            
            // If the largest number c <= a + b, we can't reduce it further to improve range
            // Otherwise, we can replace c with a + b, making the numbers (a, b, a+b).
            // The range becomes (a + b) - a = b, or more generally, we check the minimum span.
            // Actually, the minimum range of three numbers under this operation is always:
            // min possible range between adjacent elements or similar. 
            // Let's look closely: 
            // If we can replace max with sum of other two, the differences are b-a and c-a. 
            // The minimum range is always min(c - a, b - a + something)? 
            // Wait, let's check standard solution: 
            // Answer is min(arr[2] - arr[0], arr[1] + arr[2] - arr[0]...) 
            // Actually, since we can replace the largest element with the sum of the other two, 
            // the operation allows us to always achieve a range of min(arr[2] - arr[0], arr[1] - arr[0] + ... )
            // Wait, let's use the simplest condition: 
            // arr[2] can be reduced as long as arr[2] > arr[0] + arr[1].
            // If we keep doing it, the values stabilize. 
            // Let's implement the simulation or direct formula:
            
            long ans = arr[2] - arr[0];
            // Try reducing the max element
            long newMax = arr[0] + arr[1];
            if (newMax < arr[2]) {
                arr[2] = newMax;
                Arrays.sort(arr);
                ans = Math.min(ans, arr[2] - arr[0]);
            }
            
            out.println(ans);
        }
        out.flush();
    }
}
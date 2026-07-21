import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class KevinAndBinaryStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
 
        StringBuilder out = new StringBuilder();
 
        while (t-- > 0) {
            String s = br.readLine().trim();
            int n = s.length();
 
            // One substring can always be the entire string s (from index 1 to n)
            int l1 = 1, r1 = n;
 
            // Find the first '0' in the string
            int firstZeroIdx = -1;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    firstZeroIdx = i;
                    break;
                }
            }
 
            // If there are no zeros, any substring of length 1 (e.g., index 1 to 1) paired with the whole string works
            if (firstZeroIdx == -1) {
                out.append("1 1 1 ").append(n).append("
");
                continue;
            }
 
            // The length of the prefix we want to align against is the number of remaining characters after the first '0'
            int len = n - firstZeroIdx;
 
            // We want to find a substring of length `len` that maximizes the XOR when compared to s[firstZeroIdx ... n-1].
            // To do this greedily, we look for a starting position `i` (0-indexed) such that s[i] matches the prefix bits, 
            // but more importantly, we want to find a spot where we can XOR with zeros or flip bits advantageously.
            // Specifically, a standard strategy is to test all possible starting positions `i` for a substring of length `len` 
            // and pick the one that gives the lexicographically largest result when XORed, or more simply:
            // Match the block starting at `firstZeroIdx` with a block of the same length starting at `i`.
            
            // Let's iterate through all possible starting positions `i` (0-indexed) for the second substring of length `len`
            // and compare which one produces the best binary string after XOR.
            int bestI = 0;
            String bestXor = "";
 
            for (int i = 0; i <= firstZeroIdx; i++) {
                // Substring from i to i + len - 1
                StringBuilder candidate = new StringBuilder();
                for (int j = 0; j < len; j++) {
                    char c1 = s.charAt(firstZeroIdx + j);
                    char c2 = s.charAt(i + j);
                    candidate.append(c1 == c2 ? '0' : '1');
                }
                String currentXor = candidate.toString();
                if (currentXor.compareTo(bestXor) > 0) {
                    bestXor = currentXor;
                    bestI = i;
                }
            }
 
            int l2 = bestI + 1;
            int r2 = bestI + len;
 
            out.append(l1).append(" ").append(r1).append(" ").append(l2).append(" ").append(r2).append("
");
        }
 
        System.out.print(out);
    }
}
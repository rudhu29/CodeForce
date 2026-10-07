import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
 
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            line = br.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = br.readLine();
            }
            if (line == null) break;
 
            st = new StringTokenizer(line);
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());
 
            long annaMoves = a + (c + 1) / 2;
            long katieMoves = b + c / 2;
 
            if (annaMoves > katieMoves) {
                sb.append("First
");
            } else {
                sb.append("Second
");
            }
        }
 
        System.out.print(sb);
    }
}
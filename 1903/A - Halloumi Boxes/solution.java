import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
 
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
 
            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
 
            if (k >= 2) {
                sb.append("YES
");
            } else {
                boolean sorted = true;
                for (int i = 0; i < n - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        sorted = false;
                        break;
                    }
                }
                sb.append(sorted ? "YES
" : "NO
");
            }
        }
        System.out.print(sb);
    }
}
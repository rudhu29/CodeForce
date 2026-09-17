import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());
 
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int availableOfficers = 0;
        int untreatedCrimes = 0;
 
        for (int i = 0; i < n; i++) {
            int event = Integer.parseInt(tokenizer.nextToken());
 
            if (event == -1) {
                if (availableOfficers > 0) {
                    availableOfficers--;
                } else {
                    untreatedCrimes++;
                }
            } else {
                availableOfficers += event;
            }
        }
 
        System.out.println(untreatedCrimes);
    }
}
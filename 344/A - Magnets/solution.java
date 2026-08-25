import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        
        int groups = 0;
        String prev = "";
        
        for (int i = 0; i < n; i++) {
            String current = reader.readLine();
            if (!current.equals(prev)) {
                groups++;
                prev = current;
            }
        }
        
        System.out.println(groups);
    }
}
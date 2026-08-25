import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String s = reader.readLine();
        
        HashSet<Character> letters = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            letters.add(Character.toLowerCase(s.charAt(i)));
        }
        
        if (letters.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
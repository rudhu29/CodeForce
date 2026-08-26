import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int luckyCount = 0;
 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '4' || c == '7') {
                luckyCount++;
            }
        }
 
        if (luckyCount == 4 || luckyCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String guest = sc.next();
        String host = sc.next();
        String pile = sc.next();
        
        char[] combined = (guest + host).toCharArray();
        char[] pileArr = pile.toCharArray();
        
        Arrays.sort(combined);
        Arrays.sort(pileArr);
        
        if (Arrays.equals(combined, pileArr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
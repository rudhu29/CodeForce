import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] x = new long[4];
        for (int i = 0; i < 4; i++) {
            x[i] = sc.nextLong();
        }
 
        Arrays.sort(x);
 
        long s = x[3];
        long a = s - x[0];
        long b = s - x[1];
        long c = s - x[2];
 
        System.out.println(a + " " + b + " " + c);
    }
}
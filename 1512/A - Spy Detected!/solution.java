import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            int majority;
            if (a[0] == a[1] || a[0] == a[2]) {
                majority = a[0];
            } else {
                majority = a[1];
            }
 
            int spyIndex = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] != majority) {
                    spyIndex = i + 1;
                    break;
                }
            }
 
            System.out.println(spyIndex);
        }
        sc.close();
    }
}
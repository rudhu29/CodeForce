import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String s = sc.next();
        char[] chars = s.toCharArray();
 
        boolean allUpper = true;
        boolean firstLowerRestUpper = true;
 
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isUpperCase(chars[i])) {
                allUpper = false;
            }
            if (i == 0) {
                if (!Character.isLowerCase(chars[i])) {
                    firstLowerRestUpper = false;
                }
            } else {
                if (!Character.isUpperCase(chars[i])) {
                    firstLowerRestUpper = false;
                }
            }
        }
 
        if (allUpper || firstLowerRestUpper) {
            for (int i = 0; i < chars.length; i++) {
                if (Character.isUpperCase(chars[i])) {
                    chars[i] = Character.toLowerCase(chars[i]);
                } else {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            }
        }
 
        System.out.println(new String(chars));
    }
}
package ClassWork;

import java.util.Scanner;

public class camelCase {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) { //surajkumar   surajKumar
            String s = in.next();
            String p = s.toUpperCase();
            System.out.println(p);
            int l = s.length();
            int ans = 1;
            for (int i = 0; i < l; i++) {
                if (p.charAt(i) == s.charAt(i)) ans++;
            }
            
            System.out.println(ans);
        }
    }
}
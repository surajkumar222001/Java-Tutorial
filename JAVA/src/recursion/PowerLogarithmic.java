package recursion;

import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int result = powerLog(x, n);
        System.out.println(result);
        scn.close();
    }

    public static int powerLog(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnb2 = powerLog(x, n/2);
        int xn = xnb2 * xnb2;
        if(n % 2 == 1){
          xn = xn * x;
        }
 
        return xn;
    }
}

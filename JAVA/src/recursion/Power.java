package recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
       int result = XpowerN(x,n);
       System.out.println(result);
        scn.close();
    }

    public static int XpowerN(int x, int n){
       if(n == 0){
        return 1;
       }
        int xn = XpowerN(x,n-1);
        int result = xn * x;
        return result;
    }

}

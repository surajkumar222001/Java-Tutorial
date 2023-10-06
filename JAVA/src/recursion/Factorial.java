package recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       int result = factorial(n);
       System.out.println(result);
        scn.close();
    }

    public static int factorial(int n){
      if(n == 1){
        return 1  ;
      }
       int fac =  factorial(n-1);
      int result = n * fac ;
      return result;
    }
}

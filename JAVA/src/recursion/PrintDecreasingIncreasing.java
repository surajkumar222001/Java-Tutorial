package recursion;

import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDeacreasingIncreasing(n);
        scn.close();

    }

    public static void printDeacreasingIncreasing(int n ){
       if(n == 0 ){
        return;
       }
        System.out.println(n);
        printDeacreasingIncreasing(n-1);
        System.out.println(n);

    }
}

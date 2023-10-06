package recursion;

import java.util.Scanner;

class PrintDecreasing {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            printDecreasing(n);
        }
    }

    public static void printDecreasing(int n){
        // base condition (low level thinking)  Try Run , Stack bano ,  find base case
      if (n == 0){
        return;
      }
      // self work 
      System.out.println(n);
      // high level thinking(recursion call) expection bano , faith bano , meet EF
      printDecreasing( n-1);
    }
}
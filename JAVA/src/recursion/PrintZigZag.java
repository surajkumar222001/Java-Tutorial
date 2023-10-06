package recursion;

import java.util.Scanner;

public class PrintZigZag {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();
        scn.close();
        print(n);
    }


    public static void print(int n){
        if(n==0){
            return;
        }
      System.out.println("Pre" + n);
      print(n-1);// left call
      System.out.println("In" + n) ;
      print(n-1); // right call 
      System.out.println("Post" + n);
    }
}

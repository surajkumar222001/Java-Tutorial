package Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
             int n = scn.nextInt();
             int val=1;
             for(int i=1 ; i<=n ; i++){
                for(int j=1 ; j<=i ; j++){
                    System.out.print(val + " ");
                    val++;
                }
                System.out.println();
               
             }
        }
    }
}

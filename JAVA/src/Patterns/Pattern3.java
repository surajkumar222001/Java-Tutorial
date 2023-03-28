package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        try(Scanner scr = new Scanner(System.in)){
            System.out.println("Enter the number");
            int n = scr.nextInt();
            int space = n-1 , star = 1;
            for(int i = 1 ; i <= n ; i++){
                for(int j=1 ; j<=space ; j++){
                    System.out.print("  ");
                }
                for(int j =1 ; j <=star ; j++){
                    System.out.print("* ");
                }
                star++;
                space--;
                System.out.println(" ");
            }
        }
    }
}

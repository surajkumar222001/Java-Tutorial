package Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        try(Scanner scn = new Scanner(System.in)){
            int n = scn.nextInt();
            for(int i = n ; i>0 ; i--){
              for(int j = i ; j>0 ; j--){
                System.out.print("*  ");
              }
              System.out.println(" ");
            }
        }
        
        


    }
}

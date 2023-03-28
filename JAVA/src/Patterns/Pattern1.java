package Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            char cha = '*';
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print(cha + "    ");
                }
                System.out.println(" ");
            }
        }
    }
}

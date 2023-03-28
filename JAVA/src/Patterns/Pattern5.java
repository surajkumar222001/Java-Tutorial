package Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            System.out.println("Enter Number(Odd) : ");
            int n = scn.nextInt();
            int space = n/2 , star = 1 ;
            for(int i=1;i<=n;i++){
               for(int j=1; j<=space ; j++){
                System.out.print("\t"); 
               }
               for(int j =1 ; j<=star ; j++) {
                System.out.print("*\t");
               }
               if(i<=n/2){
                  star +=2;
                  space--;
               }else{
                star -=2;
                space++;
               }
               System.out.println();
            }
        }

    }
}

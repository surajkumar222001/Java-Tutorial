package Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
           int n = scn.nextInt();
           for(int i=1 ; i <=n ; i++){
                 for(int j=1 ; j<=i ; j++ ){
                    if(j == i){
                       System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                 }
                 System.out.println();
           }
        }
    }
}

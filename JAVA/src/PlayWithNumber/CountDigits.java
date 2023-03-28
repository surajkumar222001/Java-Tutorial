package PlayWithNumber;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
           int n = scn.nextInt();
           int d=0;
           while(n != 0){
            n=n/10;
            d++;
           }
           System.out.println(d);
        }
    }
}

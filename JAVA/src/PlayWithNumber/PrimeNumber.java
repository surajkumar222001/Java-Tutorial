package PlayWithNumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in))
        {
           int t = scn.nextInt();
           for(int i=1 ; i<=t ; i++){
            int n = scn.nextInt();
            int count = 0 ;
            for(int div=2; div*div<=n;div++){
                if(n % div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0 && n != 1){
                System.out.println("Prime Number");
            }else{
                System.out.println("Not Prime Number");
            }
           
        
           }
           



        }
    }
}

package PlayWithNumber;

import java.util.Scanner;

public class PrintDigitsInNumber {
    public static void main(String[] args){
    try(Scanner scn = new Scanner(System.in)){
      int n = scn.nextInt();
      int temp = n;
      int d=0;
      while( temp != 0){
        temp=temp/10;
        d++;
      }

      int div = (int)Math.pow(10, d-1);
      while(div != 0 ){
          int q = n/div;
          System.out.println(q);
          n = n%div;
          div=div/10;
      }
    }
    }
}

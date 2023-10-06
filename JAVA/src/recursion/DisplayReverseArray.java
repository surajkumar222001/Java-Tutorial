package recursion;

import java.util.Scanner;

public class DisplayReverseArray {
    public static void main(String[] args){
 
         try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] arr = new int[n];
          for(int i=0 ; i<n ; i++){
            arr[i] = scn.nextInt();
          }
          System.out.println("\n");
          displayReverse(arr, 0);
        }
    }

    public static void displayReverse(int[] arr, int idx){
        if(idx == arr.length)
        return;
      displayReverse(arr, idx + 1 );
      System.out.println(arr[idx]);
    }
}

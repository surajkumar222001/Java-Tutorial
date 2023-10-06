package recursion;

import java.util.Scanner;

import Array.array;

public class DisplayArrayElement {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] arr = new int[n];
          for(int i=0 ; i<n ; i++){
            arr[i] = scn.nextInt();
          }
          display(arr, 0);
        }
    }

    public static void display(int[] arr , int idx){
        while(idx >= arr.length){
            return;
        }
          System.out.println(arr[idx]);
          display(arr, idx + 1);
    }
}

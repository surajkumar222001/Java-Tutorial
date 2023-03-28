package ClassWork;

import java.util.Scanner;

public class Exp_3_1 {
    public void requiredPalindrom(String s){
       int start = 0 , end = 0;
       for(int i =0 ; i < s.length() ; i++){
        int len1 = expandFromCentre(s,i,i+1);
        int len2 = expandFromCentre(s,i,i);
        int len = Math.max(len1, len2);
        if(end-start < len){
            start = i - (len-1)/2;
            end = i + len/2;
        }
       }
      
        System.out.println(s.substring(start, end+1));
    }

    public int expandFromCentre (String s , int i , int j){
       while(i>=0  && j < s.length() && s.charAt(i) == s.charAt(j)){
         i--;
         j++;
       }
       return j-i-1;
    }
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
         Exp_3_1 string = new Exp_3_1();
         string.requiredPalindrom(scn.nextLine());
        }
        
    }
}

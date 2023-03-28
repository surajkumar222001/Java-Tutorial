package ClassWork;

import java.util.Scanner;

public class palindrome {

    void longestPalindrome(String str){
        int palindromeLength = 0; 
        int from = 0;
        int last = 0;
      for(int i = 0 ; i < str.length() ; i++){
        from = i;
         for(int j = i+1 ; j <= str.length();){  
          if(str.charAt(i) == str.charAt(j)){
            last = j;
            j++;
          }
          else{
            String subStr = str.substring(from, last);
            palindromeLength = subStr.length();
          }  
         }
      }

      //String requiredString = str.substring(from, last-1);
      //System.out.println(requiredString);
    }

    public static void main(String[] args) {
        try( Scanner scn = new Scanner(System.in)){
           String str = scn.nextLine();
           palindrome palindrome = new palindrome();
           palindrome.longestPalindrome(str);
        }
    }
    
}
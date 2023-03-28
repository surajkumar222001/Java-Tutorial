package ClassWork;

import java.util.Scanner;

public class StrongPassword {

    public static void minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
           int num = 0 , sym = 0 , lowerCase = 0 , uppercase = 0 ;
           for(int i = 0 ; i < n ; i++){
               if(password[i] >= 'A' && password[i] <='Z') uppercase = 1;
               else if( password[i] >= 'a'&& password[i] <='z') lowerCase = 1;
               else if(password[i] >= '0' && password[i] <= '9') num = 1;
               else sym = 1;
           }
            int requiredChar = 4 - (num + sym + lowerCase + uppercase);
            if(n<6) {
                 System.out.println(Math.max(n-6 ,requiredChar ));;
            }
             System.out.println(requiredChar);;
        }
    
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            String password = scn.next();
            StrongPassword.minimumNumber(n, password);
        }

    }
}

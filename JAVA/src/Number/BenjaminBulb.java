import java.util.Scanner;

class BenjaminBulb{
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
          int n = scn.nextInt();
          isOnBulb(n);

        }
    }
   
    static void isOnBulb(int n){
        for(int i=1 ; i*i <=n  ; i++){
            if(i*i <= n){
                System.out.println(i*i);
            }
        }
    }
  
}
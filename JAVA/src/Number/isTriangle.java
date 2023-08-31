import java.util.Scanner;

public class isTriangle {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int s1 = scn.nextInt();
            int s2 = scn.nextInt();
            int s3 = scn.nextInt();
              System.out.println(findTraingle(s1, s2, s3));
        } 

        
    }

   static boolean findTraingle(int a , int b , int c){
   
   int max = a;
   if(b > max){
    max = b;
   }

   if(c > max){
    max = c;
   }

   if(max == a){
    return  ((a*a) == (b*b + c*c));
   }else if( max == b){
    return ((b*b) == (a*a + c*c));
   }else{
       return ((c*c) == (b*b + a*a));
   }


   
   }
}

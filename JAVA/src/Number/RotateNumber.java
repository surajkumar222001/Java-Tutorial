import java.util.Scanner;

class RotateNumber{
 public static void main(String[] args) {
    Scanner scn =new Scanner(System.in);
    int num = scn.nextInt();
    int k = scn.nextInt();
    System.out.println(k + " " + num);
   int rotatedNum = rotateNum(num, k);
   System.out.println("rotatedNumber" + " " + rotatedNum );

 }

 static int rotateNum(int num , int k){
   int digitNum = 0;
   int temp = num;
   int divisor= 1;
   int mult = 1;
   while(temp > 0){
      temp = temp/10;
      digitNum++;
   }
   k = k%digitNum;
   if(k<0){
    k += digitNum;
   }

   for(int i=0 ; i < digitNum ; i++){
    if(i < k){
         divisor = divisor * 10;
      }else{
         mult = mult * 10;
      }
   }
   int r = num % divisor;
   int q = num/divisor;
   int rotatedNum = r*mult + q; 
  return rotatedNum;
 }
}
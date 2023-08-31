import java.util.Scanner;

class ReverseNumber{
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int num = scn.nextInt();
           int result = reverseNumber(num);
           System.out.println(result);
        }
        
    }

    static int reverseNumber(int num){
      int dig = 0;
      int result = 0;
      int temp = num;
      while(temp > 0){
         temp= temp/10;
         dig++;
      }

        int placeDigit ;
      for(int i=dig ; i > 0  ; i--){
          placeDigit = num%10;
          result += (int) (placeDigit * Math.pow(10, i-1));
          num = num/10;
      }

        return result;
    }
}
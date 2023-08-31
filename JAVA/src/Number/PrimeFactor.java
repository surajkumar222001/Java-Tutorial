import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
           int num = scn.nextInt();
           primeFactor(num);
        }
    }

    static void primeFactor(int num){
        for(int i=2 ; i * i <= num ; i++){
            while (num % i == 0) {
                num = num/i;
                System.out.println(i);
            }
        }

        if(num != 1){
            System.out.println(num);
        }
    }
}

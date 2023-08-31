    import java.util.Scanner;

    class GcdAndLcm{
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
            int gcd = gcd2Num(n1, n2);
            int lcm = lcm2Num(n1, n2);
            System.out.println(gcd);
            System.out.println(lcm);
        }
    }

    static int gcd2Num(int n1 , int n2){
        
        while(n1 % n2 != 0){
        int rem = n1%n2;
        n1 = n2;
        n2 = rem;
        }

        return n2;
    }

    static int lcm2Num(int n1, int n2){
    return (n1*n2)/gcd2Num(n1, n2);
    }

    }
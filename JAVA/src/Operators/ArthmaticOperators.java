package Operators;

public class ArthmaticOperators {
    public static void main(String[] args) {
        // adding ( + )
        int result = 1 + 2 ;
        System.out.println("1 + 2 = " + result);

        // sub(-)
        int orignal_result = result;
        result = result - 1;
        System.out.println(orignal_result + " - 1 = " + result);

        // multiplication(*)

        orignal_result = result;
        result = result * 4;
        System.out.println(orignal_result + " * 4  = " + result);

        // divide(/)

        orignal_result = result ;
        result = result/2;
        System.out.println(orignal_result + " /2 = " + result);

        // remainder(%)
        orignal_result = result;
        result = result % 3 ;
        System.out.println(orignal_result + " % 3 = " + result);

    }
}

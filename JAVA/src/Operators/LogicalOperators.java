package Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int val1 = 5 , val2 = 10;
        if((val1 == 5) && (val2 == 10)) System.out.println("val is equal to 5 and val2 is equal to 10");

        if((val1 == 5) || (val2 == 11)) System.out.println("val1 is equal to 5 or val2 is equal to 5");



        //ternary operator
       int result = (val1 == 5) ? val1 : val2;
       System.out.println(result);
    }
}

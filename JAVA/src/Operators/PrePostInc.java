package Operators;

public class PrePostInc {

    public static void main(String[] args) {
        int i = 5;
        System.out.println(i);
        //post increment(first assign then increase)
        i++;
        System.out.println(i);
        // pre increament(first increase then assign)
        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);

    }
}
package If_else;

public class NestedIfElse {
    public static void main(String[] args) {
        int i = 50;
        if (i == 50) {
            System.out.println("i is equal to " + i);
            if (i < 75) {
                System.out.println( " i is less than 75");
                if (i < 55) {
                    System.out.println( " i is also less than 55");
                }
            }
        }
    }
}

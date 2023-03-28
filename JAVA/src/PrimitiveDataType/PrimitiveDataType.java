package PrimitiveDataType;


public class PrimitiveDataType {
    public static void main(String[] args) {
        char a = 'S';  // 2 bytes
        byte b = 12;   // 1byte = 8 bits range 2^8 (-128, 0  to +127)
        short c = 23;  // 2 bytes
        int d = 22 ;   // 4 bytes
        float e = 12.687f;  // 4 bytes
        boolean g = false;   // 1 bit
        double h = 23.67890d;  // 8 bytes
        long l = 2134546789l;  // 8 bytes
        
        System.out.println("char " + a);
        System.out.println("byte " + b);
        System.out.println("short " + c);
        System.out.println("int " + d);
        System.out.println("float " + e);
        System.out.println("double " + h);
        System.out.println("long " + l);
        System.out.println("boolean " + g);
        System.out.println("End data Type ");
        
    }
}

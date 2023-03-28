package DataTypeConversion;

public class explicitDataTypeConvrsion {
    public static void main(String args[]) {
       double a = 50.555;
       System.out.println("Double Repersentation : " + a);
       
       float f = (float) a;
       System.out.println("float Repersentation : " +f);  // type casting

       long b = (long) f;
       System.out.println("Long Repersentation : " +b); 

       int c = (int) b;
       System.out.println("Int Repersentation : " +c); 

    }
}

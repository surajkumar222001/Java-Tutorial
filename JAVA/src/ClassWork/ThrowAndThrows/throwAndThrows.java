package ClassWork.ThrowAndThrows;

public class throwAndThrows {

    public static int  divide(int a , int b) throws ArithmeticException {
       int c = a/b;
        return  c ;
    }

    public static double  area(int r) throws NegativeException{
        if(r < 0 ) {
           throw new NegativeException();
        }
        double c = Math.PI * r * r ; 
         return  c ;
     }
   
    public static void main(String[] args) {
         try{
           // int c = divide(4, 0);
            double c =  area(2);
            System.out.println(c);
         }
         catch(Exception e){
            System.out.println("error" + e);
         }
    }
}
 


class NegativeException extends Exception {
    public String toString() {
       return ("Radiud not be negative");
    }

    public String toMessage() {
        return ("Radiud not be negative");
    }
}

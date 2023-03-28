package PrimitiveDataType;
public class NonPrimitiveDataType {
    public static void main(String[] args) {
        String str = "Suraj Kumar";
        System.out.println("String is : " + str);


        String str1 = new String("Suraj kumar");
        System.out.println("Another String :" +  str1);


        int arr[];
         arr = new int[2];
        arr[0] = 3;
        arr[1] = 4 ;
        System.out.println(arr);
        System.out.println(arr[0]);
    }
}

package Array;

public class OneDimenArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};   // size not define
        int arr1[] = new int[4];
        System.out.println(arr1.length);
        // put elements
        arr1[0] = 5;
        System.out.println("Element at index 0 :" + arr1[0]);
        System.out.println("Element at index 0 :" + arr[0]);
    }
}

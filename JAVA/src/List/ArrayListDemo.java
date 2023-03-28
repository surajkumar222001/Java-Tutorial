// dynamic array;
// Elements in an ArrayList are actually objects. In the examples above, we created elements (objects)
//  of type "String". Remember that a String in Java is an object (not a primitive type). To use other 
//  types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types,
//   use: Boolean for boolean, Character for char, Double for double, etc:

package List;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ArrayListDemo{
    public static void main(String[] args) {
        List<Integer> carPrice = new ArrayList<Integer>(5);
        // add elements
        carPrice.add(0,23);
        carPrice.add(1, 22);
        carPrice.add(2, 21);

        carPrice.add(40);
        carPrice.add(50);
        carPrice.add(60);

        for(int i = 0 ; i <=10 ; i++) 
        carPrice.add(i);

        // printing arrayList
         System.out.println(carPrice);

        // Remove element at index 4;
        carPrice.remove(4);
        System.out.println(carPrice);

        // displaying elements one by one 
        for(int element : carPrice){
            System.out.print(element + " ");
        }

        for(int i=0; i < carPrice.size() ; i++){
            System.out.print(carPrice.get(i) + "   ");
        }
        System.out.println("");
        // Access a item  use get() method and refer to index number
        System.out.println(carPrice.get(4) + "Access an elements ");

        //change/update an item using set() method and refer to index number
        System.out.println(carPrice + "Previous state");
        System.out.println(carPrice.set(5, 100) + " Updated at index 5");

        //remove an item using remove() method
        System.out.println(carPrice + "Previous state");
        carPrice.remove(5);
        System.out.println(carPrice + "after removing element at index 5 ");

        //ArrayList size using size() method
        carPrice.size();

        //Another useful class in the java.util package is the Collections class, 
        //which include the sort() method for sorting lists alphabetically or numerically:

        Collections.sort(carPrice);
        System.out.println(carPrice + " sort arrayList");

        // clear all object of arrayList using clear() method

        carPrice.clear();
        System.out.println(carPrice);



       
    }

    
};
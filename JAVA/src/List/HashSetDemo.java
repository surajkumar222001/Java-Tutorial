package List;
//A HashSet is a collection of items where every item is unique

import java.util.HashSet;

public class HashSetDemo {
   
    public static void main(String[] args) {
       HashSet<String> cars = new HashSet<String>();  
       // adding elements/objects
       cars.add("Volvo");
    cars.add("BMW");
   boolean result = cars.add("Ford");
   System.out.println(result);
     result = cars.add("BMW");
    System.out.println(result);
    cars.add("Mazda");
    
    System.out.println(cars);

     System.out.println(cars.contains("BMW"));
     // for remove
     System.out.println(cars.remove("BMW"));
      
     cars.add("BMW");
     cars.add("MERCH");
     cars.add("ROYELS");
     System.out.println(cars);

     //size
     System.out.println(cars.size());
    
    //itirates
     for(String i : cars){
        System.out.println(i);
     }

     // clear()
     cars.clear();
     System.out.println(cars);

     

    }
}

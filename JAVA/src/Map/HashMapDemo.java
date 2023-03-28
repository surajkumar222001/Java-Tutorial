package Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

    public static void main(String[] args) {
        //map with name person
        HashMap< String , Integer> person = new HashMap<>();

        // add object as Key/value pair
        person.put("John", 22);
        person.put("Calten", 23);
        person.put("Suraj", 32);
        person.put("Reshmi", 12);

        System.out.println(person);
        System.out.println("-----------------------------------------------");
        //size of map
        System.out.println("size of Map " +person.size());
        System.out.println("-----------------------------------------------");

        // Access an element or key object

        System.out.println(person.get("Suraj"));
        System.out.println("-----------------------------------------------");


        // Checking Key is available or not

        System.out.println(person.containsKey("Reshmi"));
        System.out.println("-----------------------------------------------");

        // itrating map using  forEach() loop

        for(String key : person.keySet()){
            System.out.println("value of key" + key +" : " + person.get(key));
        }
        System.out.println("-----------------------------------------------");

        // for loop using Entry

        // for( Entry<String , Integer> entry : person.entrySet());
        // {
        //     System.out.println("Key" + entry.getKey() + " ,  Value : " + entry.getValue());
        // }

        System.out.println(person.entrySet());

        // remove() , clear()

        Integer ret = person.remove("John");
        System.out.println(ret);

        System.out.println(person.remove("Suraj"));
        // clear
         person.clear();
         System.out.println(person);





    }
    
}
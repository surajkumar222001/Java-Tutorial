package Map;

import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMapDemo
 */
public class TreeMapDemo {

    public static void main(String[] args) {
        Map<Integer , String> Tree = new TreeMap<>();

        // add elements put();
        System.out.println("--------------------------------------");
        Tree.put(3, "Suraj");
        Tree.put(2, "Rahul");
        Tree.put(5, "Ritanshu");
        Tree.put(1, "Pankaj");
        Tree.put(4, "Reshmi");
        System.out.println(Tree);
        System.out.println("--------------------------------------");

        // Access an element or key object

        System.out.println(Tree.get(1));

        System.out.println("--------------------------------------");

        //Checking Key is available or not

        System.out.println(Tree.containsKey(6));

        System.out.println("--------------------------------------");

        // itrating map using  forEach() loop

        for(Integer i : Tree.keySet()){
            System.out.println("Key : " + i + " Value : " + Tree.get(i));
        }

        System.out.println("--------------------------------------");
        // values()
        System.out.println(Tree.values());

        // remove() , clear()
        


    }
}
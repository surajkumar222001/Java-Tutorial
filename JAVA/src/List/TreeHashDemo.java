package List;

import java.util.TreeSet;

public class TreeHashDemo {
    public static void main(String[] args) {
        // treeSet is use to store data with their natural order(A , B, C......)
        // sort 
        TreeSet<String>  Cars = new TreeSet<>();

        // adding elements
        Cars.add("AA");
        Cars.add("AB");
        Cars.add("AC");
        Cars.add("BA");
        Cars.add("BB");
        Cars.add("BC");

        System.out.println(Cars);

        // itrating as same as HashSet 
        // remove() , Clear() , Size()
        System.out.println(Cars.contains("AB"));

        System.out.println(Cars.first() + Cars.last());

       

    }
}

package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class FilterDemo {
    public static void main(String[] args) {
        List<String> language = new ArrayList<>();
        // add objects;
        language.add("Java");
        language.add("Python");
        language.add("MongoDb");
        language.add("ReactJS");
        language.add("JavaScript");
        System.out.println("Original Language List : " + language);

        List<String> filterResult = new ArrayList<String>();
        
        // Methode 1 forEach loop
        for(String i : language){
            if(i.startsWith("M")){filterResult.add(i);}  
        }

        System.out.println("Method 1 Filter Result : " + filterResult);

        // Method 2 using stream() filter()

        filterResult = language.stream().filter(i -> i.startsWith("M") || i.startsWith("R")).collect(Collectors.toList());
        System.out.println("Method 2 Filter Result : " + filterResult);
    }
}

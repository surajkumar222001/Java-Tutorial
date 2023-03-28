package Stream;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {

        int n = 5;
      for(int i= 1; i <=n ; i++ ){
        System.out.println();
      }
      System.out.println("--------------List----------");
        //List

        // List<Integer> List = new ArrayList<Integer>();
        // List.add(10);
        // List.add(20);
        // List.add(30);
        // List.add(40);
        // System.out.println("Original list : " + List);

    // first method square the each element of list ;
    // List<Integer> squareList = new ArrayList<Integer>();
    // for(Integer i: List ){
    //     squareList.add(i*i);
    // }
    //  System.out.println(" Method 1 Square List : " + squareList);

     //second method using Stream() map()

    //    squareList = List.stream().map(i -> i*i).collect(Collectors.toList());
    //   System.out.println("Method 2 Square list of list :  " + squareList);
     


       n = 5;
      for(int i= 1; i <=n ; i++ ){
        System.out.println();
      }

      System.out.println("---------------------SET-------------------------");
      
      Set<Integer> setNum = new HashSet<Integer>();
       
      // add element 
      setNum.add(10);
      setNum.add(20);
      setNum.add(30);
      setNum.add(40);
      System.out.println("Original setNumber : " + setNum);

      // First methode using for each loop 

      Set<Integer> squareSetNum = new HashSet<Integer>();
      //add elements
      for(Integer i : setNum){
        squareSetNum.add(i*i);
      }
      System.out.println(" Method 1 : Square Set Number :  " + squareSetNum);


      // Second Method using Stream()

      squareSetNum = setNum.stream().map(i -> i*i).collect(Collectors.toSet());
      System.out.println(" Method 2 : Square Set Number :  " + squareSetNum);
      


      
    }
}

package ClassWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;


public class SetOfCard {
    static List<Integer> cardValue = new ArrayList<Integer>();
    static TreeMap<String,List<Integer>> cards = new TreeMap<String,List<Integer>>();
    

    // Insert Card Info
    public static void InsertCard (int cardNumber , Scanner scn) { 
     for(int i = 1 ; i <= cardNumber ; i++){
         System.out.println("Enter card " + i );
         String symb = scn.next();
         int num = scn.nextInt();
         if (!cards.containsKey(symb)) {
              cardValue = new ArrayList<Integer>();
             cardValue.add(num);
             cards.put(symb, cardValue);
         }
         else{ 
             List<Integer> cardInteger =cards.get(symb);
             cardInteger.add(num);
             cards.put(symb, cardInteger);
         }
       }
    }
    // Distinct Cards
    public static void distinct () {
        System.out.println("Distinct Symbols are :");
        for(String i : cards.keySet()){
            System.out.print( i + " ");
           } 
           System.out.println();
      }
    //  Cards Infomation 
    public static void cardList() {
        for(String i : cards.keySet()){
            int sum = 0;
            System.out.println("Cards in "+ i + "  Symbol");
            for(Integer j : cards.get(i)){
                System.out.println( i + " " + j);
                sum += j; 
            }
            // no of cards
            System.out.println("Number of cards : " + cards.get(i).size());
            // sum of numbers
            System.out.println("Sum of Numbers : " + sum);
           } 
    }
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter Number of Cards:");
            int cardNumber = scn.nextInt();
            SetOfCard.InsertCard(cardNumber , scn);
            SetOfCard.distinct();
            SetOfCard.cardList();
    
        }
    }
    
}
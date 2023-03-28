package ClassWork;
import java.util.*;
class Card {
     char symbol;
     Integer number;
     void insert(Integer num,char symb){
        number=num;
        symbol=symb;
    }
    
    char get_symbol(){
        return symbol;
    }       
    
    Integer get_num(){
        return number;
    }

    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            Set<Card> cardInfo = new HashSet<Card>();
            while(true){
            if (cardInfo.size() == 4) {
                scn.close();
                break;
            }
            System.out.println("Enter  a  card:"); 
            Card card = new Card();
            char symbol = scn.next().charAt(0);
            int num = scn.nextInt();
            card.insert(num ,symbol);
           if (!cardInfo.contains(card)){
            cardInfo.add(card);
           }
                                     
           }
           System.err.println("Four symbols gathered in  cards.");
            System.out.println("Cards in Set are : ");
            for(Card card : cardInfo){
                System.out.println(card.get_symbol() + " " + card.get_num());
            }         
         }                      
        }
    }













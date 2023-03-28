package ClassWork;


import java.util.LinkedList;
import java.util.Scanner;


public class Exp2_3 {

    public static void main(String[] args) {
        list stringList = new list();
        int choice;
        boolean status = true;
        
            while(status){
                System.out.println("1. Insert");
                System.out.println("2. Search");
                System.out.println("3. Delete");
                System.out.println("4. Display");
                System.out.println("5. Exit ");
                System.out.println("Enter the choose : ");
                Scanner scn = new Scanner(System.in);
                choice = scn.nextInt();
        switch (choice) {
                    case 1:
                       System.out.println("Enter the item to be inserted:");
                       String elemeString = scn.next();
                       stringList.Insert(elemeString);
                       break;

                    case 2 :
                    System.out.println("Enter the item to search : ");
                        String serachElement = scn.next();
                        stringList.Search(serachElement);
                        break;
                        
                    case 3 :
                    System.out.println("Enter the item to delete : ");
                       String deleteElement = scn.next();
                       stringList.Delete(deleteElement);
                       break;
                         
                    case 4 :
                    System.out.println("The Items in the list are :");
                        stringList.Display();
                        break;
                          
                    case 5 :
                        stringList.exit();
                        break;

                    default:
                    System.out.println("Enter Correct Choose");
                        break;
                   }
                
               }
        
    }
}

class list{
    LinkedList<String> list = new LinkedList<String>();
    // insert
    void Insert(String element){
      list.add(element);
      if(list.contains(element)) {
        System.out.println("Inserted successfully");
       }
    }

    //Search
    void Search(String element){
        boolean result = list.contains(element);
                    if(!result){
                        System.out.println("Item not found in the list.");
                    }else{
                        System.out.println("Item  found in the list.");
                    }
    
    }

    //Delete
    void Delete( String deleteElement){
        boolean isDelet = list.remove(deleteElement);
                      if(isDelet){
                        System.out.println("Item Deleted successfully");
                      }else{
                        System.out.println("Item not in list");
                      }
    }

    //display
    void Display(){
        for(String element : list){
            System.out.println(element);
         }
    }

    //exit
    public void exit() {
        System.exit(0);
    }
}

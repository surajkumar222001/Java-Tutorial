package List;


/**
 * LinkedList
 */
import java.util.LinkedList;;


public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        //add objects using add() method
        list.add("suraj");
        list.add("Rahul");
        list.add("Ritanshu");
        list.add("Reshmi");
        list.add("Pankaj");
        //print
        System.out.println(list);

        // add object using index 

        list.add(5,"KOTA");
        System.out.println(list);
        // System.out.println(list.size());

        // addFirst() , addLast() , removeFirst() , removeLast()

        list.addFirst("gubjsbnajsbafjab chadubdchawuh");
        list.addLast("bcsdjhasj");
        System.out.println(list);
        
        // getFirst() getLast()
        
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.remove();
        System.out.println(list);
        list.remove();
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(2));
        // clear()
        list.clear();
        System.out.println(list);
    }
}
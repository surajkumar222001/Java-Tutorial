package Stacks ;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * QueuesDemo
 */
public class QueuesDemo {

    public static void main(String[] args) {
        //FIFO arrangmnent
        Queue<String> person = new PriorityQueue<>();
        // add objects
        person.add("Z");
        person.add("C");
        person.add("A");
        person.add("D");
        person.add("B");
        
        
        System.out.println("Original Queue : " + person);
        //removing object to get Natural sort of Alphabates
        boolean rest = person.remove("D");
        System.out.println(rest);
        // poll()
        String rest1 = person.poll();
        System.out.println(rest1);
        System.out.println(person);
        //offer()
        boolean rest3 = person.offer("M");
        System.out.println(rest3);
        System.out.println(person);
        //size()
         System.out.println(person.size());
         //contains or not
         System.out.println(person.contains("A"));

         // iterate using iterator() method

         Iterator<String> iterate = person.iterator();
         while(iterate.hasNext()) {
             System.out.print(iterate.next());
             System.out.print(", ");
         }


    }
}
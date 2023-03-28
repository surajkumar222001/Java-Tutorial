package Stacks;

import java.time.Period;
import java.util.Stack;

public class StacksDemo {
   public static void main(String[] args) {
    Stack<String> person = new Stack<>();
    // adding objects using push();

    person.push("Suraj");
    person.push("Reshmi");
    person.push("Rahul");
    person.push("Ritanshu");
    person.push("Pankaj");
    System.out.println("Original Stack : " + person);
    System.out.println("-----------------------------------");
    String rest = person.pop();
    System.out.println("Afetr pop() methode stacks look like " + person);
    System.out.println(rest);
    System.out.println("-----------------------------------");
    String rest1 = person.peek();
    System.out.println(rest1);
    System.out.println(person);
    // Inserts the specified element at the specified position in this Vector.
    // Shifts the element currently at that position (if any) and any subsequent 
    //elements to the right (adds one to their indices).
    person.add(1, "pankaj");
    System.out.println(person);
    // size()
    System.out.println(person.size());
    System.out.println(person.contains("pankaj"));
    



   }
}

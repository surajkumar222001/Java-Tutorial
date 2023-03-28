package ClassWork;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exp1Question {
      public static void main(String[] args) {
     try(Scanner scn = new Scanner(System.in)){
      System.out.println("Enter the index no : ");
      int n = scn.nextInt();
      List<String> courses = new LinkedList<String>();
      // adding elements 
      courses.add("HTML");
      courses.add("CSS");
      courses.add("BOOTSTRAP");
      courses.add("JAVASCRIPT");
      courses.add("NODE");
      courses.add("EXPRESS");
      courses.add("MONGO DB");
      courses.add("REACT");
      courses.add("BLOCKCHAIN");
      System.out.println("Original courses " + courses);
      // removing element from specific location
      String removeElement = courses.remove(n);
      System.out.println("Removed Element at index No  " + n + " : " + removeElement);
      System.out.println("Updated Courses : " + courses);
     }
      
      }
    
}
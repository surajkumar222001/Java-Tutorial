package ClassWork;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exp2_4 {
    public static void main(String[] args) {
        // create a file;
        File file = new File("Employees.txt");
        Employee employees = new Employee();
        try {
            file.createNewFile();
            System.out.println("created");
        } catch (Exception e) {
            e.printStackTrace();
        }
        int choice;
        while (true) {
        System.out.println("MAIN MENU");
        System.out.println("1.Add an Employee :");
        System.out.println("2.Display All :");
        System.out.println("3.Exit");
        Scanner sc = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                System.out.println();  
                System.out.print("Enter Employee Name: ");     
                String name = str.nextLine();
                System.out.println();
                System.err.print("Enter Employee Age: ");
                int age = sc.nextInt();
                System.out.println();
                System.out.print("Enter Employee Salary:");
                int salary = sc.nextInt();
                employees.addEmp(id, name, age, salary, file);
                break;
            }
            case 2: {
                employees.displayAll(file);
                break;
            }
            case 3: {
                employees.exit();
                break;
            }
        
            default: {
                System.out.println("Wrong input!!");
            }
        }
    }
  }
}

class Employee{
   

    void addEmp(int empID , String name , int age , int salary, File file){
        try (FileWriter employeesDetails = new FileWriter(file,true)) {
         employeesDetails.write(empID + " " + name + " " + age+ " " + salary + "\n");
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
    }

    void displayAll(File file){
    try {
        try (FileReader employees = new FileReader("Employees.txt")) {
            Scanner scn = new Scanner(file);
            while(scn.hasNextLine()){
                String empDetails = scn.nextLine();
                System.out.println(empDetails );
            }
            scn.close();
            
        }
        
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    void exit(){
        System.exit(0);
    }
}

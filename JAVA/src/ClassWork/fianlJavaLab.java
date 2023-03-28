package ClassWork;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fianlJavaLab {
    public static void main(String[] args) {
        // create a file;
        File file = new File("newFile.txt");
        newFile newFile = new newFile();
        try {
            file.createNewFile();
            System.out.println("created");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        }
    }
  

class newFile{
   

    void addNewFile(String str){
        try (FileWriter newfile = new FileWriter(file,true)) {
            newfile.write( str + "\n");
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
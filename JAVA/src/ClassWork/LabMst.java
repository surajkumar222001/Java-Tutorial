package ClassWork;

import java.util.Scanner;

public class LabMst {
   public static void main(String[] args) {
    try(Scanner scn = new Scanner(System.in)){
       while (true) {
      System.out.println("Enter file ");
      String file = scn.nextLine();
      int index = file.indexOf(".");
      String fileType = file.substring(index + 1 , file.length());
      if(fileType.length() > 3 ){
          fileType = file.substring(file.length() - 4);
      }
      else fileType = file.substring(index + 1 , file.length());
       if(fileType.equals("pdf")){
        System.out.println("It is a pdf file") ;
       }
       else if (fileType.equals("jpg")) {
        System.out.println("It is a jpg file") ;
       }
       else if(fileType.equals("png")){
        System.out.println("It is a png file") ;
       }
       else if(fileType.equals("jpeg")){
         System.out.println("It is a jpeg file") ;
        } else {
        System.out.println("Enter correct file Extension");
        }
       }
    }
   }
}

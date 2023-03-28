package ClassWork;
import java.util.Scanner;
public class Exp1 {
	public static void main(String[] args) {
		try (Scanner obj = new Scanner(System.in)) {
            String str[][]=new String[][] {
            	{"1001","Suraj","1/04/2009","R&D","e","20000","8000","3000"},
            	{"1002","Ritanshu"," 23/08/2012","PM","c","30000","12000","9000"},
            	{"1003","Rahul ","12/11/2008","Acct","k","10000","8000","1000"},
            	{"1004","Pankaj","29/01/2013","Front","r","12000","6000","2000"},
            	{"1005","Himanshu","16/07/2005","Engg","m","50000","20000","20000"},
            	{"1006","Janmejay"," 1/1/2000","Manufracturing","e","23000","9000","4400"},
            	{"1007","Reshmi"," 12/06/2006","PM","c","29000","4000","10000"},	
            };		
   String str1[][]=new String[][] {
            {"e","Engineer","20000"},
            {"c","Consultant","32000"},
            {"k","Clerk","12000"},
            {"r","Receptionist","15000"},
            {"m","Manager","40000"},
   };
   System.out.println("Enter the id"); 
   String id=obj.next();
   int temp=-1;
   for(int i=0;i<str.length;i++){
            if(str[i][0].equals(id)) {
            	temp=i; 
            	break;
            }}
            if(temp==-1) {
            	System.out.println("There is no such id is present");
            }
            	else {
            		System.out.println("Emp no\tEmp name\tDepartment \tDesignation \tSalary");
            	System.out.print(str[temp][0]+"\t"+str[temp][1]+"\t"+str[temp][3]+"\t");
 int salary=Integer.parseInt(str[temp][5])+Integer.parseInt(str[temp][6])+Integer.parseInt(str1[temp][2])-Integer.parseInt(str[temp][7]);
                  for(int j=0;j<str1.length;j++) {
            		if(str1[j][0].equals(str[temp][4])) {
                      System.out.print(str1[j][1]+"\t\t");
                      }
                }
                  System.out.print(salary);
            	}
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
	}
}
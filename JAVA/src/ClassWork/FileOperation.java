package ClassWork;
import java.io.*;
import java.util.HashSet;

  
public class FileOperation
{
    public static void main(String[] args) throws IOException 
    {
        PrintWriter pw = new PrintWriter("output.txt"); 
        BufferedReader br = new BufferedReader(new FileReader("20BCS7966.txt"));   
        String line = br.readLine();  
        HashSet<String> hs = new HashSet<String>(); 
        while(line != null)
        {
            if(hs.add(line)){
                pw.println(line); 
            }else{
                System.out.println(line);
            }         
            line = br.readLine();     
        }      
        pw.flush();     
        br.close();
        pw.close();     
    }
}
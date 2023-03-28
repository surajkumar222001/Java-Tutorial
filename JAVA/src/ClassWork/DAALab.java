package ClassWork;


import java.util.HashMap;


public class DAALab {
      
        public static void main(String[] args) {  
            int  givenArray[] = new int [] {5,7,2,1,6,5,1,2,7,5};   
            HashMap< Integer , Integer> frequency = new HashMap<>(); 
            int taken = -1;  
            for(int i = 0; i < givenArray.length; i++){  
                int count = 1;  
                for(int j = i+1; j < givenArray.length; j++){  
                    if(givenArray[i] == givenArray[j]){  
                        count++;  
                        givenArray[j] = taken ;  
                    }  
                }  
               
                frequency.put(givenArray[i], count) ; 
            }  
            
            System.out.println(frequency.entrySet());
            
        }

    }
    


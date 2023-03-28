package If_else;

public class if_else {
    public static void main(String[] args) {
        int score = 74;
        char grade;
        if(score >= 90){
            grade = 'A';
        } else if(score >= 80){
            grade = 'B' ;
        } else if(score >= 70){
            grade = 'C' ;
        } else if(score >= 60){
            grade = 'D' ;
        } else if(score >= 50){
            grade = 'E' ;
        } else {
            grade = 'F' ;
        }
        System.out.println("Grade = " + grade);
    }
    
}

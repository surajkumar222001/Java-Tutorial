package Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student student = new Student("", 0, "");
        student.setName("Suraj");
        student.setAge(21);
        student.setAddress("15 omega city kharar , Chandigarh mohali punjab ");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
    }
}

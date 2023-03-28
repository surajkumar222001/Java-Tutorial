package ClassAndConstructure;

public class Student {
    public static void main(String[] args) {
        Student suraj = new Student("SURAJ Kumar", "15c", 22);
        System.out.println(suraj.getName());
        System.out.println(suraj.getAddress());
        System.out.println(suraj.getAge());
        suraj.setAge(40);
        System.out.println(suraj.getAge());
        System.out.println(suraj);
    }
//  object properties 
    String name , address;
    int age;

    public  Student (String name , String address , int age){
      this.name = name;
      this.age = age;
      this.address = address;
    }

 // creating methods to set properties
  
   public void setName(String name){
      this.name = name;
   };

   public void setAge(int age){
    this.age = age;
    };

  public void setAddress(String address){
    this.address = address;
  };


// creating method to get properties
  public String getName(){
    return this.name;
  };



  public int getAge(){
    return this.age;
  };



  public String getAddress(){
    return this.address;
  };
  


}

public class Student{
    String name;
    int age;

    public Student(){
        this("Ravi");
        System.out.println("Default Constructor ");
    }
  
    public Student(String name){
        this("Suman",32);
        this.name=name;
        System.out.println("1 parameter constructor called");
    }
      public Student(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("Two parameter constructor");
        
    }
    public static void main(String[] args) {
        Student s1=new Student();
    }
}
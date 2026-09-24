class Animal{
    void eating(){
        System.out.println("Animal can eat");
    }
    void sleeping(){
        System.out.println("Animal can sleep");
    }
    void live(){
        System.out.println("Animals are live");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks ...");
    }
}
public class inheritanceDemo {
    public static void main(String[] args) {
    Dog obj1= new Dog();
    obj1.eating();
    }
}
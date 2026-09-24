class SS{
    String name;
    static String clgName=" Techno College Hooghly";

    static {
        System.out.println("Static block 1");
    }
    static{
        System.out.println("Static block 2");
    }
    SS(){
        System.out.println("Default constructor called");
    }
    {
        System.out.println("Initializer block 1");
    }
    {
        System.out.println("Initializar block 2");
    }
    public static void m1(){
        System.out.println("M1 static function is called ");
    }
    public void m2(){
        m1();
        System.out.println("M2 function is called ");
    }
    public SS(String name) {
        this.name = name;
        System.out.println("Object created ");
    }

}
public class blockExecution {
    public static void main(String[] args) {
        SS obj1= new SS("Manu");
        SS obj2= new SS("Sanu");
        obj1.m2();
        obj2.m2();
        obj1.m1();
    }
}
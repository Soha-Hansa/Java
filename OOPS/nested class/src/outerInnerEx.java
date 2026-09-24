//Demo of nested class
/* type 1 : To access outer class => instance variable
class Outer{
    int x;
    Outer(int x){
        this.x=x;
    }
    static class Inner{
        void fun(Outer out){
            System.out.println(out.x);
        }
    }
} */
public class outerInnerEx {
    public static void main(String[] args) {
    Outer obj1= new Outer(12);
    Outer.Inner obj2= new Outer.Inner();
    obj2.fun(obj1);
    }
}
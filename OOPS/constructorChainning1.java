class ctructorOver{
    String name;
    int roll;
    int age;
    String clgName;

    ctructorOver(){
        this("unknown",0,0,"Unknown");
    }
    ctructorOver(String name){
        this(name,0,0,"Unknown");
    }
    ctructorOver(String name, int roll){
       this(name,roll,0,null);
    }
    ctructorOver(String name, int roll, int age){
        this(name,roll,age,null);
    }
    ctructorOver(String name, int roll, int age, String clgName){
        this.name=name;
        this.roll=roll;
        this.age=age;
        this.clgName=clgName;
    }
}
public class constructorChainning1 {
    public static void main(String[] args) {
        ctructorOver obj1= new ctructorOver();
        ctructorOver obj2= new ctructorOver("Asu");
        ctructorOver obj3= new ctructorOver("Pratul",12);
        System.out.println(obj2.name);
        System.out.println(obj2.clgName);
        System.out.println(obj1.name+" "+obj1.roll+" "+obj1.age+" "+obj1.clgName);
    }
}
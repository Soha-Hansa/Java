class S{
    String name;
    static String clgName=" Techno College Hooghly";

    public S(String name) {
        this.name = name;
    }
}
public class staticKeywordDemonstaration {
    public static void main(String[] args) {
    S obj1= new S("Mini");
    S obj2 = new S("Siuli");
    System.out.println("Printing with objectname: "+obj2.clgName);
    //types to access variable define with static keyword
    //System.out.println(clgName);
    System.out.println("Printing with className: "+S.clgName);

    //modyfying
        obj1.clgName="Supreme";
        System.out.println("Student 1: "+obj1.clgName);
        System.out.println("Student 2: "+obj2.clgName);
    }
}
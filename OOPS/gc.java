 class Stu{
    private String name;
     private  int age;
    public Stu(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("Object created");
    }
    /*Getter and Setter*/
    public String getName(){
        return this.name;
     }
     public int getAge(){
        return this.age;
     }
  /*public void print(){
      System.out.println(this.name + " age is  " + this.age);
    }*/
     public void setAge(int age){
         if(age<0) return; //validation
         this.age=age;
     }
    }


public class gc {
    public static void main(String[] args) {
        Stu s1= new Stu("Ratul",20);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}

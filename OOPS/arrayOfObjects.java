import java.util.Scanner;
class Studentt{
    String name;
    int age;
    long phoneNo;

    Studentt(){

    }
    Studentt(String name, int age, long phoneNo){
        this.name=name;
        this.age=age;
        this.phoneNo=phoneNo;
    }
}
public class arrayOfObjects{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("How many record you want to enter: ");
        int n=sc.nextInt();
        sc.nextLine();
        Studentt arr[]= new Studentt[n];
        System.out.println("Collecting Details of Student: ");
        for(int i=0;i<n;i++) {
            arr[i] = new Studentt();
            System.out.println("Enter name of Student "+ (i+1)+": ");
            arr[i].name=sc.nextLine();
            System.out.println("Enter age: ");
            arr[i].age=sc.nextInt();
            System.out.println("Enter phone No");
            arr[i].phoneNo=sc.nextLong();
            sc.nextLine();
        }
        System.out.println("The records are: ");
        for(int i=0;i<n;i++){
            System.out.println("Name: "+arr[i].name);
            System.out.println("Age: "+arr[i].age);
            System.out.println("Phone NO: "+arr[i].phoneNo);
            System.out.println();
        }

    }
}
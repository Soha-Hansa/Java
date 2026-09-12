import java.util.Scanner;
public class inputOutput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of elements you want to insert: ");
        int n=sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the elements you want to insert: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i=0;i<n;i++){
           System.out.println(arr[i]+" ");
        }
        sc.close();
    }
}
